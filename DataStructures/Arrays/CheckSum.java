package DataStructures.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckSum {
    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2];
        // write your code here
        Arrays.parallelSort(arr);
        int start = 0, end = arr.length - 1;
        while (start != end) {
            if (arr[start] + arr[end] == n) {
                result[0] = arr[start];
                result[1] = arr[end];
                break;
            } else if (arr[start] + arr[end] < n)
                start++;
            else
                end--;
        }
        return result; // return the elements in the array whose sum is equal to the value passed as
                       // parameter
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 21, 3, 14, 5, 60, 7, 6 };
        int n = 27;
        int[] result = findSum(arr, n);
        System.out.println(result[0] + " " + result[1]);
    }
}