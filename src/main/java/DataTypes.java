import java.math.BigDecimal;
import java.math.MathContext;


public class DataTypes {
    public DataTypes(){}

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

}
