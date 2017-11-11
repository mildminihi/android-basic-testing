package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mild supanat on 11/11/2560.
 */

public class NameValidationSuccessTest {

    @Test
    public void nameisFullName(){
        NameValidation validation = new NameValidation();
        String result = validation.validationNameResult("mild supanat");
        assertEquals("Validation Success", result);
    }
}
