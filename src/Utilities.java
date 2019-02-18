import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
    public static int generaPin(){
        Random random = new Random();
        int a = 1000; // numero minimo
        int b = 9999; // numero massimo
        int c = ((b-a) + 1);
        int miavar = random.nextInt(c) + a;
        return miavar;
    }
    public static boolean autorizzazione(){

    }

}
