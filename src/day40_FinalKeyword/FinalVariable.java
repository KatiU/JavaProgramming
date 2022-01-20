package day40_FinalKeyword;

public class FinalVariable {
    public static void main(String[] args) {
        final double pi = 3.14;

       //  pi = 4.14; can not be reassigned

        final String name;
        name = "Java";
       // name = "Wooden spoon"; can not be reassigned
        System.out.println(name);
    }
}
