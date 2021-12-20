package junit_testing;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import org.junit.Test;

import source_code.MySQL;
import source_code.PersHand;
import source_code.arrivals;

public class arrivalsTest {

	@Test 
	public void testAddPos() {
		
		arrivals obj = new arrivals();
		boolean flag=obj.add(0001, "AA124", 2, "ABC", "Lahore", "Islamabad", 1, 3, 2, 2);
		assertEquals(flag,true);
		
	}
	
	
	
	/*@Test (expected=SQLException.class)
	public void testAddNeg() 
	{
		PersHand obj = new MySQL();
		boolean flag=obj.addArrivals("AA124", 2, "ABC", "Lahore", "Islamabad", 1, 3, 2, 2);
		
	}
	*/
	
	@Test
	public void testUpdatePos() {
		
		arrivals obj = new arrivals();
		boolean flag=obj.update("AA124", 1);
		assertEquals(flag,true);
		
	}
	

}
