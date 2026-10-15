/*

Write a Java program to calculate both the area and perimeter of a rectangle.

The formulas are:
- Area = length × width
- Perimeter = 2 × (length + width)

*/

public class $4_Area_Perimeter {
    public static void main(String[] args) {
        double length = 10.0;
        double width = 5.0;
        double area=computeArea(length, width);
        double perimeter=computePerimeter(length, width);
        System.out.println("Area is "+ area+" Perimeter is "+perimeter);
    }

    public static double computeArea(double length,double width){
        return length*width;
    }

     public static double computePerimeter(double length,double width){
        return 2*(length+width);
    }


}
