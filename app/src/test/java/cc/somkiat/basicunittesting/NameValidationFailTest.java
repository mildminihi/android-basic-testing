package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
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
        assertEquals("Name is Null", validation.validationNameResult(null));
    }

    @Test
    public void NameisEmpty(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmpty("");
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีค่าว่าง", result);
        assertEquals("Name is Empty", validation.validationNameResult(""));
    }

    @Test
    public void NameHaveSpecialChar(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isAlphabet(".a<>@");
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีตัวอักษรพิเศษ", result);
        assertEquals("Name contain non Alphabet Characters", validation.validationNameResult(".a<>@"));
    }

    @Test
    public void NameHaveNumberic(){
        NameValidation validation = new NameValidation();
        boolean result = validation.isAlphabet("mild333");
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีตัวเลข", result);
        assertEquals("Name contain non Alphabet Characters", validation.validationNameResult("mild333"));
    }

    @Test
    public void NameLenthis1(){
        NameValidation validation = new NameValidation();
        boolean result = validation.lengthIsin2to20("m");
        assertFalse("ต้องไม่ผ่านเพราะว่ามีแค่ตัวอักษรเดียว", result);
        assertEquals("Name is Not in Length", validation.validationNameResult("m"));
    }

    @Test
    public void NameLenthis21(){
        NameValidation validation = new NameValidation();
        boolean result = validation.lengthIsin2to20("abcdefghijklmnopqrstu");
        assertFalse("ต้องไม่ผ่านเพราะว่ามีแัวอักษร21ตัว", result);
        assertEquals("Name is Not in Length", validation.validationNameResult("abcdefghijklmnopqrstu"));
    }
}
