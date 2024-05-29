package student.management.estudent.controllers.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeeController {


    @GetMapping("/fees")
    public String showFees(Model model) {

        return "student/fees"; // Thymeleaf template to display fees
    }
}
