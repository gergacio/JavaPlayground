import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicList {
    public BasicList(){}

    //Problem 01----------------------------------------------------------------------------------
    //Write a program to sum all adjacent equal numbers in a list of
    //decimal numbers, starting from left to right
        //3 3 6 1 => 12 1
    public String adjacentList(ArrayList<Integer> list){
        //3 3 6 1
        boolean noAdj = true;
        while (true){

                for (int i = 0; i < list.size() - 1; i++){
                    if(list.get(i) == list.get(i + 1)){
                        Integer elem = list.get(i) + list.get(i + 1);
                        list.set(i, elem);
                        list.remove(i + 1);
                        noAdj = false;
                        break;
                    }
                    noAdj = true;
                }
                if(noAdj == true){
                    break;
                }
        }
        return String.format("%s",list);
    }
    //Problem 02----------------------------------------------------------------------------------
    //Write a program that sums all numbers in a list in the
    //following order:
    //first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last – n
    public String gaussTrick(ArrayList<Integer> list){
        Integer  size = list.size() /2;
        Boolean isMiddle = false;
        Integer middleElem = list.get(list.size() / 2);
       if(list.size() % 2 != 0) {
            size++;
            isMiddle = true;
        }

       for (int i =0; i < size; i++){
           Integer elem = list.get(i) + list.get(list.size()- 1);
           list.set(i, elem);
           list.remove(list.size()  - 1);

       }
       if(isMiddle == true){
           list.add(middleElem);
       }

       return String.format("%s",list);
    }

    //Problem 03----------------------------------------------------------------------------------
    //reorder List
    public String reorder(ArrayList<Integer> list){
        Collections.sort(list);
        Collections.reverse(list);
        return String.format("%s",list);
    }
}
