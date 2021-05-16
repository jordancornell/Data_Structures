import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Linked_List_Unit_Tests {

	// Test that items are successfully added to front of list, and popped from the front of the list
	@Test
	public void test_add_front() {	 
		Linked_List list = new Linked_List();
		list.PushToFront(1);
		list.PushToFront(2);
		list.PushToFront(3);

		assertTrue(((int)list.PopFromFront()==3)&&((int)list.PopFromFront()==2)&&((int)list.PopFromFront()==1)&&(list.PopFromFront()==null));
	}
	
	// Test that items are successfully added to back of list, and popped from the back of the list
	@Test
	public void test_add_back() {	 
		Linked_List list = new Linked_List();
		list.PushToBack(1);
		list.PushToBack(2);
		list.PushToBack(3);

		assertTrue(((int)list.PopFromBack()==3)&&((int)list.PopFromBack()==2)&&((int)list.PopFromBack()==1)&&(list.PopFromBack()==null));
	}	
	
	// Test AddBefore() method
	@Test
	public void test_add_before() {	 
		Linked_List list = new Linked_List();
		list.PushToFront(1);
		list.PushToFront(2);
		list.PushToFront(3);
		
		list.AddBefore(99,list.GetNode(2));

		assertTrue(((int)list.PopFromFront()==3)&&((int)list.PopFromFront()==99)&&((int)list.PopFromFront()==2)&&((int)list.PopFromFront()==1));
	}
	
	// Test AddAfter() method
	@Test
	public void test_add_after() {	 
		Linked_List list = new Linked_List();
		list.PushToFront(1);
		list.PushToFront(2);
		list.PushToFront(3);
		
		list.AddAfter(99,list.GetNode(2));

		assertTrue(((int)list.PopFromFront()==3)&&((int)list.PopFromFront()==2)&&((int)list.PopFromFront()==99)&&((int)list.PopFromFront()==1));
	}
	
	// Test find key in list method
	@Test
	public void test_find_in_list() {	 
		Linked_List list = new Linked_List();
		list.PushToFront(1);
		list.PushToFront(2);
		list.PushToFront(3);

		assertTrue((list.InList(1)==true)&&(list.InList(2)==true)&&(list.InList(3)==true)&&(list.InList(0)==false));
	}	
	
	// Test that item is successfully deleted
	@Test
	public void test_delete() {	 
		Linked_List list = new Linked_List();
		list.PushToFront(1);
		list.PushToFront(2);
		list.PushToFront(3);
		boolean inlist1 = list.InList(2);
		list.Delete(2);
		boolean inlist2 = list.InList(2);

		assertTrue((inlist1 == true)&&(inlist2 == false));
	}	
}