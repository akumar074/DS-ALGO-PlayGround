package DataStructures.Arrays;

import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int[] arr = new int[k];
		String line = br.readLine();
		String[] nums = line.split(" ");
		for(int i = 0; i < k;i++)
			arr[i] = Integer.parseInt(nums[i]);
		Arrays.sort(arr);
		int total = 0;
		for(int i = k-2, j = 1; j <= k/3 ; i-= 2, j++) {
			total += arr[i]; 
		}
	    System.out.println(total);
  }
}