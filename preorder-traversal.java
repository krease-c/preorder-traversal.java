import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        
        // Visit the root node first
        result.add(node.val);
        
        // Recursively traverse the left subtree
        preorderHelper(node.left, result);
        
        // Recursively traverse the right subtree
        preorderHelper(node.right, result);
    }

    // Example usage
    public static void main(String[] args) {
        // Creating a sample binary tree:
        //      1
        //       \
        //        2
        //       /
        //      3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution solution = new Solution();
        List<Integer> result = solution.preorderTraversal(root);

        // Print the preorder traversal result
        System.out.println("Preorder traversal: " + result);
    }
}

