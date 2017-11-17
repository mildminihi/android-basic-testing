package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by mild supanat on 10/11/2560.
 */

public class NameValidationFailTest {

    @Test
    public void NameisNull(){
        ValidateNameNull validation = new ValidateNameNull();
        boolean result = validation.isValid(null);
        assertTrue("ต้องผ่านเพราะว่ามันnull", result);
        assertEquals("Name is Null", validation.GetErrorMessage());
    }

    @Test
    public void NameisEmpty(){
        ValidateNameEmpty validation = new ValidateNameEmpty();
        String input = "";
        boolean result = validation.isValid(input);
        assertTrue("ต้องผ่านเพราะว่ามันมีค่าว่าง", result);
        assertEquals("Name is Empty", validation.GetErrorMessage());
    }

    @Test
    public void NameHaveSpecialChar(){
        ValidateNameAplabet validation = new ValidateNameAplabet();
        String input = ".a<>@";
        boolean result = validation.isValid(input);
        assertTrue("ต้องผ่านเพราะว่ามันมีตัวอักษรพิเศษ", result);
        assertEquals("Name contain non Alphabet Characters", validation.GetErrorMessage());
    }

    @Test
    public void NameHaveNumberic(){
        ValidateNameAplabet validation = new ValidateNameAplabet();
        String input = "mild333";
        boolean result = validation.isValid(input);
        assertTrue("ต้องผ่านเพราะว่ามันมีตัวเลข", result);
        assertEquals("Name contain non Alphabet Characters", validation.GetErrorMessage());
    }

    @Test
    public void NameLenthis1(){
        ValidateNameLength validation = new ValidateNameLength();
        String input = "m";
        boolean result = validation.isValid(input);
        assertTrue("ต้องผ่านเพราะว่ามีแค่ตัวอักษรเดียว", result);
        assertEquals("Name is Not in Length", validation.GetErrorMessage());
    }

    @Test
    public void NameLenthis21(){
        ValidateNameLength validation = new ValidateNameLength();
        String input = "abcdefghijklmnopqrstu";
        boolean result = validation.isValid(input);
        assertTrue("ต้องผ่านเพราะว่ามีแัวอักษร21ตัว", result);
        assertEquals("Name is Not in Length", validation.GetErrorMessage());
    }
}
