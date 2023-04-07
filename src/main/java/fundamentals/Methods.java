package fundamentals;

public class Methods {
    public Methods(){}
    //Problem 01------------------------------------------------------------------------
    //Write a method that receives a grade between 2.00 and 6.00
    //and prints the corresponding grade in words
        // ▪ 2.00 - 2.99 - "Fail"
        // ▪ 3.00 - 3.49 - "Poor"
        // ▪ 3.50 - 4.49 - "Good"
        // ▪ 4.50 - 5.49 - "Very good"
        // ▪ 5.50 - 6.00 - "Excellent"
    public String grades(double grade){
        String gradeName;
        switch((grade >= 2.00 && grade <= 2.99) ? 1 : (grade >= 3.00 && grade <= 3.49) ? 2:
                (grade >= 3.50 && grade <= 4.49) ? 3 : (grade >= 4.50 && grade <= 5.49) ? 4 :
        (grade >= 5.50 && grade <= 6.00) ? 5 : 0) {
            case 1:
                gradeName = "Fail";
                break;
            case 2:
                gradeName = "Poor";
                break;
            case 3:
                gradeName = "Good";
                break;
            case 4:
                gradeName = "Very good";
                break;
            case 5:
                gradeName = "Excellent";
                break;
            default:
                gradeName = "Invalid grade";
        }
        return gradeName;
    }

    //Problem 02------------------------------------------------------------------------
    //Create a method that calculates and returns the value of a
    //number raised to a given power
    public double mathPower(double num, int power){
        double result = 1;
        for (int i =0; i < power; i++){
            result *= num;
        }
        return result;
    }
//problem 03
//smallest of three num
    public Integer smallestOfThreeNum(int...arr){
        int smallest = arr[0];
        if(smallest > arr[1]){
            smallest = arr[1];
        } else if (smallest > arr[2]) {
            smallest = arr[2];
        }
        return smallest;
    }

//Problem 04 countOfVowels
    public int countOfVowels(String input){
        char[] vowels = {'a','e','i','o','u'};
        input = input.toLowerCase();

        int count = 0;
        for(int i = 0; i < vowels.length; i++){
            if(input.indexOf(vowels[i]) != -1){
                count++;
            }

        }
        return count;

    }

//Problem 058.Factorial Division
//Read two integer numbers. Calculate the factorial of each number.
// Divide the first result by the second and print the division formatted to the second decimal point.

    public String factorialDivision(int n, int m){
        int factN = 1;
        int factM = 1;
        double result;
        for(int i = 2; i <= n; i++){
            factN = factN * i;
        }
        for(int i = 2; i <= m; i++){
            factM = factM * i;
        }
        result = factN / factM;
        return String.format("%.2f",result);
    }



}
