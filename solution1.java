import java.util.Arrays;

public class Solution2 {
    public static int[] printNos(int x) {
        // Create an array to hold the numbers
        int[] result = new int[x];
        // Fill the array using recursion
        fillArray(x, result, 0);
        return result;
    }

    private static void fillArray(int x, int[] result, int index) {
        if (x > 0) {
            fillArray(x - 1, result, index); // Recur for previous elements
            result[index] = x; // Place the current number in the array
            index++; // Move to the next index
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int[] numbers = printNos(x);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 3, 4, 5]
    }
}
