private static ArrayList<Integer> rotateRight(ArrayList<Integer> a, int n) {
    int size = a.size();
    
    // Handle the case when n is larger than the size of the ArrayList
    n = n % size;
    
    // Create a new ArrayList to store the rotated elements
    ArrayList<Integer> rotated = new ArrayList<>(size);
    
    for (int i = 0; i < size; i++) {
        // Calculate the new index after rotation
        int newIndex = (i + n) % size;
        // Add the element at the new index to the rotated ArrayList
        rotated.add(a.get(newIndex));
    }
    
    return rotated;
}

//If you want to rotate the array in-place (i.e., without creating a new ArrayList), you can achieve this by performing a series of swaps. Here's how you can do it:

public static void rotateRightInPlace(ArrayList<Integer> arr, int n) {
    int size = arr.size();
    // Handle the case when n is larger than the size of the ArrayList
    n = n % size;
    
    reverse(arr, 0, size - 1); // Reverse the entire array
    reverse(arr, 0, n - 1);    // Reverse the first n elements
    reverse(arr, n, size - 1); // Reverse the remaining elements
}

public static void reverse(ArrayList<Integer> arr, int start, int end) {
    while (start < end) {
        int temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
        start++;
        end--;
    }
}
