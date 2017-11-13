package cc.somkiat.basicunittesting;

/**
 * Created by mild supanat on 10/11/2560.
 */

class NameValidation {


    public String validationNameResult(String name){
        String validationResult = "Name Validation Success";

        if (isNull(name) == false){
            validationResult = "Name is Null";
        }
        else if (isEmpty(name) == false){
            validationResult = "Name is Empty";
        }
        else if (isAlphabet(name) == false) {
            validationResult = "Name contain non Alphabet Characters";
        }
        else if (lengthIsin2to20(name) == false){
            validationResult = "Name is Not in Length";
        }
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
        if(!name.matches("^[ A-Za-z]+$")) {
            return false;
        }
        return true;
    }

    public boolean lengthIsin2to20(String name){
        if (name.length() < 2 || name.length() > 20){
            return false;
        }
        return true;
    }
}
