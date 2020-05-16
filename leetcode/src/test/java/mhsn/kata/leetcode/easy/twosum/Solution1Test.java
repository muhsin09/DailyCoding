package mhsn.kata.leetcode.easy.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution1Test {

  Solution1 solution;

  @BeforeEach
  void setup(){
    solution = new Solution1();
  }

  @Test
  void twoSum() {
    int[] nums = new int[]{2, 7, 11, 15};
    Assertions.assertArrayEquals(new int[]{0, 1}, solution.twoSum(nums, 9));
  }

  @Test
  public void twoSumTest_when() {
    int[] nums = new int[]{3, 2, 4};
    Assertions.assertArrayEquals(new int[]{1, 2}, solution.twoSum(nums, 6));
  }
}
