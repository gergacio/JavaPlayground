import fundamentals.B_DataTypes;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.Assert.assertEquals;
public class BDataTypesTest {
    B_DataTypes dataTypes;
    @Before
    public void before() {
        //update with new instances each time
        dataTypes = new B_DataTypes();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getConvertMeterToKilometer(){
        assertEquals("1.00",dataTypes.convertMeterToKilometer(1000.00));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getExactSum(){
        BigDecimal expected;
        BigDecimal bdNum = new BigDecimal(333333333333.30000000003);
        MathContext mc = new MathContext(11); // 11 precision
        expected = bdNum.round(mc);
        assertEquals(expected,dataTypes.exactSum(0.00000000003, 333333333333.3));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getSpecialNumber(){
        assertEquals("10", dataTypes.specialNumber(550));
    }
    //Test Problem 04----------------------------------------------------------------------------------
    @Test
    public void getRevChars(){
        assertEquals("cba", dataTypes.revChars('a','b','c'));
    }

    //Test problem 05
    @Test
    public void getSumDigits(){
        assertEquals(8,dataTypes.sumDigits(2510));
    }

    //Test problem 06
    @Test
    public void getElevator(){
        assertEquals(6,dataTypes.elevator(17,3));
    }
    //Test problem 07
    @Test
    public void getSumOfChars(){
        assertEquals(199,dataTypes.sumOfChars("cd"));
    }

    //Test problem 08
    @Test
    public void getPrintPartAscii(){
        assertEquals("abcd",dataTypes.printPartAscii(97,100));
    }
    //Test problem 09
    @Test
    public void getDataTypeFinder(){
        assertEquals("boolean",dataTypes.dataTypeFinder("true"));
    }

    //Test problem 10
    @Test
    public void getLeftRight(){
        assertEquals(15,dataTypes.leftRightNumber("123 456"));
    }

    //Test problem 11
    @Test
    public void getIsEqual(){
        assertEquals(false,dataTypes.floatingEquality(4.999999,4.999998));
    }


}
