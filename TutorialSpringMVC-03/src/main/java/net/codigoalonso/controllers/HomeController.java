package net.codigoalonso.controllers;

import net.codigoalonso.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(Model model) {
        
        return "home";
    }

    @RequestMapping(value = "basicForm", method = RequestMethod.POST)
    public String basicForm(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("password") String pass,
            @RequestParam("email") String mail, Model model) {

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(pass);
        user.setEmail(mail);

        System.out.println(user.toString());

        model.addAttribute("user", user);

        return "user";
    }

    @RequestMapping(value = "basicForm2", method = RequestMethod.POST)
    public String basicForm2(int id, String name, String password, String email, Model model) {

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        user.setEmail(email);

        System.out.println(user.toString());

        model.addAttribute("user", user);

        return "user";
    }

    @RequestMapping(value = "basicForm3", method = RequestMethod.POST)
    public String basicForm3(User user, Model model) {
        System.out.println(user.toString());
        model.addAttribute("user", user);
        return "user";
    }
    

}
