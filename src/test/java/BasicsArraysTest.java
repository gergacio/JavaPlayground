import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BasicsArraysTest {
    BasicsArrays basicsArrays;
    @Before
    public void before() {
        //update with new instances each time
        basicsArrays = new BasicsArrays();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getDayOfWeek(){
        assertEquals("Sunday", basicsArrays.dayOfWeek(7));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getReverseArrInt(){
        assertEquals("[3, 2, 1]", basicsArrays.reverseArrInt(1,2,3));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getReverseArrStr(){
        assertEquals("[three, two, one]", basicsArrays.reverseArrStrings("one", "two", "three"));
    }
    //Test Problem 04----------------------------------------------------------------------------------
    @Test
    public void getOddEvenSubtract(){
        assertEquals("3", basicsArrays.oddEvenSubtract(1,2,3,4,5,6));
    }




}
