package student.management.estudent.domain.common;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PhoneNumber {

    public static final PhoneNumberOperator ONE_AL =
            new PhoneNumberOperator("One", "Albania", 68);

    public static final PhoneNumberOperator VODAFONE_AL =
            new PhoneNumberOperator("Vodafone", "Albania", 69);

    public static final PhoneNumberOperator ALBTELECOM_AL =
            new PhoneNumberOperator("Albtelecom", "Albania", 67);

    public static final PhoneNumberOperator INTERNATIONAL =
            new PhoneNumberOperator();

    private short prefix;
    private byte operator;
    private int simNumber;
    private PhoneNumberOperator network;

    private static ArrayList<PhoneNumber>
            numbers = new ArrayList<>();

    public PhoneNumber(int simNumber,
                       PhoneNumberOperator network) {
        this(355, network.getNumber(), simNumber, network);
    }

    public PhoneNumber(int prefix,
                       int simNumber,
                       PhoneNumberOperator network) {
        this(prefix, network.getNumber(), simNumber, network);
    }

    public PhoneNumber(int prefix,
                       int operator,
                       int simNumber,
                       PhoneNumberOperator network) {
        if(exists(prefix, operator, simNumber)) {
            simNumber = generateNewSimNumber
                    (prefix, operator);
        }
        this.prefix = (short)prefix;
        this.operator = (byte)operator;
        this.simNumber = simNumber;
        this.network = network;
        numbers.add(this);
    }

    private int generateNewSimNumber
            (int prefix, int operator) {
        if(existsAllSimNumbersOfOperator(prefix, operator)) {
            return 0; //marreveshje
        }
        int simNumber = generateNewSimNumber();
        while(exists(prefix, operator, simNumber)) {
            simNumber = generateNewSimNumber();
        }
        return simNumber;
    }

    private boolean existsAllSimNumbersOfOperator
            (int prefix, int operator) {
        for (int i = 2_000_000; i <= 9_999_999; i++) {
            if(!exists(prefix, operator, i)) {
                return false;
            }
        }
        return true;
    }

    private int generateNewSimNumber() {
        return (int) (Math.random() * 8_000_000
                + 2_000_000);
    }

    private static boolean exists(int prefix,
                                  int operator,
                                  int simNumber) {
//		for (int i = 0; i < numbers.size(); i++) {
//			if(numbers.get(i).getPrefix() == prefix &&
//			   numbers.get(i).getOperator() == operator &&
//			   numbers.get(i).getSimNumber() == simNumber) {
//				return true;
//			}
//		}
        for(PhoneNumber phoneNumber : numbers) {
            if(phoneNumber.prefix == prefix &&
                    phoneNumber.operator == operator &&
                    phoneNumber.simNumber == simNumber) {
                return true;
            }
        }
        return false;
    }

}





