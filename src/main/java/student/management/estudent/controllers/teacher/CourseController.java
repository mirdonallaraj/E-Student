package student.management.estudent.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import student.management.estudent.domain.courses.Course;

import java.util.Arrays;
import java.util.List;

@Controller
public class CourseController {


    @GetMapping("/courses")
    public String showCourses(Model model) {
        List<Course> courses = Arrays.asList(
                new Course(1L, "Calculus", "Advanced calculus course covering multiple integrals.", "09:00 AM - 11:00 AM", "Math Building, Room 204", "Dr. John Doe", 4),
                new Course(2L, "World History", "Survey of world history from the Renaissance to modern day.", "12:00 PM - 02:00 PM", "History Hall, Room 101", "Prof. Jane Smith", 3),
                new Course(3L, "General Physics", "Introduction to concepts of mechanics, electricity, and magnetism.", "03:00 PM - 05:00 PM", "Science Center, Room 308", "Dr. Emily Stone", 4)
        );
        model.addAttribute("courses", courses);
        return "teacher/courses"; // The name of your Thymeleaf template for courses
    }
}
