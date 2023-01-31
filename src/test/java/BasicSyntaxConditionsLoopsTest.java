import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicSyntaxConditionsLoopsTest {
    BasicSyntaxConditionsLoops basicSyntaxConditionsLoops;
    @Before
    public void before() {
        //update with new instances each time
        basicSyntaxConditionsLoops = new BasicSyntaxConditionsLoops();
    }
    @Test
    public void getStudentInfo(){
        String expected = String.format("Name: Peter, Age: 24, Grade: 5.00");
        assertEquals(expected,basicSyntaxConditionsLoops.studentInfo("Peter", 24,5.00));
    }




}
