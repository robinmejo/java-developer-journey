/*
Write a Java program to classify a triangle by its sides.

Rules:
- Equilateral: all three sides are equal.
- Isosceles: exactly two sides are equal.
- Scalene: all three sides are different.

*/

public class $11_TriangleClassification {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        if(a==b && b==c){
            System.out.println("Equilateral: all three sides are equal."); 
        }
        else if(a==b || b==c){
            System.out.println("Isosceles: exactly two sides are equal"); 
        }
        else{
            System.out.println("Scalene: all three sides are different.");  
        }
        
    }
}