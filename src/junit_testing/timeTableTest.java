package junit_testing;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import source_code.stationMaster;
import source_code.timetable;

public class timeTableTest {

	@Test
	public void testAddTimeTablePos()
	{
		timetable obj = new timetable();
		String alpha="2021-12-20";
		LocalDate a=LocalDate.parse(alpha);
		assertEquals(true,obj.addTimeTable(0002,a));
	}

	@Test
	public void testAddArrivalsPos()
	{
		timetable obj = new timetable();
		assertEquals(true,obj.addArrival(0002,"AA-0045", 343, "Alpha Express", "Rawalpindi", "Hyderabad", 1, 173, 14, 1999));
	}
	
	
	@Test
	public void testAddDeparturesPos()
	{
		
		timetable obj = new timetable();
		assertEquals(true,obj.addDeparture(0002,"DD-0032", 343, "Alpha Express", "Rawalpindi", "Hyderabad", 1, 173, 14, 1999));
	}
	
	@Test
	public void testUpdateArrivalsPos()
	{
		timetable obj = new timetable();
		assertEquals(true,obj.updateArrival("AA-0045", 0));
	}
	
	@Test
	public void testUpdateDeparturesPos()
	{
		timetable obj = new timetable();
		assertEquals(true,obj.updateDeparture("DD-0032", 0));
	}

}
