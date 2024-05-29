package student.management.estudent.controllers.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/improvement")
public class ImprovementRequestController {

    @GetMapping
    public String makeRequest(){
        return "student/improvement";
    }
}
