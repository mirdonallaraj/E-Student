package student.management.estudent.domain.exams;

import lombok.Data;

import java.util.Date;

@Data
public class Exam {
    private Long id;
    private String name;
    private boolean selected;
    private Date date;

    public Exam(){

    }

    public Exam(Long id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.selected = false; // Initially not selected
        this.date = date;
    }

}
