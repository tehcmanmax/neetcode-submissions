/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) { // reaching the end of a branch or tree is without nodes
            return root;
        }
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) { // actual deleting the node
                return root.right;
            } else if (root.right == null) { // actual deleting the node
                return root.left;
            } else {
                TreeNode minValNode = findMinVal(root.right);
                root.val = minValNode.val;
                root.right = deleteNode(root.right, minValNode.val); // traversing 2nd time
                return root;                                        // possible to optimize
            }
        }
        return root;
    }

    private TreeNode findMinVal(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}