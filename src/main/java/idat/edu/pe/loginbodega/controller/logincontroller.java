package idat.edu.pe.loginbodega.controller;

import idat.edu.pe.loginbodega.model.loginmodel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class logincontroller {

    @GetMapping("/loginauto")
    public String login(Model model){
        model.addAttribute("loginmodel", new loginmodel());
        model.addAttribute("visualizar", false);
        return "login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("loginmodel") loginmodel objlogin,
                        Model model){
        if (objlogin.getUsuario().equals("casanova") && objlogin.getPassword().equals("12345")) {
            model.addAttribute("mensaje", "bienvenido " + objlogin.getUsuario());
            return "menuprincipal";
        } else if (objlogin.getUsuario().equals("galan") && objlogin.getPassword().equals("12345")) {
            model.addAttribute("mensaje", "bienvenido " + objlogin.getUsuario());
            return "menuprincipal";
        } else if (objlogin.getUsuario().equals("sanchez") && objlogin.getPassword().equals("4321")) {
            model.addAttribute("mensaje", "bienvenido " + objlogin.getUsuario());
            return "menuprincipal";
        }
        model.addAttribute("visualizar", true);
        return "login";
    }

}
