package by.tms.controller;

import by.tms.entity.User;
import by.tms.dao.UserDAO;
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
@RequestMapping("user")
public class UserController {

    private final UserDAO userStorage;

    public UserController(UserDAO userStorage) {
        this.userStorage = userStorage;
    }

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @PostMapping("/reg")
    public String reg(User user, Model model){
        if(userStorage.findUserByLogin(user.getLogin()) == null) {
            userStorage.add(user);
            return "redirect:/";
        } else {
            model.addAttribute("message", "Such a user exists");
            return "reg";
        }
    }

    @GetMapping("/auth")
    public String auth(){
        return "auth";
    }

    @PostMapping("/auth")
    public String auth(User user, HttpSession session, Model model){
        User exUser =  userStorage.findUserByLogin(user.getLogin());
        if(exUser != null) {
            if (exUser.getPassword().equals(user.getPassword())) {
                session.setAttribute("user", exUser);
                return "redirect:/";
            } else {
                model.addAttribute("message", "Wrong password");
            }
        } else {
            model.addAttribute("message", "User does not exist");
        }
        return "auth";
    }

    @GetMapping("/logout")
    public String logout (HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}