import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class MapsLambdaStreamAPITest {
    MapsLambdaStreamAPI mapsLambdaStreamAPI;

    @Before
    public void before() {
        //update with new instances each time
        mapsLambdaStreamAPI = new MapsLambdaStreamAPI();
    }
    //Test Problem 01--------------------------------------------------------------------------
    @Test
    public void getCountNumbers(){
        ArrayList<Integer> actualList = new ArrayList(){
            {
                add(1);
                add(2);
                add(1);
                add(1);
                add(1);
            }
        };
        assertEquals("{1=4, 2=1}", mapsLambdaStreamAPI.countNumbers(actualList));
    }
    //Test Problem 02--------------------------------------------------------------------------
    @Test
    public void getWordFilter(){
        String[] words = {"java", "java script"};
        assertEquals("[java]", mapsLambdaStreamAPI.wordFilter(words));
    }
    //Test Problem 03--------------------------------------------------------------------------
    @Test
    public void getLargestThreeNum(){
        Integer[] numbers = {20, 1, 10, 30, 4};
        assertEquals("[30, 20, 10]", mapsLambdaStreamAPI.largestThreeNum(numbers));
    }
}
