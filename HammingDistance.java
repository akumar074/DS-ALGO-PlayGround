/**
 * The Hamming distance between two integers is the number of positions at which the 
 * corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 */
package com.demo.learning.easy;

class HammingDistance {
    public int hammingDistance(int x, int y) {
        int num = x^y;
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if((num&1) == 1) {
                count++;
            }
            num = num >>> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1, 4));
    }
}