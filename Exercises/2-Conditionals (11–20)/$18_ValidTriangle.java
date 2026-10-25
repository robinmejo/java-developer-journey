/*
Exercise 18 of 60 — Check Whether a Triangle Is Valid

Write a Java program using if-else to check whether a triangle
is valid when three side lengths are given.

Rule:
The sum of any two sides must be greater than the third side.
Hint: Check all three conditions:
- a + b > c
- a + c > b
- b + c > a
*/

public class $18_ValidTriangle {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }
    }
}