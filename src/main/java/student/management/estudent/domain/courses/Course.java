package student.management.estudent.domain.courses;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private Long id;
    private String name;
    private String description;
    private String time;           // Time the course is scheduled
    private String location;       // Location of the course
    private String instructorName; // Name of the instructor
    private int creditHours;

}
