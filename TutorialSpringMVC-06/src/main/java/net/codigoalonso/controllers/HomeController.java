package net.codigoalonso.controllers;

import javax.validation.Valid;
import net.codigoalonso.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;

@Controller
public class HomeController {
    
    @RequestMapping(value = "/")
    public String home(Model model) {        
        return "home";
    }

    
}
