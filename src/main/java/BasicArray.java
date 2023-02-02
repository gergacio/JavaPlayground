import java.util.Arrays;

public class BasicArray {

    public BasicArray(){}

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
        return String.format("%s", Arrays.toString(arr));
    }
    //Problem 02------------------------------------------------------------------------
    //Reverse an Array of Strings
    public String reverseArrStrings(String... params){

        String [] arr = new String[params.length];
        for (int i =0; i < params.length; i++){
            arr[i] = params[params.length  - i - 1];
        }
        return String.format("%s", Arrays.toString(arr));
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
}
