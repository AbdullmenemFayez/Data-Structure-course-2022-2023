public class Solution {
    public double sumTo(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n == 0) return 0;
        return 1 / (n * 1.0) + sumTo(n - 1);
    }
}