package java.mhsn.kata.leetcode.junechallenge.week1.linkedlistdeletenode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int x) { val = x; } }
 */
class Solution {

  public void deleteNode(ListNode node) {

    ListNode nextNode;
    ListNode previousNode = null;


    while (node.next != null) {
      nextNode = node.next;
      node.val= nextNode.val;
      previousNode = node;
      node=nextNode;
    }
    previousNode.next=null;

  }

  private class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}