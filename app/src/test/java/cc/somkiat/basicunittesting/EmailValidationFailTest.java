package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by mild supanat on 13/11/2560.
 */

public class EmailValidationFailTest {

    @Test
    public void emailIsEmpty(){
        EmailValidation emailValidation = new EmailValidation();
        String input = "";
        boolean result = emailValidation.isEmpty(input);
        assertFalse("ต้องไม่ผ่านเพราะEMAILเป็นค่าว่าง", result);
        assertEquals("Email is Empty", emailValidation.validationEmailResult(input));
    }

    @Test
    public void emailIsNull(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isNull(null);
        assertFalse("ต้องไม่ผ่านเพราะEMAILเป็นnull", result);
        assertEquals("Email is Null", emailValidation.validationEmailResult(null));
    }

    @Test
    public void emailIsNotPatterm(){
        EmailValidation emailValidation = new EmailValidation();
        String input = "MildsupanatAddExempledotcom";
        boolean result = emailValidation.isEmailPattern(input);
        assertFalse("ต้องไม่ผ่านเพราะผิดPattern", result);
        assertEquals("Is not Email Pattern", emailValidation.validationEmailResult(input));
    }
}
