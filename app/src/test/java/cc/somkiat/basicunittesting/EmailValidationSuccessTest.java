package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
/**
 * Created by mild supanat on 13/11/2560.
 */

public class EmailValidationSuccessTest {

    @Test
    public void emailIsStandard(){
        EmailValidation emailValidation = new EmailValidation();
        boolean resultPattern = emailValidation.isEmailPattern("mild@example.com");
        boolean resultEmpty = emailValidation.isEmailPattern("mild@example.com");
        boolean resultNull = emailValidation.isEmailPattern("mild@example.com");
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultPattern);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultEmpty);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultNull);
        assertEquals("Email Validation Success", emailValidation.validationEmailResult("mild@example.com"));

    }

    @Test
    public void emailIsStandard2(){
        EmailValidation emailValidation = new EmailValidation();
        boolean resultPattern = emailValidation.isEmailPattern("mild@example.co.th");
        boolean resultEmpty = emailValidation.isEmailPattern("mild@example.co.th");
        boolean resultNull = emailValidation.isEmailPattern("mild@example.co.th");
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultPattern);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultEmpty);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultNull);
        assertEquals("Email Validation Success", emailValidation.validationEmailResult("mild@example.co.th"));
    }


}
