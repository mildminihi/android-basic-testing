package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by mild supanat on 13/11/2560.
 */

public class EmailValidationFailTest {

    @Test
    public void emailIsEmpty(){
        ValidateEmailEmpty validation = new ValidateEmailEmpty();
        String input = "";
        boolean result = validation.isValid(input);
        assertTrue("ต้องผ่านเพราะEMAILเป็นค่าว่าง", result);
        assertEquals("Email is Empty", validation.GetErrorMessage());
    }

    @Test
    public void emailIsNull(){
        ValidateEmailNull validation = new ValidateEmailNull();
        boolean result = validation.isValid(null);
        assertTrue("ต้องผ่านเพราะEMAILเป็นnull", result);
        assertEquals("Email is Null", validation.GetErrorMessage());
    }

    @Test
    public void emailIsNotPatterm(){
        ValidateEmailPattern validation = new ValidateEmailPattern();
        String input = "MildsupanatAddExempledotcom";
        boolean result = validation.isValid(input);
        assertTrue("ต้องผ่านเพราะผิดPattern", result);
        assertEquals("Email is Not Pattern", validation.GetErrorMessage());
    }
}
