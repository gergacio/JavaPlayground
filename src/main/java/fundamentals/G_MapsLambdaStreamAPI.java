package fundamentals;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;



public class G_MapsLambdaStreamAPI {
    public G_MapsLambdaStreamAPI(){}
    //Problem 01----------------------------------------------------------------------------------
    //Read a list of real numbers and print them in ascending order
    //along with their number of occurrences

    //java.util
    //Class HashMap<K,V>
    //Hash table based implementation of the Map interface!!
    public String countNumbers(ArrayList<Integer> list){
        HashMap<Integer, Integer> dict = new HashMap<>();
        for(int i = 0; i < list.size(); i++){
            if(dict.containsKey(list.get(i))){
                dict.put(list.get(i), dict.get(list.get(i)) + 1);
            }else{
                dict.put(list.get(i),1);
            }
        }
        return dict.toString();

    }


    //Problem 02 4.Word Filter
    //Read an array of strings, and take only words whose length is even

    public String wordFilter(String input){
        String[] words = input.split(" ");
        List<String> evenLenWords = Arrays.stream(words).filter(w -> w.length() % 2 == 0).collect(Collectors.toList());
        return evenLenWords.toString();
    }
}
