//Write a program to copy all elements of one array into another array.
public class CopyArray {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array:");
        for (int num : copy) {
            System.out.println(num);
        }
    }
}
