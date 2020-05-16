package mhsn.kata.leetcode.easy.reverseinteger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  ReverseInteger reverseInteger;

  @BeforeEach
  void setup(){
    reverseInteger = new Solution();
  }

  @Test
  public void reverseInteger_wheninput123_return231(){
    Assertions.assertEquals(321,reverseInteger.reverse(123));
  }
  @Test
  public void reverseInteger_wheninputNegatif123_returnNegatif231(){
    Assertions.assertEquals(-321,reverseInteger.reverse(-123));
  }

  @Test
  public void reverseInteger_wheninput120_returnNegatif21(){
    Assertions.assertEquals(21,reverseInteger.reverse(120));
  }



}