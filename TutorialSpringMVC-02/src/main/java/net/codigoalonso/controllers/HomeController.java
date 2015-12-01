package net.codigoalonso.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/home")
public class HomeController {
    
    @RequestMapping
    public String home() {
        return "home";
    }
    
    @RequestMapping(value="/welcome", method =RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }
    
    @RequestMapping(value={"/welcome","/bienvenida"}, method =RequestMethod.GET)
    public String welcome2() {
        return "welcome";
    }
    
    @RequestMapping(value="/welcome/*", method =RequestMethod.GET)
    public String welcome3() {
        return "welcome";
    }
    @RequestMapping(value="{id}", method =RequestMethod.GET)
    public String home2(@PathVariable("id")String param) {
        System.out.println("Parámetro Recibido:" + param);
        return "home";
    }
}
