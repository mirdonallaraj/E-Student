package student.management.estudent.domain.people;

import lombok.Data;

import java.util.Objects;

@Data
public class Gender {
    public static final Gender MALE = new Gender("male", 'm');
    public static final Gender FEMALE = new Gender("female", 'f');
    public static final Gender OTHER = new Gender("other", 'o');

    private String name;
    private char symbol;

    private Gender(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public final String getName() {
        return name;
    }

    public final char getSymbol() {
        return symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, symbol);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gender)) {
            return false;
        }
        Gender other = (Gender) obj;
        return Objects.equals(name, other.name) &&
                symbol == other.symbol;
    }

    @Override
    public String toString() {
        return "Gender [name=" + name + ", symbol=" + symbol + "]";
    }
}




