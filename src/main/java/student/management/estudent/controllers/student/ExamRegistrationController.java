package student.management.estudent.controllers.student;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import student.management.estudent.domain.exams.ExamRegistrationForm;
import student.management.estudent.domain.exams.Exam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/exam-registration")
public class ExamRegistrationController {

    @GetMapping
    public String showRegistrationForm(Model model) {
//        if (!model.containsAttribute("examRegistrationForm")) {
//            model.addAttribute("examRegistrationForm", new ExamRegistrationForm());
//        }
        //Should be returned from the database
        List<Exam> exams = Arrays.asList(
                new Exam(1L, "Exam 1", new Date()),
                new Exam(2L, "Exam 2", new Date()),
                new Exam(3L, "Exam 3", new Date())
        );
//        model.addAttribute("exams", exams);
        ExamRegistrationForm form = new ExamRegistrationForm();
        form.setSelectedExams(exams);
        model.addAttribute("examRegistrationForm", form);

        return "student/exam-registration";
    }


    @PostMapping
    public String processRegistration(@ModelAttribute("examRegistrationForm") ExamRegistrationForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "student/exam-registration";
        }
        List<Exam> selectedExams = form.getSelectedExams();
        if (selectedExams != null) {
            for (Exam module : selectedExams) {
                if (module.isSelected()) {
                    // Print or log the selected module ID
                    System.out.println("Module selected: ID = " + module.getId() + " " + module.getName());
                }
            }
        }
        // Process the form data
        return "redirect:/exam-registration";
    }

}