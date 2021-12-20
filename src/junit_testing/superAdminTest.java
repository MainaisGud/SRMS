package junit_testing;

import static org.junit.Assert.*;

import org.junit.Test;

import source_code.superAdmin;

public class superAdminTest {

	@Test
	public void testCreateAccountPos() {
		
		superAdmin obj = new superAdmin();
		assertEquals(true,obj.createAccount("90010-2345897-6", "Fahad Akhtar", 39, "fahad123@gmail.com", "H#56 ST# 12 Bahria Town Multan", 9334786, "fahad@superadmin", "superadmin123"));
		
	}
	
	@Test
	public void testLogInPos()
	{
		superAdmin obj = new superAdmin();
		assertEquals(true,obj.logIn("usmanmalik740", "1234"));
		assertEquals(false,obj.logIn("usmanmalik740", "12"));
		assertEquals(false,obj.logIn("usmanmalik74", "1234"));
		
	}
	
	@Test
	public void testAddSystemUser()
	{
		superAdmin obj = new superAdmin();
		assertEquals(true,obj.addSystemUser("84434-0356564-4", "Hammas Ahmed", 25, "H#12 ST#78 Muslim Town Rawalpindi", "hammas.ahmed@yahoo.com", 94456564, "hammas@systemuser", "systemuser123"));
	}
	
	@Test
	public void testDelSystemUser()
	{
		superAdmin obj = new superAdmin();
		assertEquals(true,obj.deleteSystemUser("hammas@systemuser"));
		assertEquals(false,obj.deleteSystemUser("hammas@systemuser"));
		assertEquals(false,obj.deleteSystemUser("hamms@systemuser"));
			
	}
	

}
