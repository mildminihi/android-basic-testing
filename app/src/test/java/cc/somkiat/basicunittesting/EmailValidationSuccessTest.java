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
        String input = "mild@example.com";
        boolean resultPattern = emailValidation.isEmailPattern(input);
        boolean resultEmpty = emailValidation.isEmailPattern(input);
        boolean resultNull = emailValidation.isEmailPattern(input);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultPattern);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultEmpty);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultNull);
        assertEquals("Email Validation Success", emailValidation.validationEmailResult(input));

    }

    @Test
    public void emailIsStandard2(){
        EmailValidation emailValidation = new EmailValidation();
        String input = "mild@example.co.th";
        boolean resultPattern = emailValidation.isEmailPattern(input);
        boolean resultEmpty = emailValidation.isEmailPattern(input);
        boolean resultNull = emailValidation.isEmailPattern(input);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultPattern);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultEmpty);
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", resultNull);
        assertEquals("Email Validation Success", emailValidation.validationEmailResult(input));
    }


}
