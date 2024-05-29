package student.management.estudent.controllers.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import student.management.estudent.domain.activities.Activity;
import student.management.estudent.domain.people.Student;
import student.management.estudent.service.StudentService;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(){
        this.studentService = new StudentService();
    }

    @GetMapping("/student/dashboard")
    public String student(Model model) {
        model.addAttribute("todayCourses", studentService.getTodaysCourses(new Student()));
        return "student/student";
    }

    @GetMapping("/student/user-profile")
    public String userProfile() {
        return "student/user-profile";
    }

    @GetMapping("/student/activity_stream")
    public String getActivityStream(Model model) {
        List<Activity> activities = Arrays.asList(
                new Activity("Global Opportunities", "Added: SNU Korean Language Program", "Details about the Korean language program.", "3 days ago"),
                new Activity("Module Update", "Module: Introduction to Economics updated", "Check the updated syllabus in the course outline.", "5 days ago"),
                new Activity("Research Seminar", "New Seminar: Advances in Biotechnology", "Join us to discuss the latest trends in biotechnology.", "2 days ago"),
                new Activity("Faculty News", "Professor Smith awarded research grant", "Celebrating Prof. Smith's achievement in environmental science.", "1 week ago"),
                new Activity("Course Registration", "Enrollment open for Fall 2024", "Secure your courses for the next semester early.", "6 days ago"),
                new Activity("IT Services", "Scheduled Maintenance of Network Services", "All network services will be down this Sunday.", "8 days ago"),
                new Activity("Student Life", "Join the Spring Festival!", "A weekend of fun activities and performances.", "3 days ago"),
                new Activity("Library Update", "Extended hours for finals week", "The library will be open 24/7 during finals week.", "10 days ago"),
                new Activity("Career Services", "Resume Workshop this Wednesday", "Improve your resume with expert advice.", "12 days ago"),
                new Activity("Health and Wellness", "Mental Health Awareness Month", "Participate in events and support mental health.", "15 days ago")
        );
        model.addAttribute("activities", activities);
        return "student/activity_stream"; // Name of the Thymeleaf template
    }

}
