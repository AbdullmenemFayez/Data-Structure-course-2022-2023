public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 3, 2, 0));

    sort(q);

    System.out.println(q);
}

// Sort a queue of Integers (non-decreasingly) without using any other D.S. (any T.C.)
// bound: starting from index bound, the queue is sorted.
private static int minIndex(Queue<Integer> q, int bound) {
    int minIndex = -1, minValue = Integer.MAX_VALUE, n = q.size();

    for (int i = 0; i < n; i++) {
        int val = q.remove();

        if (val <= minValue && i < bound) {
            minIndex = i;
            minValue = val;
        }

        q.add(val);
    }

    return minIndex;
}

private static void makeRear(Queue<Integer> q, int idx) {
    int value = 0; // the new rear's value
    int n = q.size();

    for (int i = 0; i < n; i++) {
        int val = q.remove();

        if (i == idx) {
            value = val;
        } else {
            q.add(val);
        }
    }

    q.add(value);
}

private static void sort(Queue<Integer> q) {
    for (int i = 0; i < q.size(); i++) {
        int minIndex = minIndex(q, q.size() - i);
        makeRear(q, minIndex); // make element at minIndex the rear of the queue
    }
}