import fundamentals.F_Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EListsTest {
    F_Lists ELists;
    @Before
    public void before() {
        //update with new instances each time
        ELists = new F_Lists();
    }
    //Test Problem 01----------------------------------------------------------------------------------
    //Code is made for more than two given numbers into the list
    @Test
    public void getAdjacentList(){
        ArrayList<Integer> actualList = new ArrayList(){
            {
                add(12);
                add(3);
                add(3);
                add(6);
                add(1);
                add(4);
                add(2);
                add(2);
            }
        };
        assertEquals("[24, 1, 8]", ELists.adjacentList(actualList));
    }
    //Test Problem 02----------------------------------------------------------------------------------
    @Test
    public void getGaussTrick(){
        ArrayList<Integer> actualList = new ArrayList(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(6);
            }
        };
        assertEquals("[7, 6, 3]", ELists.gaussTrick(actualList));
    }
    //Test Problem 03----------------------------------------------------------------------------------
    @Test
    public void getReorder(){
        ArrayList<Integer> actualList = new ArrayList(){
            {
                add(2);
                add(3);
                add(1);
            }
        };
        assertEquals("[3, 2, 1]", ELists.reorder(actualList));
    }

    //Test Problem 04
    @Test
    public void getListManipulation(){
        assertEquals("[0, 1, 2]", ELists.listManipulation("remove 41",0, 1, 2, 41));
    }
    //Test Problem 05
    @Test
    public void getRemoveNegativeAndReverse(){
        assertEquals("Empty", ELists.removeNegativesAndReverse(-1, -2, -1, -3));
    }


}
