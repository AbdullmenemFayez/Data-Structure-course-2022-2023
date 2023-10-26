private static ArrayList Removeduplicate(ArrayList<Integer> a) {
        ArrayList out = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            if (!out.contains(a.get(i))) {
                out.add(a.get(i));
            }
        }
        return out;
    }
