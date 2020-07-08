public class KaryString {
    public static void main(String[] args) {
        generate(new int[3], 3, 3);
    }

    static void printArray(int[] A) {
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void generate(int[] A, int n, int k) {
        if(n < 1) 
            printArray(A);
        else {
            for (int i = 0; i < k; i++) {
                A[n-1] = i;
                generate(A, n-1, k);
            }
        }
    }
}