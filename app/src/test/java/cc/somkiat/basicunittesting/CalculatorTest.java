package cc.somkiat.basicunittesting;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void TwoplusTwoisFour(){//ทดสอบอะไรคาดหวังจะได้อะไร
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void TwoplusSevenisNine(){//ทดสอบอะไรคาดหวังจะได้อะไร
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 7);
        assertEquals(9, result);
    }
}
