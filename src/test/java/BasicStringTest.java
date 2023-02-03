import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BasicStringTest {
    BasicString basicString;

    @Before
    public void before() {
        //update with new instances each time
        basicString = new BasicString();
    }
    //Test Problem 01--------------------------------------------------------------------------
    @Test
    public void getRepeatStrings(){
       String[] actualArr = {"1", "22", "333"};
       assertEquals("12222333333333", basicString.repeatStrings(actualArr));
    }
    //Test Problem 02--------------------------------------------------------------------------
    @Test
    public void getRemoveSubstring(){
        String text = "meansomethingmean";
        assertEquals("something", basicString.removeSubstring("mean",text));
    }
    //Test Problem 03--------------------------------------------------------------------------
    @Test
    public void getTextFilter(){
        assertEquals("It is not *, it is GNU/*.",basicString.textFilter("Linux","It is not Linux, it is GNU/Linux."));
    }



}
