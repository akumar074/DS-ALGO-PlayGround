package DataStructures.Arrays;

public class ProductArray {

    // public static int[] findProduct(int arr[]) {
    //     int[] result = new int[arr.length];

    //     // write your code here
    //     int product = 1;
    //     boolean zeroFlag = false;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] != 0)
    //             product *= arr[i];
    //         else
    //             zeroFlag = true;

    //     }

    //     for (int i = 0; i < arr.length; i++) {
    //         if (!zeroFlag)
    //             result[i] = product / arr[i];
    //         else if (arr[i] == 0)
    //             result[i] = product;
    //         else
    //             result[i] = 0;
    //     }
    //     return result;
    // }

    public static int[] findProduct(int arr[]) {
        int n = arr.length;
        int i, temp = 1;

        // Allocation of result array
        int result[] = new int[n];

        // Initializing the result array by 1
        for (int j = 0; j < n; j++)
            result[j] = 1;

        // Product of elements on left side excluding arr[i]
        for (i = 0; i < n; i++) {
            result[i] = temp;
            temp *= arr[i];
        }

        // Initializing temp to 1 for product on right side
        temp = 1;

        // Product of elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= arr[i];
        }
        return result;
    }
}