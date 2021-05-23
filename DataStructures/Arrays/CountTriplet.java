package DataStructures.Arrays;

import java.util.Arrays;

public class CountTriplet {
    public static void main(String[] args) {
        System.out.println(countTriplet(new int[]{14,3,6,8,11,16}, 6));
    }

    public static int countTriplet(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = n-1; i > 1; i--) {
            int j = 0, k = i - 1;
            while (j < k) {
                int sum = arr[j] + arr[k];
                if(sum == arr[i]) {
                    count++;
                    j++;
                }
                if(sum < arr[i])
                    j++;
                else if(sum > arr[i])
                    k--;
            }
        }
        return count;
    }
}
