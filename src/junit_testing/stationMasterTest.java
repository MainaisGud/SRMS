package junit_testing;

import static org.junit.Assert.*;
import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.Test;

import source_code.stationMaster;

public class stationMasterTest {

	@Test
	public void testAddPos() {
		
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.add("61103-2323234-5", "Ahmed Shahzad", 54, "ahmed777@gmail.com", "Apartment# 34 Building# 5 Block A Rehmanabad Heights, Karachi", 9443545, "ahmed@stationmaster", "stationmaster123"));
		
	}
	
	
	@Test
	public void testLogInPos() {
		
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.logIn("TestSM","Test"));
		assertEquals(false,obj.logIn("ahmed@stationmaster", "stationmaster122"));
		assertEquals(false,obj.logIn("ahmed@stationmasteR", "stationmaster123"));
		assertEquals(false,obj.logIn("ahmed@stationmasterrr", "stationmaster123"));
		assertEquals(false,obj.logIn("ahmed@stationmaster", ""));
		assertEquals(false,obj.logIn("", "stationmaster123"));
		
		
	}
	
	@Test
	public void testDelPos() {
		
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.delete("ahmed@stationmaster"));
		assertEquals(false,obj.delete("ahmed@stationmasterr"));
		assertEquals(false,obj.delete("ahmed@stationmaster"));
		
		
	}
	
	
	/*@Test (expected=SQLException.c)
	public void testAddTimeTablePos()
	{
		stationMaster obj = new stationMaster();
		String alpha="2021-12-20";
		LocalDate a=LocalDate.parse(alpha);
		assertEquals(true,obj.addTimeTable(0002,a));
	}

	@Test
	public void testAddTimeTabletoSMPos()
	{
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.addTimeTabletoSM(0002,"81121-4545454-4"));
	}
	
	*/
	
	@Test
	public void testAddArrivalsPos()
	{
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.addArrival(0002,"AA-0045", 343, "Alpha Express", "Rawalpindi", "Hyderabad", 1, 173, 14, 1999));
	}
	
	
	@Test
	public void testAddDeparturesPos()
	{
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.addDepartures(0002,"DD-0032", 343, "Alpha Express", "Rawalpindi", "Hyderabad", 1, 173, 14, 1999));
	}
	
	@Test
	public void testUpdateArrivalsPos()
	{
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.updateArrival(0002, "AA-0045", 0));
	}
	
	@Test
	public void testUpdateDeparturesPos()
	{
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.updateDeparture(0002, "DD-0032", 0));
	}
	
	@Test
	public void testAddArrivalToTimeTable()
	{
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.addArrivaltoTimeTable(0001, "AA124"));
	}
	
	@Test
	public void testAddDepartureToTimeTable()
	{
		stationMaster obj = new stationMaster();
		assertEquals(true,obj.addDeparturetoTimeTable(0001, "AA124"));
	}
	
	
	
	
	
}
