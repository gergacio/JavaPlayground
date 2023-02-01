import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.MathContext;

import static org.junit.Assert.assertEquals;
public class DataTypesTest {
    DataTypes dataTypes;
    @Before
    public void before() {
        //update with new instances each time
        dataTypes = new DataTypes();
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


}
