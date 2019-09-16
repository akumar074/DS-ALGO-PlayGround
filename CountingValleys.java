public class CountingValleys {
  public static void main(String[] args) {
    System.out.println(countingValleys(8, "UDDDUDUU"));
  }

  static int countingValleys(int n, String s) {
    int count = 0;
    int sea_diff = 0;
    int last = 0;
    char[] steps = s.toCharArray();
    for (int i = 0; i < n; i++){
      if(steps[i] == 'U') {
        sea_diff++;
        last = -1;
      } else {
        sea_diff--;
        last = 1;
      }
      if(sea_diff == 0 && last < 0) {
        count++;
        last = 0;
      }
    }
    return count;
  }
}
