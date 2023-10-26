private static ArrayList<Integer> reverse2(ArrayList<Integer> arr) {
        int size = arr.size();

        for (int i = 0; i < size / 2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(size - 1 - i));
            arr.set(size - 1 - i, temp);
        }

        return arr;
        //T.C: O(n)
    }
```
other solution
```java
private static ArrayList<Integer> reverse(ArrayList<Integer> arr) {
        int size = arr.size();
        for (int i = size-1 ; i >= 0 ; i--){
            arr.add(arr.get(i));
        }

        for (int i = 0 ; i < size ; i++){

            arr.remove(0);
        }
        /*
        نفس النتيجة
        if (size > 0) {
            arr.subList(0, size).clear();
        }
         */
        return arr;
        //T.C: O(n)
    }
```
Recommended approach using Collections.reverse()
```java
import java.util.Collections;
import java.util.ArrayList;

private static ArrayList<Integer> reverse(ArrayList<Integer> arr) {
    Collections.reverse(arr);
    return arr;
    // Time Complexity: O(n)
}
