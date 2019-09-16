public class JumpingOnTheClouds {

  static int jumpingOnClouds(int[] c) {
    int steps = 0;
    int length = c.length - 2;
    int i = 0;
    while(i <= length) {
      if((i + 2) < (length + 2) && c[i + 2] == 0){
        i += 2;
      } else if(c[i + 1] == 0) {
        i += 1;
      }
      steps += 1;
    }
    return steps;
  }

  public static void main(String[] args) {
    System.out.println(jumpingOnClouds(new int[]{0,0,0,1,0,0}));
  }
}
