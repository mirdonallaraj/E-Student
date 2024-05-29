package student.management.estudent.service;

import org.springframework.stereotype.Service;
import student.management.estudent.domain.courses.Course;
import student.management.estudent.domain.people.Student;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Course> getTodaysCourses(Student student) {
        // Implementation to fetch courses from the database based on the current date and student
        // Return a hardcoded list of courses
        return Arrays.asList(
                new Course(1L, "Calculus", "Advanced calculus course covering multiple integrals.", "09:00 AM - 11:00 AM", "Math Building, Room 204", "Dr. John Doe", 4),
                new Course(2L, "World History", "Survey of world history from the Renaissance to modern day.", "12:00 PM - 02:00 PM", "History Hall, Room 101", "Prof. Jane Smith", 3),
                new Course(3L, "General Physics", "Introduction to concepts of mechanics, electricity, and magnetism.", "03:00 PM - 05:00 PM", "Science Center, Room 308", "Dr. Emily Stone", 4)
        );
    }
//    public List<Grade> getRecentGrades(Student student) {
//        return gradeRepository.findRecentGradesByStudent(student.getId());
//    }
}