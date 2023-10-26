private static ArrayList<Integer> ThreeMax(ArrayList<Integer> a) {
    ArrayList<Integer> result = new ArrayList<>();

    if (a.size() < 3) {
        // Handle the case when the input list has less than three elements
        for (int num : a) {
            result.add(num);
        }
    } else {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        result.add(max1);
        result.add(max2);
        result.add(max3);
    }

    return result;
}

private static ArrayList ThreeMax2(ArrayList<Integer> a) {
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
