// Problem: Write a Java program to check whether a number is even or odd.

public class $6_EvenOdd {
    public static void main(String[] args) {
        int number = 17;

       //number%2==0?System.out.println(number + " is a Even number"):System.out.println(number + " is a Odd number");
       if(number%2==0){
            System.out.println(number + " is a Even number");
       }
       else{
        System.out.println(number + " is a Odd number");
       }
    }
}

/*
System.out.println(
    number % 2 == 0
        ? number + " is an even number"
        : number + " is an odd number"
);

*/