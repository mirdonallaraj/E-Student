package student.management.estudent.controllers.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;
import student.management.estudent.domain.courses.Module;

@Controller
public class ModulesController {
    private List<Module> modules = Arrays.asList(
            new Module("Introduction to Algorithms", "Study of algorithms and data structures", 7, 10), // Default credits as 0, grade as null
            new Module("Database Systems", "Introduction to database design and SQL", 6, 9),
            new Module("Operating Systems", "Understanding of modern operating systems", 7, 4)
    );

    @GetMapping("/modules")
    public String showModules(Model model) {
        model.addAttribute("modules", modules);
        return "student/module"; // Assuming there is a Thymeleaf template called "modules.html"
    }

    @GetMapping("/marks")
    public String showMarks(Model model) {
        model.addAttribute("modules", modules);
        return "student/marks"; // Assuming there is a Thymeleaf template called "marks.html"
    }
}