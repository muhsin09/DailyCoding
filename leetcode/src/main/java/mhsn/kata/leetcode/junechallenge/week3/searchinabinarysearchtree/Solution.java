package mhsn.kata.leetcode.junechallenge.week3.searchinabinarysearchtree;

// Definition for a binary tree node.
public class Solution {

  public TreeNode searchBST(TreeNode root, int val) {

    if (root == null) {
      return null;
    }

    if (val == root.val) {
      return root;
    }
    if (root.val > val) {
      return searchBST(root.left, val);
    } else {
      return searchBST(root.right, val);
    }
  }
}

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
