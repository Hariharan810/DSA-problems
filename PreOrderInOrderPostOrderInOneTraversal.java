import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderInOrderPostOrderInOneTraversal {
    public void PreInPostTRaversal(TreeNode root) {

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        if (root == null) return;

        while (!stack.isEmpty()) {

            Pair it = stack.pop();

            if (it.num == 1) {
                preOrder.add(it.node.val);
                it.num++;
                stack.push(it);

                if (it.node.left != null) {
                    stack.push(new Pair(it.node.left, 1));
                }
            } else if (it.num == 2) {
                inOrder.add(it.node.val);
                it.num++;
                stack.push(it);

                if (it.node.right != null) {
                    stack.push(new Pair(it.node.right, 1));
                }
            } else {
                postOrder.add(it.node.val);
            }
        }

    }

    class Pair {
        TreeNode node;
        int num;

        Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
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
