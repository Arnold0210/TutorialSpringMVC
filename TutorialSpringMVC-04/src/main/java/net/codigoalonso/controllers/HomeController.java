package net.codigoalonso.controllers;

import net.codigoalonso.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    
    private static final String[] countries = { "Spain", "México", "Ecuador" };

    @RequestMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("countries",countries);
        return "home";
    }

    @RequestMapping(value = "result", method = RequestMethod.POST)
    public String Form(User user, Model model) {
        System.out.println(user.toString());
        model.addAttribute("user", user);
        return "user";
    } 

}
