package DataStructures.Arrays;

public class CheckRotateArray {

    public static void rotateArray(int[] arr) {

        // Write - Your - Code
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0 ; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;
    }
}
