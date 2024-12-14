package credit.card.validation;

public class Main {
    public static void main(String[] args) {
        CardValidation cv = new CardValidation(4234567890123456L);
        cv.validate();
        CardValidation cv1 = new CardValidation(1234567890123456L);
        cv1.validate();
        CardValidation cv2 = new CardValidation(42345678901234L);
        cv2.validate();
        CardValidation cv3 = new CardValidation(5234567890123450L);
        cv3.validate();
    }
}

