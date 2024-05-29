package student.management.estudent.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import student.management.estudent.domain.people.Student;

import java.util.Arrays;
import java.util.List;

@Controller
public class GradeController {

    @PostMapping("/save-grade")
    public String editGrades(){
        return "redirect:manage-grades";
    }


    @GetMapping("/manage-grades")
    public String showGrades(Model model) {
        List<Student> students =  Arrays.asList(
                new Student(),
                new Student()
        );
        model.addAttribute("students", students);
        return "teacher/manage-grades"; // The name of your Thymeleaf template for grades
    }
}
