import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }
};

class Main {

  // Problem Statement #
  // Given a binary tree where each node can only have a digit (0-9) value, each
  // root-to-leaf path will represent a number. Find the total sum of all the
  // numbers represented by all paths.

  private static int sumOfAllPathSum(TreeNode root) {
    return sumOfPathSum(root, 0);
  }

  private static int sumOfPathSum(TreeNode currentNode, int pathSum) {
    if (currentNode == null)
      return 0;
    pathSum = pathSum * 10 + currentNode.val;
    if (currentNode.left == null && currentNode.right == null)
      return pathSum;
    return sumOfPathSum(currentNode.left, pathSum) + sumOfPathSum(currentNode.right, pathSum);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(5);
    System.out.println(Main.sumOfAllPathSum(root));

  }
}