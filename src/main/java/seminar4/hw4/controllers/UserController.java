package seminar4.hw4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import seminar4.hw4.domain.User;
import seminar4.hw4.repository.UserRepository;

import java.util.Random;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    @GetMapping("/users")
    public String getUsers(Model model){
        model.addAttribute("users", userRepository.getUsers());
        return "users.html";
    }

    @PostMapping("/users")
    public String addUser(User u,Model model){
        userRepository.addUser(u);
        model.addAttribute("users", userRepository.getUsers());
        return "users.html";
    }
}
