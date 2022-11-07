public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList<>();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        System.out.println(l.toString());
        l.head = rotateLeft(l.head, 1);
        System.out.println(l.toString());

    }

public static Node rotateLeft(Node head, int k) {
        //to find tail and length of linked list
        int len = 1;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        Node curr = head;
        while (--k > 0) {
            curr = curr.next;
        }

        Node newHead = curr.next;
        tail.next = head;
        curr.next = null;

        return newHead;

    }
