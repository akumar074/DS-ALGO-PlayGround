package DataStructures.Arrays;

public class ArrayOfProducts {

    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int n = array.length;
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            output[i] = array[i + 1] * output[i + 1];
        }
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * array[i - 1];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 4, 2};
        int[] output = arrayOfProducts(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
