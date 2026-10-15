//Write a Java program to find the largest among three numbers using if-else if-else.
public class $7_LargestOfThree {
    public static void main(String[] args) {
        int a = 15;
        int b = 28;
        int c = 19;

        System.out.println(a>=b && a>=c?"A is the largest":b>=a && b>=c?"b is the largest":"C is the largest");
    }
}

//nested ternary operator