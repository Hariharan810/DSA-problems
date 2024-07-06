import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inOrder = new ArrayList<>();

        if(root == null)return inOrder;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;

        while(true){

            if(curNode != null){
                stack.push(curNode);
                curNode = curNode.left;
            }
            else{
                if(stack.isEmpty())break;

                curNode = stack.pop();
                inOrder.add(curNode.val);
                curNode = curNode.right;
            }
        }

        return inOrder;
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
