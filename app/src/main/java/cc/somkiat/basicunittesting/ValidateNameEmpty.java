package cc.somkiat.basicunittesting;

/**
 * Created by mild supanat on 17/11/2560.
 */

public class ValidateNameEmpty implements MyValidator {
    @Override
    public boolean isValid(String input) {
        return "".equals(input.trim());
    }

    @Override
    public String GetErrorMessage() {
        return "Name is Empty";
    }
}
