package DataStructures.Arrays;

import java.util.Arrays;

public class PlusOne {
    
    public static void main(String[] args) {
        
    }

    public static int[] plusone(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            ++digits[i];
            if(digits[i] < 10)
                break;
            else {
                digits[i] = 0;
                if(i == 0) {
                    int[] arr = new int[digits.length + 1];
                    arr[0] = 1;
                    Arrays.fill(arr, 1, arr.length - 1, 0);
                    return arr;
                }
            }
        }
        return digits;
    }
}
