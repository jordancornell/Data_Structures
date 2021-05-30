
public class Hash_Map {

	// Node class definition
	class Node{
			
		int hash_value;
		Object key;
		Object value;
		Node next;
			
		// Constructor
		public Node(int h, Object k, Object v) {
			hash_value = h;
			key = k;
			value = v;
			next = null;
			}
		}
	
	
	int buckets;	// Size of Array
	Node[] map_array;	// HashMap Array
	
	// Constructor
	public Hash_Map() {
		buckets = 10; // Default
		map_array = new Node[buckets];	
	}
		
	// Constructor 2 - specify number of buckets
	public Hash_Map(int num_buckets) {
		buckets = num_buckets; // Default
		map_array = new Node[buckets];
	}	
	
	// Add <key,value> to HashMap
	// Also valid for changing value of value, given key
	public void put(Object k, Object v) {
		
		// Compute hash of key
		int hash = k.hashCode();
		
		// Determine which bin/bucket of array
		int bin = Math.abs(k.hashCode())%buckets;
	
		// If bucket is empty, add node
		if (map_array[bin]==null) {
			map_array[bin]=new Node(hash,k,v);
		}
		
		// Collision - Object(s) already present in bucket
		
		// Traverse Linked List - If Key already Present, Replace value
		else {
			Node cur_node = map_array[bin];
			Node prev_node = null;
			while (cur_node != null) {
				if (cur_node.hash_value == hash) {
					// Key already exists, update value
					cur_node.value = v;
					return;
				}
				prev_node = cur_node;
				cur_node = cur_node.next;
			}
			// At end of list, key does not exist, append node to end with new <key,value> pair
			prev_node.next = new Node(hash,k,v);		
		}
	}
	
	// Return Value, given Key
	// null if key not found in map
	public Object getValue(Object k) {
		
		// Compute hash of key
		int hash = k.hashCode();
		
		// Determine which bin/bucket of array
		int bin = Math.abs(k.hashCode())%buckets;
		
		// Traverse Linked List
		Node cur_node = map_array[bin];
		while (cur_node != null) {
			if (cur_node.hash_value == hash) {
				// Key found, return value
				return cur_node.value;
			}
			cur_node = cur_node.next;
		}
		// At end of list, key does not exist, return null
		return null;
	}
	
	// Delete <key, value> pair from hashmap, given key
	public void delete(Object k) {
		
		// Compute hash of key
		int hash = k.hashCode();
		
		// Determine which bin/bucket of array
		int bin = Math.abs(k.hashCode())%buckets;
		
		// Traverse Linked List
		Node cur_node = map_array[bin];
		Node prev_node = null;
		while (cur_node != null) {
			if (cur_node.hash_value == hash) {
				// Key found
				if (prev_node == null) {
					// If first node in list, update head pointer to bypass
					map_array[bin]=cur_node.next;
				}
				else {
					// Else, connect prev and next nodes to bypass
					prev_node.next = cur_node.next;
				}
				return;
			}
			prev_node = cur_node;
			cur_node = cur_node.next;
		}
		// At end of list, key does not exist
	}	
	
	// Test method to return contents of hash map - list of keys
	public Object[] return_contents() {
		// Get number of pairs in hash map
		int count = 0;
		
		// Iterate through each bucket
		for (int i = 0; i< buckets; i++) {
			// Traverse linked list
			Node cur_node = map_array[i];
			while (cur_node != null) {
				count++;
				cur_node = cur_node.next;
				}
		}
				
		// Initialize Arrays
		Object[] keys = new Object[count];
		Object[] values = new Object[count];
		count=0;
		// Iterate through each bucket
		for (int i = 0; i< buckets; i++) {
			// Traverse linked list
			Node cur_node = map_array[i];
			while (cur_node != null) {
				keys[count]=cur_node.key;
				values[count]=cur_node.value;
				count++;
				cur_node = cur_node.next;
				}	
		}
		return keys;	
	}
}
