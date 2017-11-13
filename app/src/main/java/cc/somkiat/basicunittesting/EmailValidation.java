package cc.somkiat.basicunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mild supanat on 12/11/2560.
 */

public class EmailValidation {


    public String validationEmailResult(String email){
        String emailValidationResult = "Email Validation Success";

        if (isNull(email) == false){
            emailValidationResult = "Email is Null";
        }
        else if (isEmpty(email) == false){
            emailValidationResult = "Email is Empty";
        }
        else if (isEmailPattern(email) == false){
            emailValidationResult = "Is not Email Pattern";
        }
        return emailValidationResult;
    }

    public boolean isEmpty(String email) {
        if (email.isEmpty()) {
            return false;
        }
        return true;
    }
    public boolean isNull(String email) {
        if (email == null) {
            return false;
        }
        return true;
    }

    public boolean isEmailPattern(String email){
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
