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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode fast = head, back =  head;
        if(head.next == null){
            return null;
        }
        
        for(int i = 1 ; i <= n ; i++){
            fast = fast.next;
        }
        
        if(fast == null){
        head = head.next;
        return head;
        }
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return back;
        
    }
}
