package seminar4.hw4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String getHelloWorld(){
        return "hello_world.html";
    }
}