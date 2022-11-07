 public static ArrayList<ArrayList<Integer>> divide(ArrayList<Integer> arr, int k) {
        int sz = arr.size(), tempSz = sz / k;
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        for (int i = 1; i <= k; ++i) {
            ret.add(new ArrayList<>());
        }
        int j = -1;
        for (int i = 0; i < arr.size(); ++i) {

            if (i % (arr.size() / k) == 0) {

                j++;
            }

            ret.get(j).add(arr.get(i));
        }
        return ret;
    }

    // you can use this driver code to check your methods
    public static void main(String[] args) {

        Integer x[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int k = 5;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(x));

        System.out.println(divide(list, k));
    }
