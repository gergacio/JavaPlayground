public class ConditionsLoops {
    public ConditionsLoops(){}

    //Problem 01------------------------------------------------------------------------
    //Print the input in the following format:
    //"Name: {name}, Age: {age}, Grade {grade}"
    //Format the grade to 2 decimal places

    public String studentInfo(String name, int age, double grade){
        //How do I limit a double digit in Java?
        return String.format("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }


    //Problem 02-------------------------------------------------------------------------
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

    //Problem 03 ---------------------------------------------------------------------------
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
    //Problem 04 ---------------------------------------------------------------------------
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
}
