package student.management.estudent.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchedulingController {

    @GetMapping("/timetable")
    public String showTimetables(){
        return "teacher/timetable";
    }

    @GetMapping("/teacher-events")
    public String showEvents(){
        return "teacher/calendar";
    }


}
