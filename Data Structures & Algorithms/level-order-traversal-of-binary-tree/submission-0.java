/*
Given a binary tree root, return the level order traversal 
of it as a nested list, where each sublist contains the 
values of nodes at a particular level in the tree, from 
left to right.

Input: root = [1,2,3,4,5,6,7]

Output: [[1],[2,3],[4,5,6,7]]

*/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        Deque<TreeNode> q = new ArrayDeque();

        if (root == null) {
            return new ArrayList<List<Integer>>();
        } else
            q.addLast(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int y = 0; y < size; y++) {
                TreeNode node = q.removeFirst();
                currentLevel.add(node.val);
                if (node.left != null) {
                    q.addLast(node.left);
                }
                if (node.right != null) {
                    q.addLast(node.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
}