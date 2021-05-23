package DataStructures.Arrays;

public class BreakChain {
    public static void main(String[] args) {
        System.out.println(solutions(new int[]{5,4,1,6,2,3,7}));
    }

    public static int solutions(int[] A) {
        int current = A[1], next = A[2], minCost = Integer.MAX_VALUE;

        for(int i = 3; i < A.length - 1; i++) {
            minCost = Math.min(minCost, current + A[i]);
            current = next;
            next = A[i];
        }
        return minCost;
    }
}
