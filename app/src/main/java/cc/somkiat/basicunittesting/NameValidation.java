package cc.somkiat.basicunittesting;

/**
 * Created by mild supanat on 10/11/2560.
 */

class NameValidation {
    private String validationResult = "Validation Success";

    public String validationNameResult(String name){

        if (isEmpty(name))validationResult = "Name is Empty";
        else if (isNull(name)) validationResult = "Name is Null";
        else if (isAlphabet(name)) validationResult = "Name contain non Alphabet Characters";

        return validationResult;
    }
    public boolean isEmpty(String name) {
        if (name.isEmpty()) {
            return false;
        }
        return true;
    }
    public boolean isNull(String name) {
        if (name == null) {
            return false;
        }
        return true;
    }
    public boolean isAlphabet(String name) {
        if(!name.matches("[A-Za-z]+")) {
            return false;
        }
        return true;
    }

    public boolean lenthIsin2to20(String name){
        if (name.length() < 2 || name.length() > 20){
            return false;
        }
        return true;
    }
}
