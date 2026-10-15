public class $1_Primitive_Reference {
    public static void main(String[] args) {
        int a = 5;
        int b = a; // b is an independent copy: 5
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1; // arr2 points to the SAME array
        arr2[0] = 99;
        System.out.println(arr1[0]); // prints 99 — same underlying array
    }
}
