package cc.somkiat.basicunittesting;

/**
 * Created by mild supanat on 17/11/2560.
 */

public class ValidateNameAplabet implements MyValidator{
    @Override
    public boolean isValid(String input) {
        if(!input.matches("^[ A-Za-z]+$"))return true;
        return false;
    }

    @Override
    public String GetErrorMessage() {
        return "Name contain non Alphabet Characters";
    }
}
