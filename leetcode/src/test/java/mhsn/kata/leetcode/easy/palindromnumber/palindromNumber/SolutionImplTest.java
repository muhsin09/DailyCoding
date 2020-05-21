package mhsn.kata.leetcode.easy.palindromnumber.palindromNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionImplTest {

  Solution palindromNumber;

  @BeforeEach
  void setUp() {
    palindromNumber = new SolutionImpl();
  }

  @Test
  void isPalindrome_whenInput121_returnTrue() {
    Assertions.assertTrue(palindromNumber.isPalindrome(121));
  }

  @Test
  void isPalindrome_whenInputNegatif121_returnFalse() {
    Assertions.assertFalse(palindromNumber.isPalindrome(-121));
  }

  @Test
  void isPalindrome_whenInput10_returnFalse() {
    Assertions.assertFalse(palindromNumber.isPalindrome(10));
  }

  @Test
  void isPalindrome_whenInput123_returnFalse() {
    Assertions.assertFalse(palindromNumber.isPalindrome(123));
  }

  @Test
  void isPalindrome_whenInput1234321_returnTrue() {
    Assertions.assertTrue(palindromNumber.isPalindrome(1234321));
  }

  @Test
  void isPalindrome_whenInput123456_returnFalse() {
    Assertions.assertFalse(palindromNumber.isPalindrome(123456));
  }
}