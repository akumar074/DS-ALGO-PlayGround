public class LeftRotateArray {

  private static int[] rotLeftOld(int[] a, int d) {
    d = d % a.length;
    int n = a.length, offset = d;
    int[] result = new int[n];
    for(int i = 0; i < n; i++) {
      if(d > 0) {
        result[n - d] = a[i];
        d--;
      } else {
        result[i - offset] = a[i];
      }
    }
    return result;
  }

  private static int[] rotLeft(int[] a, int d) {
    int n = a.length, mod = d % n;
    int[] result = new int[n];
    for (int i = 0; i < n; ++i) {
      result[i] = a[(i + mod) % n];
    }
    return result;
  }

  public static void main(String[] args) {
    int[] result = rotLeft(new int[]{1,2,3,4,5}, 4);
    for (int i : result) {
      System.out.print(i + " ");
    }
  }
}
