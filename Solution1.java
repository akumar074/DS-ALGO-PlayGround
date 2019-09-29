import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result1 {

  /*
   * Complete the 'lastStoneWeight' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY a as parameter.
   */

  public static int lastStoneWeight(List<Integer> a) {
    // Write your code here
    Collections.sort(a);
    int length = a.size();
    if(length == 1)
      return a.get(0);
    if(length == 2)
      return Math.abs(a.get(0) - a.get(1));
    int first = a.get(length - 1);
    int second = a.get(length - 2);
    length -= 2;
    while (length > 0) {
      if (first == second) {
        length --;
        first = a.get(length - 1);
        second = a.get(length - 2);
        } else if (first > second) {
          length--;
        a.add(length,first - second);
          second = a.get(length - 1);
        } else {
          length--;
          a.add(length,second - first);
          first = a.get(length - 1);
        }
    }
    if (first != 0)
      return first;
    if(second != 0)
      return second;
    return 0;
  }

}

public class Solution1 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int aCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a = new ArrayList<>();

    for (int i = 0; i < aCount; i++) {
      int aItem = Integer.parseInt(bufferedReader.readLine().trim());
      a.add(aItem);
    }

    int result = Result1.lastStoneWeight(a);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
