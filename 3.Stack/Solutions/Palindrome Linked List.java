public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;
    Stack<Integer> st = new Stack<>();
    st.push(slow.val);
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        st.push(slow.val);
    }
    st.pop();

    if (fast != null)
        slow = slow.next;

    while (!st.isEmpty()) {
        if (st.pop() != slow.val)
            return false;
            
        slow = slow.next;
    }
    return true;
}
