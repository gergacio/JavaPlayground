package fundamentals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String input = "insert 0 111";
        Integer[] arr = {0,-1,1, 23, 24, 25};

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,arr);
        String[] result = input.split(" ");

        String command = result[0];

        int a = 4;
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



        System.out.printf("%s",list);



    }
}
