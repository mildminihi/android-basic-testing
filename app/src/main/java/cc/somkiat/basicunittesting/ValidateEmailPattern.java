package cc.somkiat.basicunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by mild supanat on 17/11/2560.
 */

public class ValidateEmailPattern implements MyValidator {
    @Override
    public boolean isValid(String input) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) return false;
        return true;
    }

    @Override
    public String GetErrorMessage() {
        return "Email is Not Pattern";
    }
}
