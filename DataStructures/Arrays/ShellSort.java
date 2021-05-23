package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShellSort {
    public static void main(String[] args) {
        System.out.println(threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0));
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		for(int i = 0; i < array.length - 3; i++) {
			int j = i + 1, k = array.length - 1;
			while(j < k){
				int sum = array[i] + array[j] + array[k];
				if(sum == targetSum){
					list.add(new Integer[]{array[i], array[j], array[k]});
					j++; 
					k--;
				} else if(sum < targetSum) {
					k--;
				} else{
					j++;
				}
			}
		}
        return list;
    }
}
