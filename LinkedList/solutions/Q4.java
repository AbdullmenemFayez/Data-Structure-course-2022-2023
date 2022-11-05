public static Node method(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head, fast = head;

        while (slow.next != null && fast != null
                && fast.next != null && fast.next.next != null
                && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next.next;
        }
        return slow;
    }
