public class HourGlass2dArray {
  static int hourglassSum(int[][] arr) {
    int row = arr.length;
    int col = arr[0].length;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < row - 2; i++){
      for (int j = 0; j < col - 2; j++){
        int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
        if(sum > max)
          max = sum;
      }
    }
    return max;
  }
}
