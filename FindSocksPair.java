import java.util.HashMap;
import java.util.Map;

public class FindSocksPair {


  public static int compressedString(int n, int[] ar) {
    // Write your code here
    Map<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n ; i++) {
      if(map.get(ar[i]) != null) {
        map.put(ar[i], map.get(ar[i]) + 1);
      } else {
        map.put(ar[i],1);
      }
    }
    System.out.println(map.toString());
    int count = 0;
    for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
      count += entry.getValue() / 2;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(compressedString(9 ,new int[]{10,20,20,10,10,30,50,10,20}));
  }
}
