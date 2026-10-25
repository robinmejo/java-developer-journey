/*
Exercise 13 of 60 — Check Whether a Year Is a Leap Year 📅
Write a Java program using if-else to determine whether a year is a leap year.

Rules:
- Divisible by 400 → leap year.
- Otherwise, divisible by 100 → not a leap year.
- Otherwise, divisible by 4 → leap year.
- Otherwise → not a leap year.
*/

public class $13_LeapYear {
    public static void main(String[] args) {
        int year = 1900;

        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}