private static ArrayList ThreeMax(ArrayList<Integer> a) {
        ArrayList out = new ArrayList();
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = 0; j < a.size() - i - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                }
            }
        }
        out.add(a.get(a.size() - 1));
        out.add(a.get(a.size() - 2));
        out.add(a.get(a.size() - 3));
        return out;
    }
