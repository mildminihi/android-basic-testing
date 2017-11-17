package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by mild supanat on 11/11/2560.
 */

public class NameValidationSuccessTest {

    @Test
    public void nameisFullName(){
        ValidateNameEmpty validateNameEmpty = new ValidateNameEmpty();
        ValidateNameLength validateNameLength = new ValidateNameLength();
        ValidateNameNull validateNameNull = new ValidateNameNull();
        ValidateNameAplabet validateNameAplabet = new ValidateNameAplabet();
        String input = "mild supanat";
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameNull.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameEmpty.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameLength.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameAplabet.isValid(input));
    }

    @Test
    public void nameisSingleWord(){
        String input = "mild";
        ValidateNameEmpty validateNameEmpty = new ValidateNameEmpty();
        ValidateNameLength validateNameLength = new ValidateNameLength();
        ValidateNameNull validateNameNull = new ValidateNameNull();
        ValidateNameAplabet validateNameAplabet = new ValidateNameAplabet();
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameNull.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameEmpty.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameLength.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameAplabet.isValid(input));
    }

    @Test
    public void nameisInLenth(){
        String input = "mild";
        ValidateNameEmpty validateNameEmpty = new ValidateNameEmpty();
        ValidateNameLength validateNameLength = new ValidateNameLength();
        ValidateNameNull validateNameNull = new ValidateNameNull();
        ValidateNameAplabet validateNameAplabet = new ValidateNameAplabet();
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameNull.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameEmpty.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameLength.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นค่าปกติ", validateNameAplabet.isValid(input));
    }
}
