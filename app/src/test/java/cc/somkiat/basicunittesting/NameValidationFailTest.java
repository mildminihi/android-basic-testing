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
        String input = "";
        boolean result = validation.isEmpty(input);
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีค่าว่าง", result);
        assertEquals("Name is Empty", validation.validationNameResult(input));
    }

    @Test
    public void NameHaveSpecialChar(){
        NameValidation validation = new NameValidation();
        String input = ".a<>@";
        boolean result = validation.isAlphabet(input);
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีตัวอักษรพิเศษ", result);
        assertEquals("Name contain non Alphabet Characters", validation.validationNameResult(input));
    }

    @Test
    public void NameHaveNumberic(){
        NameValidation validation = new NameValidation();
        String input = "mild333";
        boolean result = validation.isAlphabet(input);
        assertFalse("ต้องไม่ผ่านเพราะว่ามันมีตัวเลข", result);
        assertEquals("Name contain non Alphabet Characters", validation.validationNameResult(input));
    }

    @Test
    public void NameLenthis1(){
        NameValidation validation = new NameValidation();
        String input = "m";
        boolean result = validation.lengthIsin2to20(input);
        assertFalse("ต้องไม่ผ่านเพราะว่ามีแค่ตัวอักษรเดียว", result);
        assertEquals("Name is Not in Length", validation.validationNameResult(input));
    }

    @Test
    public void NameLenthis21(){
        NameValidation validation = new NameValidation();
        String input = "abcdefghijklmnopqrstu";
        boolean result = validation.lengthIsin2to20(input);
        assertFalse("ต้องไม่ผ่านเพราะว่ามีแัวอักษร21ตัว", result);
        assertEquals("Name is Not in Length", validation.validationNameResult(input));
    }
}
