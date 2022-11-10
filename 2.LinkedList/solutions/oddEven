
import java.util.Scanner;

public class oddEven<E> {

    
    // inner class ,Node , you can have an independent Node Class , no difference 
    static class Node<E> {

        Node<E> next;
        E data;

        public Node(E data) {

            this.data = data;

        }
    }

    // odd even function 
    public static <E> void oddeven(Node<E> head) {

        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        Node<E> prev = head, cur = head.next, nxt = cur;

        int cnt = 2;
        while (cur.next != null) {

            prev.next = cur.next;

            prev = cur;
            cur = cur.next;
            cnt++;
        }
        
        // if number of nodes (size of linked list) is even 
        if (cnt % 2 == 0) {
            prev.next = nxt;
        } else {
            cur.next = nxt;
            prev.next = null;
        }
        
        // print the final linked list after made changes 
        print(head);

    }
    
    
    // this a driver code , accept the size (number of nodes) , then you enter your nodes , 
    // after that , it calls the odd even method .

    public static void main(String[] args) {

        Node<Integer> prev = null, head = null, cur = null;

        Scanner in = new Scanner(System.in);
        int sz = in.nextInt();

        for (int i = 0; i < sz; ++i) {

            if (i == 0) {

                head = new Node<>(in.nextInt());
                prev = head;
            } else {

                cur = new Node<>(in.nextInt());
                prev.next = cur;
                prev = prev.next;
            }

        }

        //print(head);
        oddeven(head);
    }
    
    
    // print method , to visualize the content of the linked list 

    static <E> void print(Node<E> cur) {
        // to print the linked list
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;

        }
    }
    
    // another solution for oddEven method 
    
   static <E>  oddEvenList(Node<E> head) {
        if(head == null)return null;
        
        Node<E>  odd = head, even = head.next, newHead = even;
        
        while (even != null && odd != null && even.next != null && odd.next != null) {
            odd.next = even.next;
            odd = even.next;
            
            even.next = odd.next;
            even = odd.next;
        }
        odd.next = newHead;
        return head;
            
        
    }

}
