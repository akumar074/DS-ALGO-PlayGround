package DataStructures.Arrays;

public class ArrayInversionCount {
    
    public static void main(String[] args) {
        int[] original = new int[] {4, 1, 3, 2};
        int[] temp = new int[original.length];
        System.out.println(mergeSort(original, temp, 0, original.length - 1));
    }

    public static int mergeSort(int[] originalArray, int[] temp, int start, int end) {
        int inversion_count = 0;
        if (start < end) {
            int mid = (start + end)/2;
            inversion_count += mergeSort(originalArray, temp, start, mid);
            inversion_count += mergeSort(originalArray, temp, mid+1, end);
            inversion_count += merge(originalArray, temp, start, mid + 1, end);
        }
        return inversion_count;
    }

    public static int merge(int[] originalArray, int[] temp, int start, int mid, int end) {
        int i = start;
        int j = mid;
        int k = start;
        int inversion_count = 0;
        while (i <= mid-1 && j <= end) {
            if (originalArray[i] <= originalArray[j])
                temp[k++] = originalArray[i++];
            else {
                inversion_count += (mid - i);
                temp[k++] = originalArray[j++];
            }
        }
        while (i <= mid-1) {
            temp[k++] = originalArray[i++];
        }
        while (j <= end) {
            temp[k++] = originalArray[j++];
        }
        for(int a = start; a <= end; a++)
            originalArray[a] = temp[a];
        return inversion_count;
    }
}
