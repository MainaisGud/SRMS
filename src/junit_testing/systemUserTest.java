package junit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

import source_code.superAdmin;
import source_code.systemUser;

public class systemUserTest {

	@Test
	public void testAddPos() {
		systemUser obj = new systemUser();
		assertEquals(true,obj.addUser("84434-0356564-4", "Hammas Ahmed", 25, "H#12 ST#78 Muslim Town Rawalpindi", "hammas.ahmed@yahoo.com", 94456564, "hammas@systemuser", "systemuser123"));
	}


	@Test
	public void testDelPos() {
		systemUser obj = new systemUser();
		assertEquals(true,obj.deleteUser("hammas@systemuser"));
		assertEquals(false,obj.deleteUser("hammas@systemuser"));
		assertEquals(false,obj.deleteUser("hammas@syemuser"));

	}
	

	@Test
	public void testLogInPos()
	{
		systemUser obj = new systemUser();
		assertEquals(true,obj.logIn("abeeha@system", "abeeha786"));
		assertEquals(false,obj.logIn("abeeha@systemuser", "abeeha"));
		assertEquals(false,obj.logIn("abeeha", "abeeha786"));
		
	}
	
	@Test 
	public void testAddStationMasterPos()
	{
		systemUser obj = new systemUser();
		assertEquals(true,obj.addStationMaster("84434-0356564-4", "Hammas Ahmed", 25, "H#12 ST#78 Muslim Town Rawalpindi", "hammas.ahmed@yahoo.com", 94456564, "hammas@stationmaster", "stationmaster123"));
		
		
	}

	@Test
	public void testDelStationMasterPos() {
		systemUser obj = new systemUser();
		assertEquals(true,obj.deleteStationMaster("hammas@stationmaster"));
		assertEquals(false,obj.deleteStationMaster("hammas@stationmaster"));
		assertEquals(false,obj.deleteStationMaster("hammas@stanmaster"));
	}
	
	@Test 
	public void testAddStationPos()
	{
		systemUser obj = new systemUser();
		assertEquals(true,obj.addStation(0003, "Test", "Test", "81121-4545454-4","Test"));
		
		
	}
	
	@Test 
	public void testDelStationPos()
	{
		systemUser obj = new systemUser();
		assertEquals(false,obj.deleteStation(3));
		
		
	}
	
	
	
	
}
