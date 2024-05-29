package student.management.estudent.domain.common;

import lombok.Data;

@Data
public class PhoneNumberOperator {

    private String name;
    private String country;
    private int number;

    public PhoneNumberOperator() {
        this("International", "International", 0);
    }

    public PhoneNumberOperator(String name,
                               String country,
                               int number) {
        this.name = name;
        this.country = country;
        this.number = number;
    }

}
