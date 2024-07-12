
// LeetCode : https://leetcode.com/problems/same-tree/


public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null || q == null){
            return p == q;
        }

        return (p.val == q.val) && isSameTree(p.left,q.left) &&
                isSameTree(p.right,q.right);
    }

    public class TreeNode {
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
}
