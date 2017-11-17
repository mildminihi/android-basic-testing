package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
/**
 * Created by mild supanat on 13/11/2560.
 */

public class EmailValidationSuccessTest {

    @Test
    public void emailIsStandard(){
        ValidateEmailPattern emailValidationPattern = new ValidateEmailPattern();
        ValidateEmailNull emailValidationNull = new ValidateEmailNull();
        ValidateEmailEmpty emailValidationEmpty = new ValidateEmailEmpty();
        String input = "mild@example.com";
        assertFalse("ต้องไม่ผ่านเพราะเป็นEMAILทั่วไป", emailValidationEmpty.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นEMAILทั่วไป", emailValidationNull.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นEMAILทั่วไป", emailValidationPattern.isValid(input));

    }

    @Test
    public void emailIsStandard2(){
        ValidateEmailPattern emailValidationPattern = new ValidateEmailPattern();
        ValidateEmailNull emailValidationNull = new ValidateEmailNull();
        ValidateEmailEmpty emailValidationEmpty = new ValidateEmailEmpty();
        String input = "mild@example.co.th";
        assertFalse("ต้องไม่ผ่านเพราะเป็นEMAILทั่วไป", emailValidationEmpty.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นEMAILทั่วไป", emailValidationNull.isValid(input));
        assertFalse("ต้องไม่ผ่านเพราะเป็นEMAILทั่วไป", emailValidationPattern.isValid(input));
    }


}
