package student.management.estudent.domain.common;

import student.management.estudent.exceptions.InvalidEmailException;

import java.util.ArrayList;

public class Email {

    private String local;
    private String domain;

    private static ArrayList<Email> emails =
            new ArrayList<Email>();

    public Email(String email) {
        setEmail(email);
    }

    private void setEmail(String email) {
        if(email == null) {
            //email = "undefined@gmail.com";
            throw new InvalidEmailException(email);
        }
        email = email.trim();
        if(!email.contains("@") /**|| exists(email)*/) {
            throw new InvalidEmailException(email);
        }
        if(email.startsWith("@")) {
            //email = "undefined" + email;
            throw new InvalidEmailException(email);
        }
        if(email.endsWith("@")) {
            //email = email + "gmail.com";
            throw new InvalidEmailException(email);
        }
        if(email.indexOf("@", email.indexOf("@") + 1) != -1) {
//			email = email.substring(0, email.indexOf("@")) +
//					email.substring(email.lastIndexOf("@"));
            throw new InvalidEmailException(email);
        }
//		while(exists(email)) {
//			email = getNextEmail(email);
//		}
        if(exists(email)) {
            throw new InvalidEmailException(email);
        }
        local = getLocal(email);	//zona locale
        domain = getDomain(email);	//zona domain
        emails.add(this);
    }

    private static String getLocal(String email) {
        return email.substring(0, email.indexOf("@"));
    }

    private static String getDomain(String email) {
        return email.substring(email.indexOf("@") + 1);
    }

    public static String getNextEmail(String email) {
        String local = getLocal(email);
        return getLocalWithoutNumericValue(local) +
                (getNumericValue(local) + 1) +
                "@" + getDomain(email);
    }

    private static String getLocalWithoutNumericValue(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
            if(!Character.isDigit(s.charAt(i))) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }

    //denis163
    private static int getNumericValue(String s) {
        String number = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            if(!Character.isDigit(s.charAt(i))) {
                break;
            }
            number = s.charAt(i) + number;
        }
        if(number.equals("")) {
            return 0;
        }
        return Integer.parseInt(number);
    }

    private static boolean exists(String email) {
//		for(int i = 0; i < emails.size(); i++) {
//			if(emails.get(i).getEmail().equalsIgnoreCase(email)) {
//				return true;
//			}
//		}
        for(Email e : emails) {
            if(e.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    public Email(String local, String domain) {
        this(local + "@" + domain);
    }

    public final String getEmail() {
        return local + "@" + domain;
    }

    public final String getLocal(){
        return local;
    }

    public final String getDomain(){
        return domain;
    }

    public int hashCode() {
        return getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof Email)) {
            return false;
        }
        Email otherEmail = (Email)obj;
        if(local == null) {
            if(otherEmail.local != null) {
                return false;
            }
        }
        else if(!local.equals(otherEmail.local)) {
            return false;
        }
        if(domain == null) {
            if(otherEmail.domain != null) {
                return false;
            }
        }
        else if(!domain.equals(otherEmail.domain)) {
            return false;
        }
        return true;
    }

}






