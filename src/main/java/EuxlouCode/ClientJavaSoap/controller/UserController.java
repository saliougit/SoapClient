package EuxlouCode.ClientJavaSoap.controller;

import EuxlouCode.ClientJavaSoap.model.User;
import EuxlouCode.ClientJavaSoap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users"; // Affiche users.html
    }

    @GetMapping("/add")
    public String addUserForm(Model model) {
        model.addAttribute("user", new User());
        return "add-user"; // Affiche add-user.html
    }

    @PostMapping("/add")
    public String addUserSubmit(@ModelAttribute User user) {
        userService.createUser(user);
        return "redirect:/users/list";
    }

    @GetMapping("/update/{id}")
    public String updateUserForm(@PathVariable Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "update-user"; // Affiche update-user.html
    }

    @PostMapping("/update")
    public String updateUserSubmit(@ModelAttribute User user) {
        userService.updateUser(user.getId(), user);
        
        return "redirect:/users/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        //confirmation de suppression
        
        userService.deleteUser(id);
        return "redirect:/users/list";
    }
}

