package student.management.estudent.domain.exams;

import lombok.Data;
import student.management.estudent.domain.exams.Exam;

import java.util.List;

@Data
public class ExamRegistrationForm {
    private List<Exam> selectedExams;

}