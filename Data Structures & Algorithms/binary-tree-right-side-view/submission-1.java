/*You are given the root of a binary tree. Return only the values of the nodes
that are visible from the right side of the tree, ordered from top to bottom.

Input: root = [1,2,3,null,4,null,5]
Output: [1,3,5]
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList();
        Deque<TreeNode> q = new ArrayDeque();
        if (root == null) {
            return new ArrayList<Integer>();
        } else
            q.addLast(root);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode rightNode = null;
            List<Integer> level = new ArrayList();
            for (int y = 0; y < size; y++) {
                TreeNode node = q.removeFirst();
                rightNode = node;

                if (node.left != null) {
                    q.addLast(node.left);
                }
                if (node.right != null) {
                    q.addLast(node.right);
                }
            }
            result.add(rightNode.val);
        }
        return result;
    }
}