/*
Given two arrays: arr1[0..m-1] and arr2[0..n-1].
Find whether arr2[] is a subset of arr1[] or not. 
Both the arrays are not in sorted order. 
It may be assumed that elements in both arrays are distinct.

Examples: 

Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4} 
Output: arr2[] is a subset of arr1[]
*/


/* Return true if arr2[] is a subset of arr1[] */
    static boolean isSubset(int arr1[], int arr2[], int m,
                            int n)
    {
        HashSet<Integer> hset = new HashSet<>();
 
        // hset stores all the values of arr1
        for (int i = 0; i < m; i++) {
            if (!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }
 
        // loop to check if all elements
        //  of arr2 also lies in arr1
        for (int i = 0; i < n; i++) {
            if (!hset.contains(arr2[i]))
                return false;
        }
        return true;
    }
