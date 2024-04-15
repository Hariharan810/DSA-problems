
//LeetCode : https://leetcode.com/problems/sum-root-to-leaf-numbers/


public class SumRootToLeafNumbers {
    public int sumTree(TreeNode root,int sum){
        if(root==null) return 0;
        sum=sum*10+root.val;
        if(root.left==null && root.right==null) return sum;
        return sumTree(root.left,sum)+sumTree(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        return sumTree(root,0);
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
