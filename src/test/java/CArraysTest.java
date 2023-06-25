import fundamentals.C_Arrays;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
public class CArraysTest {
    C_Arrays CArrays;
    @Before
    public void before() {
        //update with new instances each time
        CArrays = new C_Arrays();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getDayOfWeek(){
        assertEquals("Sunday", CArrays.dayOfWeek(7));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getReverseArrInt(){
        assertEquals("[3, 2, 1]", CArrays.reverseArrInt(1,2,3));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getReverseArrStr(){
        assertEquals("[three, two, one]", CArrays.reverseArrStrings("one", "two", "three"));
    }
    //Test Problem 04----------------------------------------------------------------------------------
    @Test
    public void getOddEvenSubtract(){
        assertEquals("3", CArrays.oddEvenSubtract(1,2,3,4,5,6));
    }

    //Test Problem 05----------------------------------------------------------------------------------
    @Test
    public void getEqualArrays(){
        int [] arrOne = {1, 2, 3};
        int [] arrTwo = {1, 2, 3};

        assertEquals("Arrays are identical. Sum: 6", CArrays.equalArrays(arrOne, arrTwo));
    }
    //Test Problem 06----------------------------------------------------------------------------------

    @Test
    public void getCondenseArray(){
        assertEquals(8, CArrays.condenseArray(1,2,3));
    }
    //Test Problem 07----------------------------------------------------------------------------------

    @Test
    public void getTopInteger(){
        ArrayList list = new ArrayList(asList(24, 19, 17));
        assertEquals(list, CArrays.findTopInteger(14, 24, 3, 19, 15, 17));
    }

    //Test Problem 08----------------------------------------------------------------------------------

    @Test
    public void getMaxSeqEqualNum(){
        ArrayList list = new ArrayList(asList(1 ,1 ,1 ));
        assertEquals(list, CArrays.maxSeqEqualNum(1 ,1 ,1 ,2 ,3 ,1 ,3 ,3));
    }





}
