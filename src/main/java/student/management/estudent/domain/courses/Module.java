package student.management.estudent.domain.courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Module {
    private String name;
    private String description;
    private Integer credits;
    private Integer grade;
}