package student.management.estudent.domain.common;

import lombok.Data;

import java.util.Objects;

@Data
public class Address {
    private String state;
    private String city;
    private String street;
    private String building;
    private String entrance;
    private String number;
    private short zip;

    public Address(String state,
                   String city,
                   int zip) {
        this(state, city, "", "",
                "", "", zip);
    }

    public Address(String state,
                   String city,
                   String street,
                   String building,
                   int zip
                   ) {
        this(state, city, street, building,
                "1", "1", zip);
    }

    public Address(String state,
                   String city,
                   String street,
                   String building,
                   String entrance,
                   String number,
                   int zip) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.building = building;
        this.entrance = entrance;
        this.number = number;
        this.zip = (short) zip;
    }

    @Override
    public int hashCode() {
        return Objects.hash(building, city, entrance, number, state, street, zip);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address other = (Address) obj;
        return Objects.equals(building, other.building) && Objects.equals(city, other.city)
                && Objects.equals(entrance, other.entrance)
                && Objects.equals(number, other.number)
                && Objects.equals(state, other.state) && Objects.equals(street, other.street) && zip == other.zip;
    }

    @Override
    public String toString() {
        return "Address [state=" + state + ", city=" + city + ", street=" + street + ", building=" + building
                + ", entrance=" + entrance + ", number=" + number + ", zip=" + zip + "]";
    }



}
