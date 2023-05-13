////////////////////////////////////////////////////////////////////
// MICHAEL FANTINATO 2043672
// DAVIDE BENEDETTI 2042339
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;
    @BeforeClass
    public static void initializeConverter(){
        converter = new IntegerToRoman();
    }
    @Test
    public void TestNumberZero() throws NegativeException, BigException{
        int number =0;
        String zero = converter.convert(number);
        assertEquals("",zero);
    }

    @Test (expected = NegativeException.class)
    public void TestNumberNegative() throws NegativeException, BigException{
        int number =-52;
        converter.convert(number);
    }

    @Test (expected = BigException.class)
    public void TestHighNumber() throws NegativeException, BigException{
        int number =1500;
        converter.convert(number);
    }

}