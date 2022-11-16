public String removeDuplicates(String s) {
    Stack<Character> st = new Stack<>();
    for (char ch : s.toCharArray()) {

        if (st.isEmpty() || st.peek() != ch) {
            st.push(ch);
        } else {
            st.pop();
        }
    }
    StringBuilder ans = new StringBuilder();
    while (!st.isEmpty()) {
        ans.insert(0, st.pop());
    }
    return ans.toString();
}