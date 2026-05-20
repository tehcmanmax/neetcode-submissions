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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        /*With int, the variable is the value. Changing the variable changes the data.
        With ListNode, the variable is just an arrow. Changing result = result.next just
            snaps the arrow away from one box and points it at a different box downstream.
         */
        ListNode savedHead = new ListNode(0); // to store a starting point
        ListNode result = savedHead; // store results; point to the same memory of dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                result.next = list1;
                list1 = list1.next;

            } else if (list1.val > list2.val) {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        if (list1 == null) {
            result.next = list2;
        } else if (list2 == null) {
            result.next = list1;
        }

        return savedHead.next;
    }
}