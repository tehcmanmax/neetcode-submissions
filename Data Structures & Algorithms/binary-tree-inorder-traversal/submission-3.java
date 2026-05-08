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

//iterative approach using Deque
/*
Feature         	Stack                       	    Deque (e.g., ArrayDeque) ↔️
Type	            Legacy Class                	    Modern Interface
Thread Safety   	Synchronized (Slower)	            Not Synchronized (Faster)
Flexibility	        LIFO only                   	    LIFO and FIFO
Top Recommendation	Generally avoided in modern Java	Preferred for stacks and queues
*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        // 1. Change Deque type from Integer to TreeNode
        Deque<TreeNode> stack = new ArrayDeque<>();

        TreeNode currNode = root; //currNode is the 'walker'/'traveler'

        while (currNode != null || stack.size() != 0) { //doesn't have .empty()
            // 3. Go as far left as possible
            while (currNode != null) {
                stack.push(currNode);
                currNode = currNode.left;
            }

            currNode = stack.pop();
            result.add(currNode.val);
            currNode = currNode.right;
        }
        return result;
    }
}