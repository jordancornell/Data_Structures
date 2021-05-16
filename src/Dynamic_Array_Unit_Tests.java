import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Dynamic_Array_Unit_Tests {
	
	
		// Tests Add method and get method
		// Ensure that we can successfully add elements to end of array and retrieve them from their expected indices
		@Test
	   public void test_add() {	 
			Dynamic_Array Arr = new Dynamic_Array();
			Arr.add(1);
			Arr.add(2);
			Arr.add(3);
			Arr.add(4);
			Arr.add(5);
			assertTrue(((int)Arr.get(0)==1)&&((int)Arr.get(1)==2)&&((int)Arr.get(2)==3)&&((int)Arr.get(3)==4)&&((int)Arr.get(4)==5));

		}
		
		// Test that size() method returns correct size as elements are added and removed
		@Test
		public void test_size() {	 
			Dynamic_Array Arr = new Dynamic_Array();
			int size1 = Arr.size();
			Arr.add(1);
			int size2 = Arr.size();
			Arr.add(2);
			int size3 = Arr.size();
			Arr.remove(0);
			int size4 = Arr.size();
				
			assertTrue((size1==0)&&(size2==1)&&(size3==2)&&(size4==1));
			}

		// Test add_at_index() method, insert element in middle
		@Test
		public void test_add_at_index_middle() {	 
			Dynamic_Array Arr = new Dynamic_Array();
			Arr.add(1);
			Arr.add(2);
			Arr.add(3);
			Arr.add(4);
			Arr.add(5);
			Arr.add(6);
			// Add new element at index 2
			Arr.add_at_index(2, 99);

			assertTrue(((int)Arr.get(0)==1)&&((int)Arr.get(1)==2)&&((int)Arr.get(2)==99)&&((int)Arr.get(3)==3)&&((int)Arr.get(4)==4)&&((int)Arr.get(5)==5)&&((int)Arr.get(6)==6));
			}

		// Test add_at_index() method, insert element at beginning
		@Test
		public void test_add_at_index_beginning() {	 
			Dynamic_Array Arr = new Dynamic_Array();
			Arr.add(1);
			Arr.add(2);
			Arr.add(3);
			Arr.add(4);
			// Add new element at index 0
			Arr.add_at_index(0, 99);

			assertTrue(((int)Arr.get(0)==99)&&((int)Arr.get(1)==1)&&((int)Arr.get(2)==2)&&((int)Arr.get(3)==3)&&((int)Arr.get(4)==4));
			}
		
		// Check that array is resizing appropriately as it expands
		@Test
		public void test_resize() {	 
			Dynamic_Array Arr = new Dynamic_Array();

			Arr.add(1);
			int cap1 = Arr.get_capacity();
			Arr.add(2);
			int cap2 = Arr.get_capacity();
			Arr.add(3);
			int cap3 = Arr.get_capacity();
			Arr.add(4);
			int cap4 = Arr.get_capacity();
			Arr.add(5);
			int cap5 = Arr.get_capacity();
			Arr.add(6);
			int cap6 = Arr.get_capacity();
			Arr.add(7);
			int cap7 = Arr.get_capacity();
			Arr.add(8);
			int cap8 = Arr.get_capacity();
			Arr.add(9);
			int cap9 = Arr.get_capacity();
				
			assertTrue((cap1==1)&&(cap2==2)&&(cap3==4)&&(cap4==4)&&(cap5==8)&&(cap6==8)&&(cap7==8)&&(cap8==8)&&(cap9==16));
			}

		// Check that array is resizing appropriately as it decreases in size
		@Test
		public void test_resize_2() {	 
			Dynamic_Array Arr = new Dynamic_Array();

			//Add 9 elements to array
			for (int i = 0; i<9; i++) {
				Arr.add(1);
			}
			
			int cap1 = Arr.get_capacity(); // 9 elements in list, should be capacity of 16
			Arr.remove(0);
			int cap2 = Arr.get_capacity(); // 8 elements in list, should be capacity of 8
			Arr.remove(0);
			Arr.remove(0);
			Arr.remove(0);
			Arr.remove(0);
			int cap3 = Arr.get_capacity(); // 4 elements in list, should be capacity of 4
			Arr.remove(0);
			Arr.remove(0);
			int cap4 = Arr.get_capacity(); // 2 elements in list, should be capacity of 2
			
			assertTrue((cap1==16)&&(cap2==8)&&(cap3==4)&&(cap4==2));
			}
		
		// Tests set() method
		@Test
	   public void test_set() {	 
			Dynamic_Array Arr = new Dynamic_Array();
			// Add some elements
			Arr.add(1);
			Arr.add(1);
			Arr.add(1);
			Arr.add(1);
			Arr.add(1);
			// Change value of third element to 99
			Arr.set(2, 99);
			assertEquals(99,(int)Arr.get(2));

		}
}