package mhsn.kata.leetcode.junechallenge.week2.poweroftwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mhsn.kata.leetcode.junechallenge.week2.poweroftwo.Solution;

class PowerofTwoSolutionTest {

  @Test
  void isPowerOfTwo_whenPowerofTwo_returnTrue() {
    Solution powerOfTwoSolution = new Solution();
    Assertions.assertTrue(powerOfTwoSolution.isPowerOfTwo(1));
    Assertions.assertTrue(powerOfTwoSolution.isPowerOfTwo(2));
    Assertions.assertTrue(powerOfTwoSolution.isPowerOfTwo(4));
    Assertions.assertTrue(powerOfTwoSolution.isPowerOfTwo(8));
    Assertions.assertTrue(powerOfTwoSolution.isPowerOfTwo(16));
  }

  @Test
  void isPowerOfTwo_whenNotPowerofTwo_returnFalse() {
    Solution powerOfTwoSolution = new Solution();
    Assertions.assertFalse(powerOfTwoSolution.isPowerOfTwo(0));
    Assertions.assertFalse(powerOfTwoSolution.isPowerOfTwo(3));
    Assertions.assertFalse(powerOfTwoSolution.isPowerOfTwo(5));
    Assertions.assertFalse(powerOfTwoSolution.isPowerOfTwo(6));
  }
}