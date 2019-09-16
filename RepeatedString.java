public class RepeatedString {
  static long repeatedString(String s, long n) {
    long count = 0;
    char[] chars = s.toCharArray();
    int length = chars.length;
    long left_length = n % length;
    long left_count = 0;
    for (int i = 0; i < length; i++) {
      if(chars[i] == 'a')
        count++;
      if(i == left_length - 1)
        left_count = count;
    }
    return (count * (n / length)) + left_count;
  }

  public static void main(String[] args) {
    System.out.println(repeatedString("aba", 10L));
  }
}
