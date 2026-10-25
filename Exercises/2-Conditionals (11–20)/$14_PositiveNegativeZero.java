/*
Exercise 14 of 60 — Positive, Negative, or Zero
Write a Java program using if-else if-else to classify a number.
*/
public class $14_PositiveNegativeZero {
    public static void main(String[] args) {
        int number = -5;

        if(number>0){
            System.out.println("positive number");
        }
        else if(number==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative Number");
        }
    }
}