import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BasicArrayTest {
    BasicArray basicArray;
    @Before
    public void before() {
        //update with new instances each time
        basicArray = new BasicArray();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getDayOfWeek(){
        assertEquals("Sunday", basicArray.dayOfWeek(7));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getReverseArrInt(){
        assertEquals("[3, 2, 1]", basicArray.reverseArrInt(1,2,3));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getReverseArrStr(){
        assertEquals("[three, two, one]", basicArray.reverseArrStrings("one", "two", "three"));
    }
    //Test Problem 04----------------------------------------------------------------------------------
    @Test
    public void getOddEvenSubtract(){
        assertEquals("3", basicArray.oddEvenSubtract(1,2,3,4,5,6));
    }




}
