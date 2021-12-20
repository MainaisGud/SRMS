package junit_testing;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import org.junit.Test;

import source_code.MySQL;
import source_code.PersHand;
import source_code.departures;

public class departuresTest {

	@Test 
	public void testAddPos() {
		
		departures obj = new departures();
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
		
		departures obj = new departures();
		boolean flag=obj.update("AA124", 0);
		assertEquals(flag,true);
		
	}
	

}
