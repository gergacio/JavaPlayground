import fundamentals.G_MapsLambdaStreamAPI;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class GMapsLambdaStreamAPITest {
    G_MapsLambdaStreamAPI GMapsLambdaStreamAPI;

    @Before
    public void before() {
        //update with new instances each time
        GMapsLambdaStreamAPI = new G_MapsLambdaStreamAPI();
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
        assertEquals("{1=4, 2=1}", GMapsLambdaStreamAPI.countNumbers(actualList));
    }
    //Test Problem 02--------------------------------------------------------------------------
    @Test
    public void getWordFilter(){

        assertEquals("[java, JS]", GMapsLambdaStreamAPI.wordFilter("java C JS C++"));
    }

}
