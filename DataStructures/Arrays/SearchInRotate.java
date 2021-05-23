package DataStructures.Arrays;

import java.util.Scanner;

public class SearchInRotate {
    public static void main(String[] args) {
        // int[] arr = new int[] {3,4,5,6,1,2};
        // System.err.println(findWithPivot(arr, 6));
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
		    int N = Integer.parseInt(sc.next());
		    String str = sc.next();
		    String[] strs = str.split(" ");
		    int[] arr = new int[N];
		    for(int j = 0; j < N; j++) {
		        arr[j] = Integer.parseInt(strs[j]);
		    }
		    int key = Integer.parseInt(sc.next());
		    System.out.println(findWithPivot(arr, key));
        }
        sc.close();
    }

    public static int findWithPivot(int[] arr, int key) {
        int pivot = findPivot(arr, 0, arr.length - 1);
        if (key < arr[pivot]) {
            return binarySearch(arr, 0, pivot, key);
        } else {
            return binarySearch(arr, pivot, arr.length - 1, key);
        }
    }

    public static int findPivot(int[] arr, int l, int r) {
        if(r < l) return -1;
        if(l == r) {
            return l;
        }
        int mid = l + (r-l) / 2;
        if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
            return mid;
        } 
        if(arr[mid] <= arr[r]) {
            return findPivot(arr, l, mid - 1);            
        }
        return findPivot(arr, mid + 1, r);
    }

    public static int binarySearch(int[] arr, int l, int r, int key) {
        int mid = l + (r-l) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key < arr[mid]) {
            return binarySearch(arr, l, mid - 1, key);
        }
        return  binarySearch(arr, mid + 1, r, key);
    }
}
