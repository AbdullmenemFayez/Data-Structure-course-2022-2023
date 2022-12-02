
    private static int sumUnique(Integer[] a) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);

        }
        int cnt = 0;

        for (Integer i : hm.keySet()) {
            if (hm.get(i) == 1 && i != null) {
                cnt += i;
            }
        }
        return cnt;

    }

