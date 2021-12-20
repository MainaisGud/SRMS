package junit_testing;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import source_code.customers;

public class customersTest {

	@Test
	public void testCreateAccountPos() {
		customers obj = new customers();
		assertEquals(true,obj.createAccount("61101-2321212-2","Aman Ali",45,"aman456@gmail.com","H#432 ST#12 Model Town Lahore",322123323,"aman456","Pakistan123"));
		
	}
	
	/*
	@Test (expected=SQLException.class)
	public void testCreateAccountNeg()
	{
		customers obj = new customers();
		obj.createAccount("Test","Aman Ali",45,"aman456@gmail.com","H#432 ST#12 Model Town Lahore",322123323,"Test123","Pakistan123");
		
	}*/
	
	
	@Test 
	public void logInPos()
	{
		customers obj = new customers();
		assertEquals(true,obj.logIn("Test123","Test"));
		assertEquals(false,obj.logIn("aman456","Pakistan"));
		assertEquals(false,obj.logIn("aman45","Pakistan123"));
			
	}
	
	@Test
	public void logInNeg()
	{
		customers obj = new customers();
		assertEquals(false,obj.logIn("323","Test"));
		assertEquals(false,obj.logIn("aman456","23"));
		
	}

}
