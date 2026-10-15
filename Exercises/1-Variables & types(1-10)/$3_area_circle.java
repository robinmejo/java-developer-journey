/*
Write a Java program to calculate the area of a circle.
Formula:
Area=pi*r*r
*/
public class $3_area_circle {
    public static void main(String[] args) {
        double radius=5;
        System.out.println("Area is "+calculateArea(radius));
    }

    public static double calculateArea(double radius){
        double area = Math.PI*radius*radius;
        return area;
    }
}
