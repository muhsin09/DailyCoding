package mhsn.kata.leetcode.junechallenge.week2.searchinsert;

class Solution {

  public int searchInsert(int[] nums, int target) {

    int index = 0;
    int targetIndex = 0;
    for (; index < nums.length; index++) {
      if(nums[index] == target || nums[index] > target){
        return index;
      }
    }
    return target+1;
  }
}