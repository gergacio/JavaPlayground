package fundamentals;

import java.util.ArrayList;

public class C_Arrays {

    public C_Arrays(){}

    //Problem 01------------------------------------------------------------------------
    //Enter a day number [1…7] and print
    //the day name (in English) or "Invalid day!"
    public String dayOfWeek(int dayNumber){
        String dayName;
        switch(dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;

            default:
               dayName = "Invalid day";
        }
        return dayName;
    }
    //Problem 02------------------------------------------------------------------------
    //Reverse an Array of Integers
    public String reverseArrInt(int... params){

        Integer [] arr = new Integer[params.length];
        for (int i =0; i < params.length; i++){
            arr[i] = params[params.length  - i - 1];
        }
        return String.format("%s", java.util.Arrays.toString(arr));
    }
    //Problem 02------------------------------------------------------------------------
    //Reverse an Array of Strings
    public String reverseArrStrings(String... params){

        String [] arr = new String[params.length];
        for (int i =0; i < params.length; i++){
            arr[i] = params[params.length  - i - 1];
        }
        return String.format("%s", java.util.Arrays.toString(arr));
    }
    //Problem 03------------------------------------------------------------------------
    // Even and Odd Subtraction
    public String oddEvenSubtract(int... params){
        int difference = 0;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i =0; i < params.length; i++){
            if(params[i] % 2 != 0){
                sumOdd += params[i];
            }else {
                sumEven += params[i];
            }
        }
        difference = Math.abs(sumOdd - sumEven);

        return String.format("%d", difference);
    }

//Problem 04 equalArrays
// Arrays are identical if their elements are equal.
// If the arrays are identical, find the sum of the first one and print on the console the following message:
// "Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ and print message:
// "Arrays are not identical.
// Found difference at {index} index."

    public String equalArrays(int[] leftArr, int[] rightArr){
        int index = 0;
        int sum = 0;
        Boolean isIdentical = Boolean.TRUE;
        String output = "";
       for(int i = 0; i < leftArr.length; i++){
           sum += leftArr[i];
           if(leftArr[i] != rightArr[i]){
               index = i;
               isIdentical = Boolean.FALSE;
               break;
           }


       }
       if(!isIdentical){
           output = String.format("Arrays are not identical. Found difference at %d index.", index);
       }else {
            output = String.format("Arrays are identical. Sum: %d", sum);
       }
       return output;
    }

//Problem 05  Condense Array to Number
// summing adjacent couples of elements until a single integer is obtained.

    public int condenseArray(int...arr){

        while(arr.length != 1){
            int[] b = new int[arr.length - 1];
            for (int i = 0;i < arr.length - 1 ;i++ ){
                b[i] = arr[i] + arr[i+1];
            }
            arr = b;
        }
       return arr[0];

    }

//Problem 06 Top Integers
//Write a program to find all the top integers in an array.
// A top integer is an integer that is bigger than all the elements to its right.
    public ArrayList findTopInteger(int...arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            Boolean isTop = Boolean.TRUE;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    isTop = Boolean.FALSE;
                }
            }
            if(isTop){
                list.add(arr[i]);
            }

        }
        return list;

    }

//Problem 07 7.Max Sequence of Equal Elements
//Write a program that finds the longest sequence of equal elements in an array of integers.
//If several longest sequences exist, print the leftmost one.
    public ArrayList maxSeqEqualNum(int...arr){
        ArrayList<Integer> list = new ArrayList<>();
        int element = 0;
        int length = 1;
        for(int i = 0; i < arr.length; i++){
            int tempLength = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] != arr[j]){
                    break;
                }
                tempLength++;
            }
            if(tempLength > length){
                length = tempLength;
                element = arr[i];
            }
        }
        for (int i = 0; i < length; i++){
            list.add(element);
        }
        return list;

    }

}
