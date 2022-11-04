  public static boolean isSorted(ArrayList<? extends Comparable> arr) {

        boolean asc = true, desc = true;
        for (int i = 1; i < arr.size(); i++) {

            if (arr.get(i).compareTo(arr.get(i - 1)) < 0) {
                asc = false;
            }
            if (arr.get(i).compareTo(arr.get(i - 1)) > 0) {
                desc = false;
            }
        }
        return asc || desc;

    }

    // you can use this driver code to check your methods
    public static void main(String[] args) {

        Integer x[] = {5, 4, 3, 2, 4};
        // { 1,2,3,4,5} -- true
        // {5,4,3,2,1} -- true
      
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(x));

        System.out.println(isSorted(list));
    }

