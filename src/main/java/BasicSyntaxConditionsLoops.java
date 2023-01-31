public class BasicSyntaxConditionsLoops {
    public BasicSyntaxConditionsLoops(){}
    public String studentInfo(String name, int age, double grade){
        //How do I limit a double digit in Java?
        return String.format("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }
}
