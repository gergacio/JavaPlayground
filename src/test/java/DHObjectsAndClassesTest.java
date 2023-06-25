import fundamentals.H_ObjectsAndClasses;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DHObjectsAndClassesTest {
    H_ObjectsAndClasses DHObjectsAndClasses;

    @Before
    public void before() {
        //update with new instances each time
        DHObjectsAndClasses = new H_ObjectsAndClasses();
    }
    //Test Problem 01--------------------------------------------------------------------------

    @Test
    public void getRandomizeWords(){

       Integer[] actualArray = {2,3,4,5};
       //pass new arr but not actualArray!!
       Integer[] expectedArr = DHObjectsAndClasses.randomizeWords(new Integer[]{2,3,4,5});

        assertEquals(false,  actualArray.equals(expectedArr));
    }
    //Test Problem 02--------------------------------------------------------------------------

}
