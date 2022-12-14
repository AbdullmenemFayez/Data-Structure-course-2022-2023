public class Solution {
    public int multiplyEvens(int n) {
        if (n <= 0) throw new IllegalArgumentException();
        if (n == 1) return 2;
        return multiplyEvens(n - 1) * (n * 2);
    }
}
