package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by mild supanat on 13/11/2560.
 */

public class EmailValidationFailTest {

    @Test
    public void emailIsEmpty(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmpty("");
        assertFalse("ต้องไม่ผ่านเพราะEMAILเป็นค่าว่าง", result);
    }

    @Test
    public void emailIsNull(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isNull(null);
        assertFalse("ต้องไม่ผ่านเพราะEMAILเป็นnull", result);
    }

    @Test
    public void emailIsNotPatterm(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmailPattern("MildsupanatAddExempledotcom");
        assertFalse("ต้องไม่ผ่านเพราะผิดPattern", result);
    }
}
