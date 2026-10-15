/*

Write a Java program to calculate simple interest.

SI = (p*r*t)/100

*/

public class $8_SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}