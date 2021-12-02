package by.tms.controller;

import by.tms.dao.ResultDAO;
import by.tms.entity.Result;
import by.tms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private ResultDAO resultDAO;

    @GetMapping
    public String test() {
        return "calculator";
    }

    @PostMapping
    public String calc(Result result, Model model, HttpSession session) {
        result.setResult(0);
        switch (result.getAction()) {
            case "plus":
                result.setResult(result.getNum1() + result.getNum2());
                break;
            case "sub":
                result.setResult(result.getNum1() - result.getNum2());
                break;
            case "multi":
                result.setResult(result.getNum1() * result.getNum2());
                break;
            case "div":
                result.setResult(result.getNum1() / result.getNum2());
                break;
        }
        User user = (User) session.getAttribute("user");
        result.setId(user.getId());
        resultDAO.addResult(result);
        model.addAttribute("result", result.getResult());
        return "calculator";
    }

    @GetMapping("/history")
    public String getResult(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        model.addAttribute("list", resultDAO.getListResultsById(user.getId()));
        return "history";
    }
}