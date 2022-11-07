// iterative method to reverse a singly linked list ,
//O(n) solution 
    private  Node<Integer> reverse(Node<Integer> head) {

        Node<Integer> cur = head, next = null, pre = null;

        while (cur != null) {

            next = cur.next;

            cur.next = pre;

            pre = cur;
            cur = next;
        }

        return pre;
    }


// recursive method to reverse a singly linked list 
// O(n) solution 
 private  Node<Integer> reverserec(Node<Integer> head) {

        return helper(null, head);
    }

// helper method 
  private  Node<Integer> helper(Node<Integer> pre, Node<Integer> cur) {
        if (cur == null) {
            return cur;
        }
        if (cur.next == null) {
            cur.next = pre;
            return cur;
        }
        Node<Integer> rethead = helper(cur, cur.next);
        cur.next = pre;
        return rethead;

    }




