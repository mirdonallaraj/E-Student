package student.management.estudent.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {

    @GetMapping("/teacher/dashboard")
    public String home(){
            return "teacher/teacher";
        }

    @GetMapping("/teacher/user-profile")
    public String userProfile() {
        return "teacher/user-profile";
    }

//    @GetMapping("/teacher/user-profile")
//    public String userProfile() {
//        return "teacher/user-profile";  // Navigate to the user profile page under the student folder
//    }
}
