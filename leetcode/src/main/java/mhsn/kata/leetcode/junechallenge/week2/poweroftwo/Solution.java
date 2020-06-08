package mhsn.kata.leetcode.junechallenge.week2.poweroftwo;

class Solution {

  public boolean isPowerOfTwo(int n) {
    if (n < 1) {
      return false;
    }
    return (n & (n - 1)) == 0;
  }
}