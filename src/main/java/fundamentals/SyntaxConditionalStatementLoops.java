package fundamentals;

public class SyntaxConditionalStatementLoops {
    public SyntaxConditionalStatementLoops(){}

//Problem 01 studentInfo
//Print the input in the following format:
//"Name: {name}, Age: {age}, Grade {grade}"
//Format the grade to 2 decimal places

    public String studentInfo(String name, int age, double grade){
        //How do I limit a double digit in Java?
        return String.format("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }


//Problem 02 add30Min
//    Write a program that reads hours and minutes from the console
//    and calculates the time after 30 minutes
//
     public String add30Min(int hour, int min){

        if(min + 30 > 60){
            if(hour > 24){
                hour = 1;
            }else {
                hour++;
            }

            min -= 30;
        }else {
            min += 30;
        }
        return String.format("%d:%d", hour,min);
    }

//Problem 03 language
//By given country print its typical language:
//   ▪ English -> England, USA
//   ▪ Spanish -> Spain, Argentina, Mexico
//   ▪ other -> unknown
    public String language(String country){
        String language;
        if(country == "Spain" || country == "Mexico"){
            language = "spanish";
        }else if(country == "England" || country == "USA"){
            language = "english";
        }else {
            language = "unknown";
        }
        return language;
    }
//Problem 04 firstOddNumAndSum
// Write a program to print the first n odd numbers and their sum
    public int firstOddNumAndSum(int n){
        int sum = 0;
        for (int i = 1; i < n * 2; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }

//Problem 05 age
//Write a program that determines whether a person is based on the given age:
// baby, child, teenager, adult, or elder. The bounders are:
//0-2 – baby;
//3-13 – child;
//14-19 – teenager;
//20-65 – adult;
//>=66 – elder;

    public String age(int age){
        String person = "";
        if(age >=0 && age <=2){
            person = "baby";
        } else if (age >=3 && age <=13) {
            person = "child";
        } else if (age >=14 && age <=19) {
            person = "teenager";
        } else if (age >=20 && age <=65) {
            person = "adult";
        } else if (age >=66) {
            person = "elder";
        }
        return person;
    }

//Problem 06 divisible
//    You will be given an integer, and you have to print whether that number is divisible by the following numbers: 2, 3, 6, 7, 10.
//    You should always take the bigger division.
//    If the number is divisible by both 2 and 3 it is also divisible by 6, and you should print only the division by 6.
//    If a number is divisible by 2 it is sometimes also divisible by 10, and you should print the division by 10.
//    If the number is not divisible by any given number, print "Not divisible".
//    Otherwise, print "The number is divisible by {number}".

    public String divisible(int number){
        int divisibleBy = 1;
        if(number % 10 == 0){
            divisibleBy = 10;
        }else if(number % 6 == 0){
            divisibleBy = 6;
        }else if(number % 3 == 0){
            divisibleBy = 3;
        }else if(number % 2 == 0){
            divisibleBy = 2;
        }else{
            return "Not divisible";
        }
        return String.format("The number is divisible by %d",divisibleBy);
    }

////Problem 07 printAndSum
//Write a program to display numbers from given start to given end and their sum.
// All the numbers will be integers. On the first line, you will receive the start number, on the second the end number.

    public int printAndSum(int startNum, int endNum){
        int sum = 0;
        for (int i = startNum; i <=endNum; i++){
            sum += i;
        }
        return sum;
    }

}
