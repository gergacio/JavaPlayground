import fundamentals.ObjectsAndClasses;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObjectsAndClassesTest {
    ObjectsAndClasses objectsAndClasses;

    @Before
    public void before() {
        //update with new instances each time
        objectsAndClasses = new ObjectsAndClasses();
    }
    //Test Problem 01--------------------------------------------------------------------------

    @Test
    public void getRandomizeWords(){

       Integer[] actualArray = {2,3,4,5};
       //pass new arr but not actualArray!!
       Integer[] expectedArr = objectsAndClasses.randomizeWords(new Integer[]{2,3,4,5});

        assertEquals(false,  actualArray.equals(expectedArr));
    }
    //Test Problem 02--------------------------------------------------------------------------

}
