private static ArrayList<Integer> MaxAndMin(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();

        int mn = arr.get(0); // Initialize mn (minimum) with the first element of the list
        int mx = arr.get(0); // Initialize mx (maximum) with the first element of the list
        int i;

        for (i = 0; i < arr.size(); i++) {
            if (arr.get(i) < mn) // Check if the current element is smaller than the current minimum
                mn = arr.get(i); // If yes, update the minimum
            if (arr.get(i) > mx) // Check if the current element is larger than the current maximum
                mx = arr.get(i); // If yes, update the maximum
        }

        res.add(mn); // Add the minimum value to the result ArrayList
        res.add(mx); // Add the maximum value to the result ArrayList
        return res; // Return the result ArrayList with minimum and maximum values
        //T.c:O(n)
    }
