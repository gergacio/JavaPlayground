import fundamentals.SyntaxConditionalStatementLoops;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SyntaxConditionalStatementLoopsTest {
    SyntaxConditionalStatementLoops syntaxConditionalStatementLoops;
    @Before
    public void before() {
        //update with new instances each time
        syntaxConditionalStatementLoops = new SyntaxConditionalStatementLoops();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getStudentInfo(){
        String expected = String.format("Name: Peter, Age: 24, Grade: 5.00");
        assertEquals(expected, syntaxConditionalStatementLoops.studentInfo("Peter", 24,5.00));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getAdd30min(){
        assertEquals("13:10", syntaxConditionalStatementLoops.add30Min(12, 40));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getLanguage(){
        assertEquals("spanish", syntaxConditionalStatementLoops.language("Mexico"));
    }
    //Test Problem 04----------------------------------------------------------------------------------
    @Test
    public void getFirstOddNumAndSum(){
        assertEquals(9, syntaxConditionalStatementLoops.firstOddNumAndSum(3));
    }

    //Test problem 05-------------------------------------------------------------------------------------------

    @Test
    public void getPerson(){
        assertEquals("baby", syntaxConditionalStatementLoops.age(2));
    }

    //Test problem 06-------------------------------------------------------------------------------------------
    @Test
    public void getDivisible(){
        assertEquals("The number is divisible by 6", syntaxConditionalStatementLoops.divisible(12));
    }

    //Test problem 07-------------------------------------------------------------------------------------------
    @Test
    public void getPrintAndSum(){
        assertEquals(605, syntaxConditionalStatementLoops.printAndSum(50,60));
    }




}
