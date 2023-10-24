# ArrayList

The ArrayList class is a resizable array, which can be found in the java.util package.

## Table of Contents

- [Introduction](#introduction)
- [Examples](#examples)
  - [Problem 1](#problem-1)
  - [Problem 2](#problem-2)
  - [Problem 3](#problem-3)
  - [Problem 4](#problem-4)
  - [Problem 5](#problem-5)

## Introduction

Java `ArrayList` class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

The ArrayList in Java can have the duplicate elements also.

```java
import java.util.ArrayList; // import the ArrayList class

ArrayList<Integer> arr = new ArrayList<Integer>(); // Create an ArrayList object
```

We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:

```java
ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine
```
### Methods of ArrayList

| method | description |
| ---  | ---  |
| void add(int index, E element)   | It is used to insert the specified element at the specified position in a list.  |
| boolean add(E e)   | It is used to append the specified element at the end of a list.   |
| E remove(int index)   | It is used to remove the element present at the specified position in the list.  |
| E get(int index)   | It is used to fetch the element from the particular position of the list.  |
| E set(int index, E element)   | It is used to replace the specified element in the list, present at the specified position.  |


you can read this [ArrayList](https://www.javatpoint.com/java-arraylist)

## Examples


### Problem 1

 Write Java method named MaxAndMin that calculates and returns the maximum and minimum values from an input ArrayList of integers

#### Example


- **Input:** Original ArrayList: [12, 45, 6, 88, 54, 23, 78, 97, 1, 56]
- **Output:** [1, 97]
              

#### Solution


```java
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
```
---
### Problem 2

 Write Java method finds the intersection of elements between the two input ArrayLists without repetition,
 i.e., it returns an ArrayList containing the common elements of arr1 and arr2. 

#### Example


- **Input:** arr1 = [1, 2, 3, 3, 5]
             ,arr2 = [1, 2, 3, 3, 4]
- **Output:** [1, 2, 3]
              

#### Solution
```java
private static ArrayList<Integer> intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer item : arr1) {
            if (arr2.contains(item) && !res.contains(item))
                res.add(item);
        }
        return res;
        //T.C: O(n^2)
    }
```
---
### Problem 3

 Write Java method that reverses an ArrayList of integers

#### Example


- **Input:** arr = [1, 2, 3, 4, 5]
- **Output:** [5, 4, 3, 2, 1]
              

#### Solution
The code provided swaps the elements in the ArrayList to reverse it, with a time complexity of O(n), but it's important to note that there is a more efficient way to reverse an ArrayList using Collections.reverse().

```java
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
```
---
### Problem 4

 Write Java method called palindrome that takes an ArrayList of integers as input and checks if it is a palindrome. A palindrome is a sequence that reads the same forwards and backward.

#### Example


- **Input:** arr = [1, 2, 3, 4, 5]
- **Output:** false
- **Input:** arr = [1, 2, 3, 2, 1]
- **Output:** true
              

#### Solution
This code iterates through the ArrayList from both ends towards the center and returns false as soon as it finds a pair of elements that don't match. If the loop completes without finding any non-matching pairs, it returns true.

```java
private static boolean palindrome(ArrayList<Integer> a) {
    int size = a.size();
    for (int i = 0; i < size / 2; i++) {
        if (a.get(i) != a.get(size - i - 1)) {
            return false; // Found a pair that doesn't match, not a palindrome
        }
    }
    return true; // If the loop completes, it's a palindrome
    //T.C = o(n)
}
```

---
### Problem 5

 Write Java method called rotateRight, which takes an ArrayList of integers and an integer n as input and rotates the elements of the ArrayList to the right n times.

#### Example


- **Input:** arr = [1, 2, 3, 4, 5], n = 2
- **Output:** arr = [3, 4, 5, 1, 2]
              

#### Solution
we use the modulo operator to handle cases where n is larger than the size of the ArrayList, and we create a new ArrayList to store the rotated elements. This approach avoids the need for multiple iterations and is more efficient, especially when rotating large ArrayLists.

```java
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

```

If you want to rotate the array in-place (i.e., without creating a new ArrayList), you can achieve this by performing a series of swaps. Here's how you can do it:

```java
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
```
## flag 
<h3>Q1</h3>
<a href = "https://leetcode.com/problems/pascals-triangle/"> Pascal's Triangle</a>

<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/solve1.java">solution</a>

<h2>_____________________________________________________</h2>
<h3>Q2</h3>


<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/solve2.java">Rotate ArrayList ==> time complexity O(n * n ) and O(n)</a>

<h2>_____________________________________________________</h2>
<h3>Q3</h3>
<a href = "https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/solve3.java">Merge two sorted ArrayList</a>


<h2>_____________________________________________________</h2>
<h3>Q4</h3>
<a href = "https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q4.java">Split an arrayList into three ArrayLists,one of negative odd numbers , another of positive even numbers , and one of auxiliary numbers </a>


<h2>_____________________________________________________</h2>

<h3>Q5</h3>

<a href = "https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q5.java">Check whether the arrayList is sorted or not </a>
<h2>_____________________________________________________</h2>


<h3>Q6</h3>
<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q6.java">Divide the list into k-equal-length lists</a>
<h2>_____________________________________________________</h2>


<h3>Q7</h3>
<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q7.java">You are given an array list of arraylists (the inner array lists are of size  2   ) each inner list In the form of  [N, value] ,   (you will use N as the number of occurrences of `value`) return an array list of integers which contains each `value` N  times</a>

<h2>_____________________________________________________</h2>


<h3>Q8</h3>
<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q8.java">
Shuffle the array : Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].</a>

<h2>_____________________________________________________</h2>


<h3>Q9</h3>
<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q9.java">
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i]. Return the answer in an array.</a>

<h2>_____________________________________________________</h2>


<h3>Q10</h3>
<a href="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q10.java">
Implement a function that receives 2 ArrayLists of Integers and returns the intersection of them.
</a>
