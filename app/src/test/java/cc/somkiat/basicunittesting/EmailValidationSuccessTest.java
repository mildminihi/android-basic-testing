package cc.somkiat.basicunittesting;

import org.junit.Test;
import static junit.framework.Assert.assertTrue;
/**
 * Created by mild supanat on 13/11/2560.
 */

public class EmailValidationSuccessTest {

    @Test
    public void emailIsStandard(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmailPattern("mild@example.com");
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", result);

    }

    @Test
    public void emailIsStandard2(){
        EmailValidation emailValidation = new EmailValidation();
        boolean result = emailValidation.isEmailPattern("mild@example.co.th");
        assertTrue("ต้องผ่านเพราะเป็นEMAILทั่วไป", result);
    }


}
