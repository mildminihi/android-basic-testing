package cc.somkiat.basicunittesting;

/**
 * Created by mild supanat on 17/11/2560.
 */

public class ValidateEmailNull implements MyValidator{
    @Override
    public boolean isValid(String input) {
        if(input == null) return true;
        return false;
    }

    @Override
    public String GetErrorMessage() {
        return "Email is Null";
    }
}
