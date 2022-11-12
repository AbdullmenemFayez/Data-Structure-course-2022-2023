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
    public ListNode partition(ListNode head, int x) {
        if(head == null)return null;

        ListNode curr = head, front = new ListNode(0), back = new ListNode(0);
        ListNode left = front, right = back;

        while(curr != null){
            if(curr.val < x){
                left.next = curr;
                left = curr;
            }else{
                right.next = curr;
                right = curr;
            }
            curr = curr.next;
        }
        left.next = back.next;
        right.next = null;
        return front.next;
    }
}
