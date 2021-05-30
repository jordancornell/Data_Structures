import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Hash_Map_Unit_Tests {

	// Test put() method - ensure total number of pairs in map is correct
	@Test
	public void test_put() {	 
		Hash_Map hashmap = new Hash_Map();
		hashmap.put("key",100);
		hashmap.put("anotherkey",200);
		hashmap.put("thirdkey",300);
		int size = hashmap.return_contents().length;
		hashmap.put("onemorekey",400);
		int size2 = hashmap.return_contents().length;
		
		assertTrue((size==3)&&(size2==4));
		}
	// Test	get_value() method - ensure correct value returned, given key
	@Test
	public void test_get() {	 
		Hash_Map hashmap = new Hash_Map();
		hashmap.put("key",100);
		hashmap.put("anotherkey",200);
		hashmap.put("thirdkey",300);

		Object value = hashmap.getValue("anotherkey");
		
		assertEquals(value,200);
		}
	// Test	get_value() method - returns null when key doesn't exist
	@Test
	public void test_get_2() {	 
		Hash_Map hashmap = new Hash_Map();
		hashmap.put("key",100);
		hashmap.put("anotherkey",200);
		hashmap.put("thirdkey",300);

		Object value = hashmap.getValue("fakekey");
		
		assertEquals(value,null);
		}
	
	// Test delete() method - successfully removes pair from map
	@Test
	public void test_delete() {	 
		Hash_Map hashmap = new Hash_Map();
		hashmap.put("key",100);
		hashmap.put("anotherkey",200);
		hashmap.put("thirdkey",300);
		
		Object value1 = hashmap.getValue("anotherkey");
		hashmap.delete("anotherkey");
		Object value2 = hashmap.getValue("anotherkey");
	
		assertTrue(value1.equals(200)&&(value2==null));
		}
	
	// Test put() and delete() methods - ensure total number of pairs in map is correct as pairs are added and removed
	@Test
	public void test_add_front() {	 
		Hash_Map hashmap = new Hash_Map();
		hashmap.put("key",100);
		hashmap.put("anotherkey",200);
		hashmap.put("morekeys",300);
		hashmap.delete("key");
		int size = hashmap.return_contents().length;

		assertTrue(size==2);
		}	
}



