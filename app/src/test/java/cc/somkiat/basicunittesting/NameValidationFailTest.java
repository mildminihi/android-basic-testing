package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

/**
 * Created by mild supanat on 10/11/2560.
 */

public class NameValidationFailTest {

    @Test
    public void NameisNull(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีค่าว่าง", result);
    }
}
