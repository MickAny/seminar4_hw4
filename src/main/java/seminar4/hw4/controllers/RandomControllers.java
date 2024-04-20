package seminar4.hw4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class RandomControllers {
    @GetMapping("/randoms")
    public String getRandomNumber(Model model){
        Random random = new Random();
        int randomNum1 = random.nextInt(100);
        int randomNum2 = random.nextInt(100);
        int sum = randomNum1 + randomNum2;

        model.addAttribute("num1", randomNum1);
        model.addAttribute("num2", randomNum2);
        model.addAttribute("sum", sum);

        return "random_numbers.html";
    }
}
