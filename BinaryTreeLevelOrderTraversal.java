
// LeetCode : https://leetcode.com/problems/binary-tree-level-order-traversal/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return result;
        }

        queue.add(root);

        while(!queue.isEmpty()){

            int len = queue.size();
            List<Integer> innerList = new ArrayList();

            for(int i=0;i<len;i++){

                TreeNode curNode = queue.poll();
                innerList.add(curNode.val);

                if(curNode.left != null){
                    queue.add(curNode.left);
                }
                if(curNode.right != null){
                    queue.add(curNode.right);
                }
            }

            result.add(innerList);
        }
        return result;
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
