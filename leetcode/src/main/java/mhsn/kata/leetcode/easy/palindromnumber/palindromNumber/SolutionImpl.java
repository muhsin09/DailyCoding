package mhsn.kata.leetcode.easy.palindromnumber.palindromNumber;

import java.util.ArrayList;

public class SolutionImpl implements Solution {

  public boolean isPalindrome(int x) {

    if ((x < 0) || (x % 10 == 0)) {
      return false;
    }

    ArrayList<Integer> listofNumber = new ArrayList<>();

    while (x != 0) {
      listofNumber.add(x % 10);
      x = x / 10;
    }

    Integer[] numbers = listofNumber.toArray(new Integer[listofNumber.size()]);

    for (int numberPosition = numbers.length; numberPosition >= numbers.length / 2; numberPosition--) {
      if (numbers[numberPosition - 1] != numbers[numbers.length - numberPosition]) {
        return false;
      }
    }
    return true;
  }
}
