import fundamentals.I_TextProcessing;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ITextProcessingTest {
    I_TextProcessing ITextProcessing;

    @Before
    public void before() {
        //update with new instances each time
        ITextProcessing = new I_TextProcessing();
    }
    //Test Problem 01--------------------------------------------------------------------------
    @Test
    public void getRepeatStrings(){
       String[] actualArr = {"1", "22", "333"};
       assertEquals("12222333333333", ITextProcessing.repeatStrings(actualArr));
    }
    //Test Problem 02--------------------------------------------------------------------------
    @Test
    public void getRemoveSubstring(){
        String text = "meansomethingmean";
        assertEquals("something", ITextProcessing.removeSubstring("mean",text));
    }
    //Test Problem 03--------------------------------------------------------------------------
    @Test
    public void getTextFilter(){
        assertEquals("It is not *, it is GNU/*.", ITextProcessing.textFilter("Linux","It is not Linux, it is GNU/Linux."));
    }



}
