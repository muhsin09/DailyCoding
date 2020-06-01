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
  void isPalindrome_whenInputLengthIs1_returnTrue() {
    Assertions.assertTrue(palindromNumber.isPalindrome(0));
    Assertions.assertTrue(palindromNumber.isPalindrome(1));
    Assertions.assertTrue(palindromNumber.isPalindrome(2));
    Assertions.assertTrue(palindromNumber.isPalindrome(3));
    Assertions.assertTrue(palindromNumber.isPalindrome(4));
    Assertions.assertTrue(palindromNumber.isPalindrome(5));
    Assertions.assertTrue(palindromNumber.isPalindrome(6));
    Assertions.assertTrue(palindromNumber.isPalindrome(7));
    Assertions.assertTrue(palindromNumber.isPalindrome(8));
    Assertions.assertTrue(palindromNumber.isPalindrome(9));
  }

  @Test
  void isPalindrome_whenInput123456_returnFalse() {
    Assertions.assertFalse(palindromNumber.isPalindrome(123456));
  }
}