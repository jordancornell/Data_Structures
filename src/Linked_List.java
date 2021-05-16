
public class Linked_List {
	
	// Node class definition
	class Node{
		
		Object element;
		Node next;
		
		// Constructor - create new node with specified element
		public Node(Object o) {
			this.element = o;
			this.next = null;
		}
	}
	
	// Pointer to head of list
	Node head;
	
	// Add element to front of list
	public void PushToFront(Object o) {
		// Create new node with specified data
		Node new_node = new Node(o);
		// If head is null, list empty
		if (head == null) {
			head = new_node;
		}
		else {
			// Set 'next' pointer of new node to former head of list, replace head with new node
			new_node.next = head;
			head = new_node;
		}
	}
	
	// Add element to back of list
	public void PushToBack(Object o) {
		// Create new node with specified data
		Node new_node = new Node(o);
		// If head is null, list empty
		if (head == null) {
			head = new_node;
		}
		// Else, traverse list until end is reached
		else {
			Node temp_node = head;
			while (temp_node.next != null) {	
				temp_node = temp_node.next;
			}
			// Set next pointer of last node in list to point to new node
			temp_node.next = new_node;
		}
	}
	
	// Pop from front of list
	public Object PopFromFront() {
		// List empty, return null
		if (head == null) {
			return null;
		}
		// Else, return element from first node, adjust head pointer to point to next node
		else {
			Object front_element = head.element;
			head = head.next;
			return front_element;
		}
	}
	
	// Pop from back of list
	public Object PopFromBack() {
		// List empty, return null
		if (head == null) {
			return null;
		}
		// One item in list, return element, set head to null pointer
		else if (head.next == null) {
			Object element = head.element;
			head = null;
			return element;
		}
		// Else, traverse list until last item is reached, keeping track of previous node
		else {
			Node temp_node = head;
			Node prev_node = null;
			while (temp_node.next != null) {	
				prev_node = temp_node;
				temp_node = temp_node.next;
			}
			// Replace pointer to last node with null
			prev_node.next = null;
			// Return element from last node
			return temp_node.element;
		}
	}
	
	// Return value front of list
	public Object ValueFromFront() {
		// List empty, return null
		if (head == null) {
			return null;
		}
		// Else return element from first node
		else {
			return head.element;
		}	
	}
	
	// Return value from back of list
	public Object ValueFromBack() {
		// List empty, return null
		if (head == null) {
			return null;
		}
		// One item in list, return element
		else if (head.next == null) {
			return head.element;
		}
		// Else, traverse list until end, return last element
		else {
			Node temp_node = head;
			while (temp_node.next != null) {	
				temp_node = temp_node.next;
			}
			return temp_node.element;
		}	
	}
	

	// Check if key is in list (return boolean)
	public boolean InList(Object o) {
		// List empty, return false
		if (head == null) {
			return false;
		}
		// Traverse list, comparing element of each node
		Node temp_node = head;
		do {
			if (temp_node.element == o) {
				// If equal, return true
				return true;
			}
			temp_node = temp_node.next;
		} while (temp_node != null);
		// Not in list, return false
		return false;
	}
	
	// Delete node with specified key
	public void Delete(Object o) {
		// List empty, return
		if (head == null) {
			return;
		}
		// Traverse list, comparing element of each node
		Node temp_node = head;
		Node prev_node = null;
		do {
			if (temp_node.element == o) {
				//Element found
				if (prev_node == null) {
					// No previous node, found at first node, set head pointer to next element, bypassing node to be deleted
					head = temp_node.next;
					return;
				}
				else {
					// Found later in list - set next pointer from previous node to next node, bypassing node to be deleted
					prev_node.next = temp_node.next;
					return;
				}		
			}
			prev_node = temp_node;
			temp_node = temp_node.next;
		} while (temp_node != null);
		// Key was not in list, return
		return;
	}
	
	// Return node with specified key
	public Node GetNode(Object o) {
		// List is empty, return null
		if (head == null) {
			return null;
		}
		// Traverse list, comparing each element
		Node temp_node = head;
		do {
			if (temp_node.element == o) {
				// Element found, return node
				return temp_node;
			}
			temp_node = temp_node.next;
		} while (temp_node != null);
		// Key not in list, return null
		return null;
	}
	
	// Insert New value After Specified Node
	public void AddAfter(Object o, Node n) {
		// Create new node with specified element
		Node new_node = new Node(o);
		// Set next pointer of new node equal to next pointer of node that it is following
		new_node.next = n.next;
		// Set next pointer of node that it is following to new node
		n.next = new_node;
	}
	
	// Insert New Value Before Specified Node
	public void AddBefore(Object o, Node n) {
		// Check if value is to be added to front of list, if so call existing PushToFront method
		if (head == n) {
			PushToFront(o);
			return;
		}
		// Traverse list, looking for node n
		Node temp_node = head;
		while (n != temp_node.next) {
			temp_node = temp_node.next;
		}
		// Create new node with specified element
		Node new_node = new Node(o);
		// Update pointers
		new_node.next = temp_node.next;
		temp_node.next = new_node;
		
	}
		
	// Print all elements in list
	// For test purposes
	public void print_all() {
		Node temp_node = head;
		// Traverse list, print each node's element
		while (temp_node != null) {
			System.out.print(temp_node.element);
			temp_node = temp_node.next;
		}
		System.out.println();		
	}
}
