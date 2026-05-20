/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//recursion
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){ //when empty listnode, or base case 
            return head;
        }

        ListNode reversedHead = reverseList(head.next); // reversedHead stays static throughout 
                                                            //method exec

        head.next.next = head; //points back to this node (next node pointer points to me)
        
        //avoids cycles:
        head.next = null; //will be overwritten by popping next value from the call
        
        return reversedHead; //passes the chain of the nodes to the prev call
    }
}