import java.util.regex.*;
public class Q3 {
    String[] email= {
            "user@domain.com",
            "user@domain.co.in",
            "user.name@domain.com",
            "user_name@domain.com",
            "username@yahoo.corporate.in",
            ".username@yahoo.com",
            "username@yahoo.com.",
            "username@yahoo..com",
            "username@yahoo.c"};

    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\." +
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    void answer(){
        for(int z = 0; z < email.length; z++) {
            if (isValidEmail(email[z])){
                System.out.println(email[z] + ": True");
            }
            else{
                System.out.println(email[z] + ": false");
            }
        }
    }
}
