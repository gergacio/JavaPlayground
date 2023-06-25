package fundamentals;

import java.math.BigInteger;
import java.util.Random;

public class H_ObjectsAndClasses {
    public H_ObjectsAndClasses(){};
    //Problem 01----------------------------------------------------------------------------------
    //You are given a list of words - Randomize their order
    //  // Implementing Fisher–Yates shuffle
    public Integer[] randomizeWords(Integer[] array){

        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return   array;
    }
    //Problem 02----------------------------------------------------------------------------------
    //Calculate n! (n factorial) for very big n (e. g. 1000)
    //5! = 5 × 4 × 3 × 2 × 1 = 120
    //I am using BigInteger because of exponential growth
    public BigInteger bigFactorial(int number){
        BigInteger bi = new BigInteger("1");
        for (int i = 1; i <= number; number++){
            bi.multiply(new BigInteger("i"));
        }
        return bi;
    }
}
