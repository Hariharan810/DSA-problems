
// LeetCode : https://leetcode.com/problems/boundary-of-binary-tree/


import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalOfBinaryTree {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        if(isLeaf(root) == false)result.add(root.val);
        addLeftBoundary(root, result);
        addLeaves(root, result);
        addRightBoundary(root, result);
        return result;
    }

    public static void addLeftBoundary(TreeNode node, ArrayList<Integer> result){
        TreeNode cur = node.left;

        while (cur != null){
            if(isLeaf(cur) == false)result.add(cur.val);
            if(cur.left != null)cur = cur.left;
            else cur = cur.right;
        }
    }

    public static void addLeaves(TreeNode node, ArrayList<Integer> result){
        if(isLeaf(node)){
            result.add(node.val);
            return;
        }
        if(node.left != null)addLeaves(node.left, result);
        if(node.right != null)addLeaves(node.right, result);
    }

    public static void addRightBoundary(TreeNode node, ArrayList<Integer> result){
        TreeNode cur = node.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (cur != null){
            if(isLeaf(cur) == false)temp.add(cur.val);
            if(cur.right != null)cur = cur.right;
            else cur = cur.left;
        }
        for(int i = temp.size() - 1; i >= 0; i--){
            result.add(temp.get(i));
        }
    }

    public static boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
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
