    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(2);
        arr.add(4);
        arr.add(6);

        System.out.println(smallerNumbersThanCurrent(arr));
    }

    //T.C = o(n*n)
    private static ArrayList<Integer> smallerNumbersThanCurrent(ArrayList<Integer> arr) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); ++i) {
            int c = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i) && i != j) {
                    c++;
                }
            }
            ans.add(c);

        }
        return ans;
    }
