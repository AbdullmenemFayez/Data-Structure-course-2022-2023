


class Solution {
    public ListNode swapPairs(ListNode head) {
        
        return swap(head);
    }
    public static ListNode swap(ListNode head){
     if(head==null||head.next==null)return head;
        
        ListNode temp=head;
        ListNode next=head.next;
        head.next=next.next;
        next.next=temp;
        head.next=swap(head.next);
        return next;
        
    }
}