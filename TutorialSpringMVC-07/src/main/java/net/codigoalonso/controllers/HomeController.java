package net.codigoalonso.controllers;

import java.io.File;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
    
    private static String filePath = System.getProperty("catalina.home") + File.separator + "webapps"+File.separator+"images"+File.separator;                
    
    @RequestMapping(value = "/")
    public String home(Model model) {        
        return "home";
    }
    
    @RequestMapping(value = "uploadFile", method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file")MultipartFile image) { 
        
        if(!image.isEmpty()) {
            try {
                image.transferTo(new File(filePath+image.getOriginalFilename()));                
            } catch(Exception e) {
                                
            }
        }        
        return "home";
    }    
}
