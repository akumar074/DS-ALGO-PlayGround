package com.demo.learning.easy;

class MinDeletionSize {
    public int minDeletionSize(String[] A) {
        int count = 0;
        int N = A.length;
        int n = A[0].length();
        for (int i = 0; i < n; i++) {
            if(!isNonDecreasingSorted(A, i, N)){
                count++;
            }
        }
        return count;
    }

    public boolean isNonDecreasingSorted(String[] A, int col, int N) {
        char pre = A[0].charAt(col);
        for (int i = 1; i < N; i++) {
            char c = A[i].charAt(col);
            if (pre > c) {
                return false;
            } else {
                pre = c;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        System.out.println(new MinDeletionSize().minDeletionSize(new String[] { "qowfc", "spyge", "sqbif", "vvrkk" }));
    }
}