package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlapping {
    public static void main(String[] args) {
        new MergeOverlapping().mergeOverlappingIntervals(new int[][] { { 1, 22 }, { -20, 30 } });
    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
        List<int[]> results = new ArrayList<int[]>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (current[1] < intervals[i][0]) {
                results.add(current);
                current = intervals[i];
            } else if (current[1] >= intervals[i][0] && current[1] < intervals[i][1]) {
                current[1] = intervals[i][1];
            }
        }
        if (results.isEmpty() || current[0] > results.get(results.size() - 1)[1]) {
            results.add(current);
        }
        int[][] arr = new int[results.size()][2];
        for (int j = 0; j < results.size(); j++) {
            arr[j] = results.get(j);
            System.out.println(results.get(j)[0] + " " + results.get(j)[1]);
        }
        return results.toArray(new int[results.size()][]);
    }
}
