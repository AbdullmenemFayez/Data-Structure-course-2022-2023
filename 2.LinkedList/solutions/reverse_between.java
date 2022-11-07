 public Node<E> reverseBetween(Node<E> head, int left, int right) {

        if (head == null) {
            return null;
        }
        Node prev = null, cur = head;

        for (int i = 1; i < left; ++i) {
            prev = cur;
            cur = cur.next;
        }

        Node start = prev, end = cur, nxt = null; // start , end are pointers , use it to save where you will start reversing

        for (int i = 0; i <= right - left; ++i) {
            nxt = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxt;
        }

        if (start != null) {
            start.next = prev;
        } else {
            // this will happen , when left = 1;
            head = prev;
        }

        end.next = cur;
        return head;
    }
