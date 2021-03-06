package mhsn.kata.leetcode.easy.twosum;

class Solution1 implements Solution{

  public int[] twoSum(int[] nums, int target) {

    for (int index = 0; index < nums.length; index++) {
      for (int innerIndex = index + 1; innerIndex < nums.length; innerIndex++) {
        if (nums[index] + nums[innerIndex] == target) {
          return new int[]{index, innerIndex};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}