package com.demo.learning.easy;

class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int left = 0, right = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i]%2 == 0) {
                arr[left] = A[i];
                left++;
            } else {
                arr[right] = A[i];
                right--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        for (int a : sortArrayByParity.sortArrayByParity(new int[]{3,1,2,4})) {
            System.out.println(a);
        }
    }
}