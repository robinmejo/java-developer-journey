/*
Exercise 17 of 60 — Find the Maximum of Four Numbers

Write a Java program using if-else to find the largest
among four numbers.
*/

public class $17_MaxOfFour {
    public static void main(String[] args) {
        int a = 12;
        int b = 45;
        int c = 27;
        int d = 33;

        if(a>=b && a>=c && a>=d){
            System.out.println("Maximum number is "+a);
        }
        else if(b>=a && b>=c && b>=d){
            System.out.println("Maximum number is "+b);
        }
        else if(c>=a && c>=b && c>=d){
            System.out.println("Maximum number is "+c);
        }
        else{
            System.out.println("Maximum number is "+d);
        }
    }
}