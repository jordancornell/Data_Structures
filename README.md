# Data Structure Implementations

### Summary

Java implementations of some important data structures and their critical functionalities, along with unit tests.

### Hash Map

**Hash_Map.java**

At initialization, this class creates new array with specified number of buckets/bins. Keys are hashed with Java Object Class's built in hash function (a next step in the development of this implentation could be a unique and original hashing function) The appropriate bucket in the array is identified based on the hash result. New pairs are added to the structure as nodes, and chained to existing node(s) in a linked list manner in case of a collision.

The Hash_Map class contains the following public methods:
 * *put(key, value)* - Adds a new <key, value> pair to the map. Hashes the key and identifies appropriate bucket in array. If array index is null, adds new node, if nodes already exist, chains new node to end of linked list. In case where key/hash value already exist, put() replaces the existing value with new one.
 * *getValue(key)* - Returns value associated with given key. If key does not exist in map, returns null. Achieves this by hashing key and traversing linked list at appropriate array index.
 * *delete(key)* - Delete <key, value> pair from hash map. Achieves this by hashing key, traversing linked list at appropriate array index, and updating pointers to bypass deleted node.
 * *return_contents()* - For testing purposes, returns list of keys in hash map. Used to verify length and contents. 

**Hash_Map_Unit_Tests.java**

A number of unit tests in Java's JUnit framework to isolate the performance of the methods in the Hash_Map class.

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

**Linked_List.java**

This implementation is a singly linked list: a collection of nodes, each of which contains an element (some object) and a pointer to the next node. Initialization of a Linked_List object creates a single node with an element specified by the caller, and a null pointer. The addition of objects into the list requires the creation of a new node object and the updating of pointers, whereas the removal of an object simply requires a change to the previous pointer to make it inaccessable.

The Linked_List class contains the following public methods:

* *PushToFront(object)* - Adds new element to front of list. Creates new node, sets it to be 'head' of list, and sets its 'next' pointer to former head node. 
* *PushToBack(object)* - Adds new element to back of list. Creates new node, sets 'next' pointer of last node in list to point to new node.
* *PopFromFront()* - Returns front element and remove from list. Adjusts head pointer to point to second node in list.
* *PopFromBack()* - Returns back element and remove from list. Traverses list to find node and return element, replaces pointer to last node with null pointer.
* *ValueFromFront()* - Returns front element without removal.
* *ValueFromBack()* - Returns back element without removal
* *InList(object)* - Returns boolean, true if specified object/element is in list. Traverses list, comparing element at each node.
* *Delete(object)* - Delete node with containing specified object/element. Traverses list, comparing element at each node, updates pointer of previous node to skip deleted node.
* *GetNode(object)* - Return node object containing specified object/element. This will be used as input to the following AddAfter() and AddBefore() methods. Traverses list, comparing elements, and returns node if there is a match.
* *AddAfter(object,node)* - Adds a new element after a specified node.
* *AddBefore(object,node)* - Adds a new element before a specified node
* *print_all()* - Print all elements in list(for test purposes)

**Linked_List_Unit_Tests.java**

A number of unit tests in Java's JUnit framework to isolate the performance of the methods in the Linked_List class. Tests the addition and removal of elements at the beginning, end and middle of the list.
