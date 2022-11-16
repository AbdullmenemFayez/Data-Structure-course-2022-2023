public static int[] nextLargerNodes(ListNode head) {
    // A stack that contains the indexes of the elements that is waiting to be replaced.
    Stack<Integer> stk = new Stack<>();
    ArrayList<Integer> list = new ArrayList<>();
    for (ListNode curr = head; curr != null; curr = curr.next) list.add(curr.val);
    int[] res = new int[list.size()];
    for (int i = 0; i < list.size(); ++i) {
        if (stk.isEmpty()) { // if the stack is empty (no elements is waiting to be replaced), just push and continue.
            stk.push(i);
            continue;
        }

        // if the element at index stk.peek() is not replaced yet and if arr[stk.peek()] < arr[i],
        // then I have reached the nearest value that is > arr[stk.peek()], so assign it the value arr[i].
        while (!stk.isEmpty() && list.get(stk.peek()) < list.get(i)) {
            res[stk.pop()] = list.get(i);
        }

        // push the index i to be processed later.
        stk.push(i);
    }

    // if the stack has more indexes left, then they have no next greater element, replace it with 0.
    while (!stk.isEmpty()) {
        res[stk.pop()] = 0;
    }

    return res;
}