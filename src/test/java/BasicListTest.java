import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BasicListTest {
    BasicList basicList;
    @Before
    public void before() {
        //update with new instances each time
        basicList = new BasicList();
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
        assertEquals("[24, 1, 8]", basicList.adjacentList(actualList));
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
        assertEquals("[7, 6, 3]", basicList.gaussTrick(actualList));
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
        assertEquals("[3, 2, 1]",basicList.reorder(actualList));
    }


}
