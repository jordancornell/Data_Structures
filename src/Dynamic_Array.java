
public class Dynamic_Array {

	private Object arr[];
	private int capacity;
	private int size;
	
	// Constructor - initializes array of size 1
	public Dynamic_Array() {
		arr = new Object[1];
		capacity = 1;
		size = 0;	
	}
	
	// Increase Size
	// Private method for dynamic resizing - called to double size of array when it is full
	private void increase() {
		// Create new array, double the size of current
		Object temp[] = new Object[capacity*2];
		
		// Copy all elements over
		for (int i = 0; i < size; i++) {
			temp[i] = arr[i];
		}
		// Update pointer and capacity variable
		arr = temp;
		capacity = capacity*2;
		
	}
	
	// Decrease Size
	// Private Method for dynamic resizing -  called to halve size of array when it is half-empty
	private void decrease() {
		// Create new array, double the size of current
		Object temp[] = new Object[capacity/2];
				
		// Copy all elements over
		for (int i = 0; i < size; i++) {
			temp[i] = arr[i];
		}
		// Update pointer and capacity variable
		arr = temp;
		capacity = capacity/2;
	}
	
	
	// Add new element, push to back of array
	public void add(Object o) {
		// Check if array full, if so increase size
		if (size == capacity) {
			this.increase();
		}
		// Add new element to end, update size variable
		arr[size] = o;
		size++;
	}
	
	// Add element somewhere other than end, shift remaining elements accordingly
	public void add_at_index(int index, Object o) {
		// Check if array full, if so increase size
			if (size == capacity) {
				this.increase();
		}
		// Shift all elements after index 1 to the right
		for (int i = size-1; i >= index; i--){
			arr[i+1]=arr[i];
		}	
		// Insert new element at specified index
		arr[index] = o;
		// Update size
		size++;
			
	}
	
	
	// Remove element from specified index
	public void remove(int index) {
		// Replace element at index with next element in array, repeat for all remaining elements in array
		for (int i = index; i<size-1; i++) {
			arr[i]=arr[i+1];
		}
		// Update size variable
		size--;
		// Check if size has fallen to half of array length, if so, decrease array length
		if (size == capacity/2) {
			this.decrease();
		}	
	}
	
	// Get element at specified index
	public Object get(int index) {
		
		return arr[index];
	}
	
	// Set element at specified index
	public void set(int index, Object o) {
		arr[index] = o;
	}
	
	// Return # elements in array
	public int size() {
		return size;
	}
	
	// Return current capacity of array
	// For test purposes - ensure that array is dynamically resizing appropriately
	public int get_capacity() {
		return capacity;
	}
	
	// Print list of all elements in array
	// For test purposes
	public void print_all() {
		for (int i = 0; i<size; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	

	
}
