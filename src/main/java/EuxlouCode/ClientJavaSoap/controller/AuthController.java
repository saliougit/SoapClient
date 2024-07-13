package EuxlouCode.ClientJavaSoap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// import EuxlouCode.ClientJavaSoap.model.User;




@Controller
public class AuthController {


    

    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/login";
    }

    // logout

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }


    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }
    

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String email, @RequestParam String password, Model model) {

    
        // Création d'un objet User pour simuler l'authentification
        // User user = new User(username, password, "USER");

        // Ajout de l'utilisateur au modèle pour l'afficher plus tard
        // model.addAttribute("user", user);

        // Redirection vers la liste des utilisateurs
        return "redirect:/users/list";
    }
}
