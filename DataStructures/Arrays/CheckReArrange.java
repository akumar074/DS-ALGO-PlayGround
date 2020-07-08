package DataStructures.Arrays;

public class CheckReArrange {

    public static void reArrange(int[] arr) {

        //Write - Your - Code
        int i = 0, j = arr.length - 1;
        while (i != j) {
            if (arr[i] > 0 && arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else
                i++;
        }
        for (int a: arr) {
            System.out.println(a + " ");
        }
    }

    public static void main(String[] args) {
        reArrange(new int[] {-1,2,-3,4,-5});
    }
}
