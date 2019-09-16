package Algorithm.Dynamic_Programming;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

  /*
   * Complete the 'getMaximumOutfits' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY outfits
   *  2. INTEGER money
   */

  public static int getMaximumOutfits(List<Integer> outfits, int money) {
    // Write your code here
    Collections.sort(outfits);
    int n = outfits.size();
    int[][] K = new int[n][money];
    for(int i = 0; i < n; i++) {
      for(int j = 0; j <= money; j++) {
        if(j == 0) {
          K[i][j] = 0;
        } else if(outfits.get(i) <= j) {
          K[i][j] = Math.max(1 + K[i][j - outfits.get(i)], K[i][j-1]);
        } else {
          K[i][j] = K[i][j-1];
        }
      }
    }
    return K[n][money];
  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/home/abhidev/Documents/file.txt"));

    int outfitsCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> outfits = new ArrayList<>();

    for (int i = 0; i < outfitsCount; i++) {
      int outfitsItem = Integer.parseInt(bufferedReader.readLine().trim());
      outfits.add(outfitsItem);
    }

    int money = Integer.parseInt(bufferedReader.readLine().trim());

    int result = Result.getMaximumOutfits(outfits, money);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
