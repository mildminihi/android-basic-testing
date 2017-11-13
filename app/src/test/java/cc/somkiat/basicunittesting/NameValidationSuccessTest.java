package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by mild supanat on 11/11/2560.
 */

public class NameValidationSuccessTest {

    @Test
    public void nameisFullName(){
        NameValidation validation = new NameValidation();
        String result = validation.validationNameResult("mild supanat");
        assertEquals("Name Validation Success", result);
    }

    @Test
    public void nameisSingleWord(){
        NameValidation validation = new NameValidation();
        String result = validation.validationNameResult("mild");
        assertEquals("Name Validation Success", result);
    }

    @Test
    public void nameisInLenth(){
        NameValidation validation = new NameValidation();
        boolean result = validation.lengthIsin2to20("mild");
        assertTrue("ต้องผ่านเพราะความยาวชื่ออยู่ในที่กำหนดไว้", result);
    }
}
