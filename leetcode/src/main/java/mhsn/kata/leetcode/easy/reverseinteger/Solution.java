package mhsn.kata.leetcode.easy.reverseinteger;

class Solution implements ReverseInteger {

  public int reverse(int x) {

    StringBuilder xStr = new StringBuilder();
    try {

      String reversed = String.valueOf(xStr.append(Math.abs(x)).reverse());
      return x < 0 ? -1 * Integer.parseInt(reversed) : Integer.parseInt(reversed);
    } catch (NumberFormatException e) {
      return 0;
    }
  }
}