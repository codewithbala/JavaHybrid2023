//Write a program to count positive and negative numbers in an array.
public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 7, 0, -8, 10};
        int positiveCount = 0, negativeCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}
