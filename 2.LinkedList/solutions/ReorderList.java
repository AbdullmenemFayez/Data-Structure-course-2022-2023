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
    public void reorderList(ListNode head) {
        ListNode res = null, pre = null;
        while(head != null){
            pre = res;
            res = middleNode(head);
            head = deleteMiddle(head);
            res.next = pre;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, pre = head, fast = head;
        
        while(slow != null && fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(pre.next != null)
            pre.next = pre.next.next;
        else head = null;
        return head;
    }
}
