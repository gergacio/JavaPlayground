package fundamentals;

import java.math.BigDecimal;
import java.math.MathContext;


public class B_DataTypes {
    public B_DataTypes(){}

    //Problem 01-------------------------------------------------------------------------
    //Write a program that converts meters to kilometers formatted to the second decimal point

    public String convertMeterToKilometer(double meter){
        return String.format("%.2f",meter * 0.001);
    }
    //Problem 02-------------------------------------------------------------------------
    //Write a program to enter n numbers and print their exact sum:
    //0.00000000003 + 333333333333.3 = 333333333333.30000000003
    //so
    // 123.45 has a precision of 5 and a scale of 2!!
    //Always use BigDecimal when you play with very big/small real numbers!
    public BigDecimal exactSum(double numOne, double numTwo){
        BigDecimal result;
        BigDecimal sum = new BigDecimal(0);
        BigDecimal bdNumOne = new BigDecimal(numOne);
        BigDecimal bdNumTwo = new BigDecimal(numTwo);
        sum = sum.add(bdNumOne).add(bdNumTwo);
        //use MathContext to round it
        MathContext mc = new MathContext(11); // 11 precision
        result = sum.round(mc);
        return result;
    }
    //Problem 03-------------------------------------------------------------------------
    //A number is special when its sum of digits is 5, 7 or 11
    public  String specialNumber(int number){
        //split number in digits, than sum
        int sum = 0;
        while (number != 0){
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return String.format("%d",sum);
    }
    //Problem 04-------------------------------------------------------------------------
    //Write a program that takes characters and prints them in
    //reversed order with a space between them
    public String revChars(char... params){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < params.length;i++){
            sb.append(params[i]);
        }
        sb = sb.reverse();
        return sb.toString();
    }

//Problem 05 sumDigits
//You will be given a single integer. Your task is to find the sum of its digits.
    public int sumDigits(int number){
        int digitSum = 0;
        while(number != 0){
            int digit = number % 10;
            digitSum += digit;
            number = number / 10;
        }
        return digitSum;
    }

//Problem 06. Elevator
//Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
//The input holds two lines: the number of people n and the capacity p of the elevator.

    public int elevator(int n, int p){
        int output = 1;
        if(n > p) {
            output = n / p + 1;
        }
        return output;
    }

//Problem 07. Sum of Chars
//Write a program that sums the ASCII codes of n characters. Print the sum on the console.

    public int sumOfChars(String input){
        int sum = 0;
        char [] chArr = input.toCharArray();
        for (int i = 0; i < chArr.length; i++){
            sum += (int)chArr[i];
        }
        return sum;
    }

//Problem 08. 5.Print Part of the ASCII Table
//Find online more information about ASCII
// (American Standard Code for Information Interchange)
// and write a program that prints part of the ASCII table of characters.
// will receive the char start/end index

    public String printPartAscii(int start, int end){
        StringBuilder partAscii = new StringBuilder();
        for(int i = start; i <= end; i++){
            Character ch = (char)i;
            partAscii.append(ch);
        }


        return partAscii.toString();
    }

//Problem 09 Data Type Finder
//input - value, output - data type

    public String dataTypeFinder(String input){

        String output = "";



        Boolean isInteger = true;
        try {
            int integerValue = Integer.parseInt(input);
        } catch (NumberFormatException e){
            isInteger = false;
        }

        Boolean isDouble = true;
        try {
            Double doubleValue = Double.parseDouble(input);
        } catch (NumberFormatException e){
            isDouble = false;
        }

        if(isInteger){
            output = "integer";
        } else if (isDouble) {
            output = "double";
        } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))) {
            output = "boolean";
        }else {
            output = "string";
        }
        return output;


    }

//Problem 10. leftRightNumber
//receive a string with 2 numbers separated by a single space. You need to compare them.
// If the left number is greater than the right number, you need to print the sum of all digits in the left number,
// otherwise, print the sum of all digits in the right number.

    public int leftRightNumber(String input){

        int sum , leftNumber, rightNumber = 0;
        int leftSum = 0;
        int rightSum = 0;
        String[] splitStr = input.split(" ");
        leftNumber = Integer.parseInt(splitStr[0]);
        rightNumber = Integer.parseInt(splitStr[1]);

        while (leftNumber != 0){
            int digit = leftNumber % 10;
            leftSum += digit;
            leftNumber = leftNumber / 10;
        }
        while (rightNumber != 0){
            int digit = rightNumber % 10;
            rightSum += digit;
            rightNumber = rightNumber / 10;
        }
        if(leftSum >= rightSum){
            sum = leftSum;
        }else{
            sum = rightSum;
        }

        return sum;
    }

//Problem 11  floatingEquality
//Write a program that safely compares floating-point numbers (double) with precision eps = 0.000001.
// Note that we cannot directly compare two floating-point numbers a and b by a==b ,
// because of the nature of the floating-point arithmetic.
// Therefore, we assume two numbers are equal if they are closer to each other than some fixed constant eps.
// Your task is to compare the values of the two numbers.

    public Boolean floatingEquality(Double numberOne, Double numberTwo){
        Boolean isEqual = Boolean.TRUE;
        Double eps = 0.000001;
        Double result = Math.abs(numberTwo - numberOne);
        if(result > eps){
            isEqual = Boolean.FALSE;
        }

        return isEqual;
    }


}
