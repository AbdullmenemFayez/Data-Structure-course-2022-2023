 public static ArrayList<ArrayList<Integer>> splitThree(ArrayList<Integer> arr) {

        //this solution is with using another arrayLists
        ArrayList<Integer> negOdd = new ArrayList<>(); // to store negative odd values
        ArrayList<Integer> posEve = new ArrayList<>(); // to store positive even values
        ArrayList<Integer> other = new ArrayList<>();  // to store values that are neither negative odd nor positive even

        for (int i = 0; i < arr.size(); ++i) {

            int cur = arr.get(i);

            if (cur < 0 && Math.abs(cur) % 2 == 1) {
                negOdd.add(cur);

            } else if (cur >= 0 && cur % 2 == 0) {
                posEve.add(cur);
            } else {
                other.add(cur);
            }

        }

        return new ArrayList<>(Arrays.asList(negOdd, posEve, other));
    }

    public static void splitThree2(ArrayList<Integer> arr) {
        // this solution is without using any datastructures

        int j = 0;

        for (int i = 0; i < arr.size(); ++i) {

            if (arr.get(i) < 0 && Math.abs(arr.get(i)) % 2 == 1) {
                arr.add(j, arr.remove(i));
                j++;
            }

        }

        for (int i = 0; i < arr.size(); ++i) {

            if (arr.get(i) >= 0 && arr.get(i) % 2 == 0) {
                arr.add(j, arr.remove(i));
                j++;
            }
        }
    }

    // you can use this driver code to check your methods
    public static void main(String[] args) {

        Integer x[] = {-1, 0, -3, 4, -5, -6, 5, 7, 11};
        int k = 5;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(x));
        System.out.println(splitThree(list));

        list = new ArrayList<>(Arrays.asList(x));
        splitThree2(list);
        System.out.println(list);
}

