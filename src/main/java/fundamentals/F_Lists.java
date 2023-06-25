package fundamentals;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.String.format;


public class F_Lists {
    public F_Lists(){}

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
        return format("%s",list);
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

       return format("%s",list);
    }

    //Problem 03----------------------------------------------------------------------------------
    //reorder List
    public String reorder(ArrayList<Integer> list){
        Collections.sort(list);
        Collections.reverse(list);
        return format("%s",list);
    }

    //Problem 04. List Manipulation Basics
    //Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
    //Add {number}: add a number to the end of the list
    //Remove {number}: remove a number from the list
    //RemoveAt {index}: remove a number at a given index
    //Insert {number} {index}: insert a number at a given index
    public String listManipulation(@NotNull String input, Integer...arr){

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,arr);
        String[] result = input.split(" ");
        String command = result[0];

        if(command.equals("add")){
            Integer element = Integer.parseInt(result[1]);
            list.add(element);
        }
        if(command.equals("remove")){
            Integer element = Integer.parseInt(result[1]);
            list.remove(element);

        }
        if(command.equals("removeAt")){
            int index = Integer.parseInt(result[1]);
            list.remove(index);
        }
        if(command.equals("insert")){
            int index = Integer.parseInt(result[1]);
            int element = Integer.parseInt(result[2]);
            list.add(index, element);
        }
        return String.format("%s",list);

    }

    //Problem 05 7.Remove Negatives and Reverse
    //Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
    // In case of no elements left in the list, print "empty".
    public String removeNegativesAndReverse(Integer...arr){
        List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());
        list.removeIf(n ->  n < 0);



        String output = "Empty";
        if(list.size() > 0){
            Collections.reverse(list);
            output = String.format("%s", list);
        }
        return output;
    }

}
