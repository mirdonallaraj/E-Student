package student.management.estudent.domain.people;

import lombok.*;
import student.management.estudent.domain.courses.Course;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person{
    private List<Course> courses;
}
