package student.management.estudent.domain.people;

import lombok.Data;
import student.management.estudent.domain.common.PhoneNumber;
import student.management.estudent.domain.common.Address;
import student.management.estudent.domain.common.Email;

import java.util.ArrayList;
import java.util.GregorianCalendar;

@Data
public class Person {

    private Long id;
    private String name;
    private String surname;
    private Gender gender;
    private GregorianCalendar birthdate;
    private Address address;
    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<Email> emails;
    public Person() {

    }
    public Person(Long id,
                  String name,
                  String surname,
                  Gender gender,
                  GregorianCalendar birthdate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        if(birthdate == null) {
            //ndalohet krijimi i objektit
            birthdate = new GregorianCalendar();
        }
        this.birthdate = (GregorianCalendar) birthdate.clone();
        phoneNumbers = new ArrayList<PhoneNumber>();
        emails = new ArrayList<Email>();
    }

    public Person(Long id, String name, String surname, Gender gender, GregorianCalendar birthdate, Address address, ArrayList<PhoneNumber> phoneNumbers, ArrayList<Email> emails) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
    }

    public Person(Person person) {
        id = person.id;
        name = person.name;
        surname = person.surname;
        gender = person.gender;
        birthdate = person.birthdate;
        phoneNumbers = person.phoneNumbers;
        emails = person.emails;
    }


    public long getBirthdateInMillis() {
        return birthdate.getTimeInMillis();
    }

    public GregorianCalendar getBirthdateClone() {
        return (GregorianCalendar) birthdate.clone();
    }

//	public ArrayList<PhoneNumber> getPhoneNumbers() {
//		return phoneNumbers;
//	}

//	public ArrayList<Email> getEmails() {
//		return emails;
//	}

    public final int getNumberOfPhoneNumbers() {
        return phoneNumbers.size();
    }

    public final PhoneNumber getPhoneNumber(int index) {
        if(index < 0 || index >= getNumberOfPhoneNumbers()) {
            return null;
        }
        return phoneNumbers.get(index);
    }

    public final boolean addPhoneNumber(PhoneNumber phoneNumber) {
        if(phoneNumber == null ||
                existsPhoneNumber(phoneNumber)) {
            return false;
        }
        phoneNumbers.add(phoneNumber);
        return true;
    }

    public final boolean existsPhoneNumber(PhoneNumber phoneNumber) {
        for(PhoneNumber number : phoneNumbers) {
            if(number.getSimNumber() == phoneNumber.getSimNumber() &&
                    number.getPrefix() == phoneNumber.getPrefix() &&
                    number.getOperator() == phoneNumber.getOperator()) {
                return true;
            }
        }
        return false;
    }

    public final boolean removePhoneNumber(PhoneNumber phoneNumber) {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            PhoneNumber number = phoneNumbers.get(i);
            if(number.getSimNumber() == phoneNumber.getSimNumber() &&
                    number.getPrefix() == phoneNumber.getPrefix() &&
                    number.getOperator() == phoneNumber.getOperator()) {
                phoneNumbers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Email getEmail(int index) {
        if(index < 0 || index >= getNumberOfEmails()) {
            return null;
        }
        return emails.get(index);
    }

    public boolean addEmail(Email email) {
        if (email == null || existsEmail(email)) {
            return false;
        }
        emails.add(email);
        return true;
    }

    public boolean existsEmail(Email email) {
        for (Email e : emails) {
            if (e.getEmail().equals(email.getEmail())) {
                return true;
            }
        }
        return false;
    }

    public boolean removeEmail(Email email) {
        if (email == null) {
            return false;
        }
        for (int i = 0; i < emails.size(); i++) {
            if (emails.get(i).getEmail().equals(email.getEmail())) {
                emails.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getNumberOfEmails(){
        return emails.size();
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthdate="
                + birthdate + ", address=" + address + ", phoneNumbers=" + phoneNumbers + ", emails=" + emails + "]";
    }

//	private char[] charArray = {'O', 'u', 'a', 'g', 'a', 'd'};
//
//	public char[] charArray() {
//		return charArray;
//	}



}
