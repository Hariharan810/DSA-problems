
// LeetCode : https://leetcode.com/problems/binary-tree-preorder-traversal/


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> preOrder = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if(root == null){
            return preOrder;
        }

        stack.push(root);

        while(!stack.isEmpty()){

            TreeNode curNode = stack.pop();
            preOrder.add(curNode.val);

            if(curNode.right != null){
                stack.push(curNode.right);
            }
            if(curNode.left != null){
                stack.push(curNode.left);
            }
        }
        return preOrder;
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
