public static void insertAtBottom(Stack<Integer> stack, String N) {

    if (stack.empty()) {
     
        stack.push(N);
        return;
    }

    int tmp = stack.pop();

    insertAtBottom(stack, N);

    stack.push(tmp);
    
}