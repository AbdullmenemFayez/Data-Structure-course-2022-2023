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
  - [Problem 6](#problem-6)
  - [Problem 7](#problem-7)
  - [Problem 8](#problem-8)
  - [Problem 9](#problem-9)
  - [Problem 10](#problem-10)
  - [Problem 11](#problem-11)
  - [Problem 12](#problem-12)
- [leetcode problems](#leetcode-problems)
- [PTUK](#ptuk)

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

[Link to Solution](./solutions/MaxAndMin.java)

---
### Problem 2

 Write Java method finds the intersection of elements between the two input ArrayLists without repetition,
 i.e., it returns an ArrayList containing the common elements of arr1 and arr2. 

#### Example


- **Input:** arr1 = [1, 2, 3, 3, 5]
             ,arr2 = [1, 2, 3, 3, 4]
- **Output:** [1, 2, 3]

#### Solution

[Link to Solution](./solutions/intersection.java)

---
### Problem 3

 Write Java method that reverses an ArrayList of integers

#### Example


- **Input:** arr = [1, 2, 3, 4, 5]
- **Output:** [5, 4, 3, 2, 1]
              

#### Solution
The code provided swaps the elements in the ArrayList to reverse it, with a time complexity of O(n), but it's important to note that there is a more efficient way to reverse an ArrayList using Collections.reverse().

[Link to Solution](./solutions/reverse.java)  

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

[Link to Solution](./solutions/palindrome.java)  

---
### Problem 5

 Write Java method called rotateRight, which takes an ArrayList of integers and an integer n as input and rotates the elements of the ArrayList to the right n times.

#### Example


- **Input:** arr = [1, 2, 3, 4, 5], n = 2
- **Output:** arr = [3, 4, 5, 1, 2]
              

#### Solution
we use the modulo operator to handle cases where n is larger than the size of the ArrayList, and we create a new ArrayList to store the rotated elements. This approach avoids the need for multiple iterations and is more efficient, especially when rotating large ArrayLists.

[Link to Solution](./solutions/rotateRight.java)  

---
### Problem 6

 Write Java method called ThreeMax that takes an ArrayList of integers as input and returns an ArrayList containing the three largest values from the input list

#### Example


- **Input:** arr = [1, 2, 3, 4, 5]
- **Output:** arr = [3, 4, 5]
              

#### Solution

[Link to Solution](./solutions/ThreeMax.java) 

---
### Problem 7

 Write Java method called  removeDuplicate that takes an ArrayList of integers as input and returns a new ArrayList with duplicates removed. 

#### Example


- **Input:** arr = [1, 2, 3, 3, 2]
- **Output:** arr = [1, 2, 3]
              

#### Solution

[Link to Solution](./solutions/removeDuplicate.java) 

---

### Problem 8

you are given an array list of pairs. each pair is an integer array with length= 2
in the form of [N, value].return an array list of integers which contains each value N
number of times. 
method header: public static ArrayList<Integer> decoded(ArrayList<int[]> incoded) 

#### Example


- **Input:** arr = { [1,2], [3,4], [2,3] }
- **Output:** arr = { 2, 4, 4, 4, 3, 3 }
              

#### Solution

[Link to Solution](./solutions/decoded.java) 

---

### Problem 9

Given an array list of integers "list" and two numbers "index", "k". remove K consecutive
elements from list starting at index.
method header: public static void removeConsecutive(ArrayList<Integer>list, int index, int k)

#### Example


- **Input:** list = [1,2,3,4,5,6,7,8,9], index = 2, k = 5
- **Output:** [1,2,8,9]
              

#### Solution

[Link to Solution](./solutions/removeConsecutive.java) 

---
### Problem 10

create a java method called shuffle 
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

#### Example


- **Input:** nums = [2,5,1,3,4,7], n = 3
- **Output:** [2,3,5,4,1,7] 
- **Explanation** : Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
              

#### Solution

[Link to Solution](./solutions/Q8.java) 

---

### Problem 11

create a java method called smallerNumbersThanCurrent 
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
#### Example


- **Input:** nums = [8,1,2,2,3]
- **Output:** [4,0,1,1,3]
- **Explanation:**
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
              

#### Solution

[Link to Solution](./solutions/Q9.java) 

---

### Problem 12

create a java method that
check whether the arrayList is sorted or not
#### Example


- **Input:** nums = [8,1,2,2,3]
- **Output:** flase
           

#### Solution

[Link to Solution](./solutions/Q5.java) 

---

<h3>Q1</h3>
<a href = "https://leetcode.com/problems/pascals-triangle/"> Pascal's Triangle</a>

<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/solve1.java">solution</a>



<h2>_____________________________________________________</h2>
<h3>Q3</h3>
<a href = "https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/solve3.java">Merge two sorted ArrayList</a>


<h2>_____________________________________________________</h2>
<h3>Q4</h3>
<a href = "https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q4.java">Split an arrayList into three ArrayLists,one of negative odd numbers , another of positive even numbers , and one of auxiliary numbers </a>


<h2>_____________________________________________________</h2>


<h3>Q6</h3>
<a href ="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q6.java">Divide the list into k-equal-length lists</a>
<h2>_____________________________________________________</h2>


<h3>Q10</h3>
<a href="https://github.com/AbdullmenemFayez/Data-Structer-course-2022-2023/blob/main/1.ArrayList/solutions/Q10.java">
Implement a function that receives 2 ArrayLists of Integers and returns the intersection of them.
</a>
