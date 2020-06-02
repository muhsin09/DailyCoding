package java.mhsn.kata.leetcode.junechallenge.week1.invertbinarytree;

class Solution {
  public TreeNode invertTree(TreeNode root) {

    if (root == null) {
      return root;
    }

    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);

    root.right = left;
    root.left = right;
    return root;
  }
}