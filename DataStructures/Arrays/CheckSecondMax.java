package DataStructures.Arrays;

public class CheckSecondMax {

    public static int findSecondMaximum(int[] arr) {
        // Write - Your - Code
        int max = Integer.MIN_VALUE;;
        int secondmax = Integer.MIN_VALUE;

        // Keep track of Maximum value, whenever the value at an array index is greater
        // than current Maximum value then make that max value 2nd max value and
        // make that index value maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }//end of for-loop

        return secondmax;
    }

    public static void main(String[] args) {
        System.out.println("Second Max " + findSecondMaximum(new int[]{6, 5, 9, 9, 2, 3}));
    }
}
