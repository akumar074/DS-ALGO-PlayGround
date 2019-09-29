package com.demo.learning.easy;

public class NaryStringGenerate {
    public static void main(String[] args) {
        generate(new int[3], 3);
    }

    static void printArray(int[] A) {
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void generate(int[] A, int n) {
        if(n < 1)
            printArray(A);
        else {
            A[n-1] = 0;
            generate(A, n-1);
            A[n-1] = 1;
            generate(A, n-1);
        }
    }
}