/* Given an array of integers A sorted in non-decreasing order,
  return an array of the squares of each number,
  also in sorted non-decreasing order. */

package com.demo.learning.easy;

class SortedSquares {
    public int[] sortedSquares(int[] A) {
        int length = A.length;
        int[] result = new int[length];
        int left = 0, right = length - 1, index = right;
        while (left <= right) {
            int temp = Math.abs(A[left]) > Math.abs(A[right]) ? A[left++] : A[right--];
            result[index--] = temp * temp;
        }
        return result;
    }

    public static void main(String[] args) {
        SortedSquares sortedSquares = new SortedSquares();
        for (int a : sortedSquares.sortedSquares(new int[] { -7, -3, 2, 3, 11 })) {
            System.out.println(a);
        }
    }
}