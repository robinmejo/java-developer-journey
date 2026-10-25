/*
Exercise 20 of 60 — Determine BMI Category

Write a Java program using if-else to calculate BMI
and determine the person's BMI category.

Formula:
BMI = weight (kg) / (height (m) * height (m))

Categories:
- BMI < 18.5: Underweight
- BMI < 25: Normal weight
- BMI < 30: Overweight
- BMI >= 30: Obese
*/

public class $20_BMICategory {
    public static void main(String[] args) {
        double weight = 70.0; // in kilograms
        double height = 1.75; // in meters

        double BMI = weight / (height * height);
        System.out.printf("BMI: %.2f%n" , BMI);
        if (BMI >= 30) {
            System.out.println("Obese");
        } else if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI < 25) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Overweight");
        }
    }
}