package student.management.estudent.exceptions;

import lombok.Data;

public class InvalidEmailException extends RuntimeException {

    private static final long serialVersionUID =
            -1749146006249091003L;

    private String email;

    public InvalidEmailException(String email) {
        super("Vlera " + email + " eshte e pasakte");
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}