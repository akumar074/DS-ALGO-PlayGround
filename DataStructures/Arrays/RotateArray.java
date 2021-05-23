package DataStructures.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] result = rotateByJuggling(new int[]{1,2,3,4,5,6}, 2);
        for (int i : result) {
            System.out.println(i);
        }

        result = rotateByReverse(new int[]{1,2,3,4,5,6}, 2);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] rotateByJuggling(int[] arr, int d) {
        int n = arr.length;
        for(int i = 0; i < d; i++) {
            int temp = arr[i];
            int j = i;
            while (true) {
                int k = j + d;
                if(k >= n)
                    k = k - n;
                if(k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] rotateByReverse(int[] arr, int d) {
        if (d == 0) {
            return arr;
        }
        d = d % arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        return arr;
    }

    public static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
