package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpinalTraversal {
    public static void main(String[] args) {
        spiralTraverse(new int[][] { new int[] { 1 } }).stream().forEach(i -> System.out.print(i + " "));
    }

    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        int t = 0, r = array[0].length - 1, b = array.length - 1, l = 0;
        for (int i = l; i <= r; i++) {
            list.add(array[t][i]);
        }

        for (int i = t + 1; i <= b; i++) {
            list.add(array[i][r]);
        }

        for (int i = r - 1; i <= l; i--) {
            if (t == b)
                break;
            list.add(array[b][i]);
        }

        for (int i = b - 1; i < t; i--) {
            if (l == r)
                break;
            list.add(array[i][l]);
        }
        t++;
        r--;
        b--;
        l++;

        return list;
    }
}

