
// LeetCode : https://leetcode.com/problems/binary-tree-maximum-path-sum/


public class BinaryTreeMaximumPathSum {
    public int maxPathSum(TreeNode root) {

        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;
        maxPath(root,maxSum);
        return maxSum[0];
    }

    public static int maxPath(TreeNode root,int[] maxSum){

        if(root == null)return 0;

        int left = Math.max(0,maxPath(root.left,maxSum));
        int right = Math.max(0,maxPath(root.right,maxSum));

        maxSum[0] = Math.max(maxSum[0],left+right+root.val);

        return Math.max(left,right)+root.val;
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
