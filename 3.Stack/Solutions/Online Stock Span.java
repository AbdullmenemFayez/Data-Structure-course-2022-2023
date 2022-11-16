class StockSpanner {
    private static class Pair {
        int price, daysBeforeLessOrEqual;

        public Pair(int price, int daysBeforeLessOrEqual) {
            this.price = price;
            this.daysBeforeLessOrEqual = daysBeforeLessOrEqual;
        }
    }

    private final Stack<Pair> stk;

    public StockSpanner() {
        stk = new Stack<>();
    }

    public int next(int price) {
        int ans = 1;

        while (!stk.isEmpty() && stk.peek().price <= price) {
            ans += stk.pop().daysBeforeLessOrEqual;
        }

        stk.push(new Pair(price, ans));

        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */