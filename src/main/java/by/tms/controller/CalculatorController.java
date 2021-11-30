package by.tms.controller;

import by.tms.dao.ResultDAO;
import by.tms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private ResultDAO resultDAO;

    @GetMapping("/processing")
    public String test() {
        return "calculator";
    }

    @PostMapping("/processing")
    public String calc(@RequestParam("num1") double num1, @RequestParam("num2") double num2,
                       @RequestParam("action") String action, Model model, HttpSession session) {
        double result = 0;
        switch (action) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "multi":
                result = num1 * num2;
                break;
            case "div":
                result = num1 / num2;
                break;
        }
        User user = (User) session.getAttribute("user");
        resultDAO.addResult(user.getId(), num1, num2, result, action);
        model.addAttribute("result", result);
        return "calculator";
    }

    @GetMapping("/history")
    public String getResult(HttpSession session, HttpServletRequest req) {
        User user = (User) session.getAttribute("user");
        req.setAttribute("list", resultDAO.getListResultsById(user.getId()));
        return "history";
    }
}