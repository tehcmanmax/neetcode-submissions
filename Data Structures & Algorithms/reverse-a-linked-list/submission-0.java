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

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head; //not to get confused
        ListNode reversedHead = null;

        while (curr != null) {
            ListNode nextNodeTemp = curr.next;
            curr.next = reversedHead;
            reversedHead = curr;

            curr = nextNodeTemp;
        }
        return reversedHead;
    }
}

/*
Step-by-Step Walkthrough
Initial state:

reversedHead = null
curr = 1 → 2 → 3 → null
Iteration 1:

nextNodeTemp = 2 → 3 → null    (save what's next)
curr.next = null               (reverse the pointer: 1 → null)
reversedHead = 1 → null        (move curr to reversedHead)
curr = 2 → 3 → null            (advance to next)

State: 1 → null,  2 → 3 → null (separate!)
Iteration 2:

nextNodeTemp = 3 → null
curr.next = 1 → null           (reverse: 2 → 1)
reversedHead = 2 → 1 → null    (move curr to reversedHead)
curr = 3 → null

State: 2 → 1 → null,  3 → null
Iteration 3:

nextNodeTemp = null
curr.next = 2 → 1              (reverse: 3 → 2)
reversedHead = 3 → 2 → 1 → null
curr = null

State: 3 → 2 → 1 → null ✓
*/