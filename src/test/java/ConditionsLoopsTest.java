import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConditionsLoopsTest {
    ConditionsLoops conditionsLoops;
    @Before
    public void before() {
        //update with new instances each time
        conditionsLoops = new ConditionsLoops();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getStudentInfo(){
        String expected = String.format("Name: Peter, Age: 24, Grade: 5.00");
        assertEquals(expected, conditionsLoops.studentInfo("Peter", 24,5.00));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getAdd30min(){
        assertEquals("13:10", conditionsLoops.add30Min(12, 40));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getLanguage(){
        assertEquals("spanish", conditionsLoops.language("Mexico"));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getFirstOddNumAndSum(){
        assertEquals(9, conditionsLoops.firstOddNumAndSum(3));
    }



}
