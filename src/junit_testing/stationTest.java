package junit_testing;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import source_code.station;

public class stationTest {

	@Test
	public void testAddPos() {
		station obj = new station();
		assertEquals(true,obj.add(122, "North Nazimabad Station", "Opposite HBL Bank North Nazimabad", "81121-4545454-4", "Karachi"));
		
	}
	
	@Test
	public void testDelPos()
	{
		station obj = new station();
		assertEquals(true,obj.delete(122));
		assertEquals(false,obj.delete(33));
		
	}
	
	/*@Test (expected=SQLException.class)
	public void testAddNeg() {
		station obj = new station();
		assertEquals(true,obj.add(122, "North Nazimabad Station", "Opposite HBL Bank North Nazimabad", "81121-4545454-5", "Karachi"));
		
	}
	*/
	
}
