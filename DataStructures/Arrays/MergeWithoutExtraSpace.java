package DataStructures.Arrays;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {0,6,2,8,9};
        merge(arr1, arr2, arr1.length, arr2.length);
        printArray(arr1);
        printArray(arr2);
    }

    public static void merge(int arr1[], int arr2[], int n, int m) {
        // for (int i = m - 1; i >= 0; i--) {
        //     int j, last = arr1[n-1];
        //     for (j = n-2; j >= 0 && arr2[i] < arr1[j]; j--) {
        //         arr1[j+1] = arr1[j];
        //     }

        //     if (j != n-2 || last >= arr2[i]) {
        //         arr1[j+1] = arr2[i];
        //         arr2[i] = last;
        //     }
        // }
        int mx = 0;
 
    // Find maximum element of both array
    for(int i = 0; i < n; i++)
    {
        mx = Math.max(mx, arr1[i]);
    }
     
    for(int i = 0; i < m; i++) 
    {
        mx = Math.max(mx, arr2[i]);
    }
     
    // Increment one two avoid collision of
    // 0 and maximum element of array in 
    // modulo operation
    mx++;
    int i = 0, j = 0, k = 0;
     
    while (i < n && j < m && k < (n + m))
    {
         
        // Recover back original element
        // to compare
        int e1 = arr1[i] % mx;
        int e2 = arr2[j] % mx;
         
        if (e1 <= e2) 
        {
             
            // Update element by adding 
            // multiplication with new number
            if (k < n)
                arr1[k] += (e1 * mx);
            else
                arr2[k - n] += (e1 * mx);
                 
            i++;
            k++;
        }
        else
        {
             
            // Update element by adding 
            // multiplication with new number
            if (k < n)
                arr1[k] += (e2 * mx);
            else
                arr2[k - n] += (e2 * mx);
                 
            j++;
            k++;
        }
    }
 
    // Process those elements which are
    // left in array a
    while (i < n) 
    {
        int el = arr1[i] % mx;
        if (k < n)
            arr1[k] += (el * mx);
        else
            arr2[k - n] += (el * mx);
             
        i++;
        k++;
    }
 
    // Process those elements which are
    // left in array a
    while (j < m) 
    {
        int el = arr2[j] % mx;
         
        if (k < n)
            arr2[k] += (el * mx);
        else
            arr2[k - n] += (el * mx);
             
        j++;
        k++;
    }
 
    // Finally update elements by dividing
    // with maximum element
    for(int in = 0; in < n; in++)
        arr1[in] = arr1[in] / mx;
 
    // Finally update elements by dividing
    // with maximum element
    for(int in = 0; in < m; in++)
        arr2[in] = arr2[in] / mx;
 
    return;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
