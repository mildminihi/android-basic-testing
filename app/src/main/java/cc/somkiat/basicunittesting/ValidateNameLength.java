package cc.somkiat.basicunittesting;

/**
 * Created by mild supanat on 17/11/2560.
 */

public class ValidateNameLength implements MyValidator{
    @Override
    public boolean isValid(String input) {
        if (input.length() < 2 || input.length() > 20)return true;

        return false;
    }

    @Override
    public String GetErrorMessage() {
        return "Name is Not in Length";
    }
}
