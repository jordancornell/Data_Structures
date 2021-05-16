# Data Structure Implementations

### Summary

Java implementations of important data structures and functionalities, along with unit tests.

### Dynamic Resizable Array

**Dynamic_Array.java**
At initialization, this class creates a new array of size 1. The class contains two private pethods, increase() and decrease() which are called internally to either double or halve the size of the array as necessary. Each instance of the class maintains the current capacity of the array, as well as the number of objects currently in it.
 The Dynamic_Array class contains the following public methods:
 * *add(object)* - Adds a new element, appending to back of array. If array is full (size == capacity), private increase() method is called first to make larger.
 * *add_at_index(index,object)* - Adds new element at specified index, shifting remaining elements accordingly. Similarly, if array is full, increase() is called.
 * *remove(index)* - Removes element at specified index. After removal, if number of elements has fallen to half of capacity, private decrease() method called to halve capacity.
 * *get(index)* - Returns the element at a specified index
 * *set(index,object)* - Sets element at specified index to new value
 * *size()* - Returns number of elements in array
 * *get_capacity()* - Returns current capacity of array (mostly for test purposes, to ensure dynamic resizing is working correctly)
 * *print_all()* - Prints list of all elements in the array (for test purposes)

**Dynamic_Array_Unit_Tests.java**
A number of unit tests in Java's JUnit framework to isolate the performance of the methods in the Dynamic_Array class. In addition to ensuring the functionality of the add/remove/set operations, these tests ensure that the size of the array is growing and shrinking appropriately.

### Linked List

*Linked_List.java*

*Linked_List_Unit_Tests.java*
