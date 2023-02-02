import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MethodsTest {
    Methods methods;
    @Before
    public void before() {
        //update with new instances each time
        methods = new Methods();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getGrades(){
        assertEquals("Very good", methods.grades(5.20));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getMathPower(){
        assertEquals(256, methods.mathPower(2,8),0);
    }
}
