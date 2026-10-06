import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Robin Mejo AM");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int  num=scan.nextInt();
        scan.nextLine();
        System.out.println("Age is "+num);
        System.out.print("Enter you name: ");
        String name=scan.nextLine();
        System.out.println("Name is "+name+" and age is "+ num);
    }
}