import fundamentals.A_Syntax_Conditional_Statement_Loops;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ASyntaxConditionalStatementLoopsTest {
    A_Syntax_Conditional_Statement_Loops ASyntaxConditionalStatementLoops;
    @Before
    public void before() {
        //update with new instances each time
        ASyntaxConditionalStatementLoops = new A_Syntax_Conditional_Statement_Loops();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    @Test
    public void getStudentInfo(){
        String expected = String.format("Name: Peter, Age: 24, Grade: 5.00");
        assertEquals(expected, ASyntaxConditionalStatementLoops.studentInfo("Peter", 24,5.00));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getAdd30min(){
        assertEquals("13:10", ASyntaxConditionalStatementLoops.add30Min(12, 40));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getLanguage(){
        assertEquals("spanish", ASyntaxConditionalStatementLoops.language("Mexico"));
    }
    //Test Problem 04----------------------------------------------------------------------------------
    @Test
    public void getFirstOddNumAndSum(){
        assertEquals(9, ASyntaxConditionalStatementLoops.firstOddNumAndSum(3));
    }

    //Test problem 05-------------------------------------------------------------------------------------------

    @Test
    public void getPerson(){
        assertEquals("baby", ASyntaxConditionalStatementLoops.age(2));
    }

    //Test problem 06-------------------------------------------------------------------------------------------
    @Test
    public void getDivisible(){
        assertEquals("The number is divisible by 6", ASyntaxConditionalStatementLoops.divisible(12));
    }

    //Test problem 07-------------------------------------------------------------------------------------------
    @Test
    public void getPrintAndSum(){
        assertEquals(605, ASyntaxConditionalStatementLoops.printAndSum(50,60));
    }




}
