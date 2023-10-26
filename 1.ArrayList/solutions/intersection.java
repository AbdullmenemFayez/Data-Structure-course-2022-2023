private static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer item : arr1) {
            if (arr2.contains(item) && !res.contains(item))
                res.add(item);
        }
        return res;
        //T.C: O(n^2)
    }
