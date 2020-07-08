/**
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, 
 * and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.  
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. 
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 */

class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        int l = A[0].length;
        for (int[] row : A) {
            for (int i = 0; i < (l + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[l - 1 - i] ^ 1;
                row[l - 1 - i] = temp;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        FlipAndInvertImage flipAndInvertImage = new FlipAndInvertImage();
        int[][] arr = flipAndInvertImage
                .flipAndInvertImage(new int[][] { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } });
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}