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

//iterative approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        // 1. Change Stack type from Integer to TreeNode
        Stack<TreeNode> stack = new Stack<>();

        // 2. Simply point currNode to root
        TreeNode currNode = root; //currNode is the 'walker'/'traveler'

        while (currNode != null || !stack.empty()) {
            // 3. Go as far left as possible
            while (currNode != null) {
                stack.push(currNode); // Use push() for clarity with Stacks
                currNode = currNode.left;
            }

            // 4. Process the "Root" (the node at the top of the stack)
            currNode = stack.pop();
            result.add(currNode.val); // Add the value to the result list

            // 5. Move to the right child
            currNode = currNode.right;
        }
        return result;
    }
}