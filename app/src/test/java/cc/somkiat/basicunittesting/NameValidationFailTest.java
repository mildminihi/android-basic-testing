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
        boolean result = validation.isNull(null);
        assertFalse("ต้องไม่ผ่านเพราะว่ามันnull", result);
    }

    @Test
    public void NameisEmpty(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีค่าว่าง", result);
    }

    @Test
    public void NameHaveSpecialChar(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isAlphabet(".a<>@");
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีตัวอักษรพิเศษ", result);
    }

    @Test
    public void NameHaveNumberic(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isAlphabet("mild333");
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีตัวเลข", result);
    }
}
