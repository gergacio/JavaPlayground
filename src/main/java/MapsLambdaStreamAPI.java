import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;
public class MapsLambdaStreamAPI {
    public MapsLambdaStreamAPI(){}
    //Problem 01----------------------------------------------------------------------------------
    //Read a list of real numbers and print them in ascending order
    //along with their number of occurrences

    //java.util
    //Class HashMap<K,V>
    //Hash table based implementation of the Map interface!!
    public String countNumbers(ArrayList<Integer> list){
        HashMap<Integer, Integer> countNum = new HashMap<>();
        for (int i = 0; i < list.size(); i++){
            if(!countNum.containsKey(list.get(i))){
                //new value pair
                countNum.put(list.get(i),1);
            }else {
                //found key,update value
                Integer updatedValue = countNum.get(list.get(i));
                updatedValue += 1;
                countNum.replace(list.get(i), updatedValue);
            }
        }
        return String.format("%s",countNum.toString());
    }
    //Problem 02----------------------------------------------------------------------------------
    //Print only words which length is even
    //Interface Stream<T> - A sequence of elements supporting sequential and parallel aggregate operations!!
    public String wordFilter(String [] words){
        List<String> result = Arrays.stream(words).filter(s->s.length() % 2 == 0).toList();
        return String.format("%s",result.toString());
    }
    //Problem 03----------------------------------------------------------------------------------
    //Print largest 3 nums from given collection, if there are less than 3, print all of them
    public String largestThreeNum(Integer[] arr){
        List<Integer> list = Arrays.asList(arr);

        if(arr.length > 3){
            list = list.stream()
                    .sorted(Comparator.reverseOrder()).limit(3)
                    .collect(Collectors.toList());
        }
        return String.format("%s",list);
    }
}
