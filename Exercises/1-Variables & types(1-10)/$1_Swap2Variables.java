/*
Swap two variables without using a third variable.
 */

public class $1_Swap2Variables {
    public static void main(String[] args) {
        int a=15;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);

    }
}

