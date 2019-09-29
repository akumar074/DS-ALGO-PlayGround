/*
* the statement temp = rev * 10 + pop can cause overflow.

Luckily, it is easy to check beforehand whether or this statement would cause an overflow.

To explain, lets assume that rev is positive.

If temp=rev * 10 + pop causes overflow, then it must be that rev ≥ INT_MAX/10
​
If rev > INT_MAX/10, then temp=rev⋅10+pop is guaranteed to overflow.
If rev==INT_MAX/10 , then temp=rev⋅10+pop will overflow if and only if pop>7
Similar logic can be applied when rev is negative.
* */

public class ReverseInteger {
  public int reverse(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
      if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
      rev = rev * 10 + pop;
    }
    return rev;
  }
}
