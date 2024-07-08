
// LeetCode : https://leetcode.com/problems/balanced-binary-tree/


public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return treeHeight(root) != -1;
    }

    public int treeHeight(TreeNode root){

        if(root == null) return 0;

        int left = treeHeight(root.left);
        if(left == -1) return -1;

        int right = treeHeight(root.right);
        if(right == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;
        return (1 + Math.max(left,right));
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
