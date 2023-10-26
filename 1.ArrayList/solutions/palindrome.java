private static boolean palindrome(ArrayList<Integer> a) {
    int size = a.size();
    for (int i = 0; i < size / 2; i++) {
        if (a.get(i) != a.get(size - i - 1)) {
            return false; // Found a pair that doesn't match, not a palindrome
        }
    }
    return true; // If the loop completes, it's a palindrome
    //T.C = o(n)
}
