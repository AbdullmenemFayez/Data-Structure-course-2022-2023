 public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        a.add(new ArrayList<>(Arrays.asList(1, 1)));
        a.add(new ArrayList<>(Arrays.asList(2, 2)));
        a.add(new ArrayList<>(Arrays.asList(3, 7)));

        fun(a);

    }

    private static void fun(ArrayList<ArrayList<Integer>> a) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < a.size(); ++i) {
            for (int j = 0; j < a.get(i).get(0); ++j) {
                ans.add(a.get(i).get(1));
            }
        }
        System.out.println(ans);
    }
