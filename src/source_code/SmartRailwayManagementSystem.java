package source_code;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;

public class SmartRailwayManagementSystem {

	private superAdmin SA_USER;
	private customers CUS_USER;
	
	public SmartRailwayManagementSystem()
	{
	
	}
	
	public boolean superAdminCreateAccount(String cnic,String name, int age, String email,String address,long pNum,String username, String password)
	{
		superAdmin obj=new superAdmin();
		if(obj.createAccount(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
	}
	
	public boolean superAdminLogIn(String uname, String pass)
	{
		superAdmin obj=new superAdmin();
		//obj.createAccount("61101-0175757-5","Usman Malik",21,"usmanmalik740@gmail.com","H#489 ST#34 I-8/2 Islamabad",19228058L,"usmanmalik740","Pakistan123");
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		//obj.addSystemUser("85521-4532467-8", "Abeeha Fatima", 23, "abeehafatima123@hotmail.com", "H#56 ST#90 ASKARI 14 RAWALPINDI", 18335647L, "abeeha123@systemuser", "abeeha786");
			
		//obj.deleteSystemUser("abeeha123@systemuser");
		
		
		
	}
	
	
	
	public boolean superAdminAddSystemUser(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		superAdmin obj=new superAdmin();
		if(obj.addSystemUser(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
		
	}
	
	
	public boolean superAdminDeleteSystemUser(String username)
	{
		superAdmin obj=new superAdmin();
		if(obj.deleteSystemUser(username))
			return true;
		else
			return false;
	}
	
	
	public boolean systmerUserLogIn(String uname, String pass)
	{
		systemUser obj=new systemUser();
		//obj.createAccount("61101-0175757-5","Usman Malik",21,"usmanmalik740@gmail.com","H#489 ST#34 I-8/2 Islamabad",19228058L,"usmanmalik740","Pakistan123");
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		
	}
	
	
	public boolean systemUserAddStationMaster(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		systemUser obj = new systemUser();
		if(obj.addStationMaster(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
		
	}
	
	public boolean systemUserDeleteStationMaster(String username)
	{
		systemUser obj = new systemUser();
		if(obj.deleteStationMaster(username))
			return true;
		else
			return false;
	}
	
	
	public boolean systemUserAddStation(int ID,String name, String loc, String ssmcnic,String city)
	{
		systemUser obj = new systemUser();
		if(obj.addStation(ID, name, loc, ssmcnic,city))
			return true;
		else
			return false;
		
		
	}
	
	public boolean systemUserDelStation(int ID)
	{
		systemUser obj = new systemUser();
		if(obj.deleteStation(ID))
			return true;
		else
			return false;
		
		
	}
	
	
	public boolean stationMasterLogIn(String uname, String pass)
	{
		stationMaster obj = new stationMaster();
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		
	}
	
	
	
	public boolean customersLogIn(String uname, String pass)
	{
		customers obj= new customers();
		if(obj.logIn(uname,pass))
			return true;
		else
			return false;
		
		
		
	}
	
	
	public boolean addCustomer(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		customers obj= new customers();
		if(obj.createAccount(cnic, name, age, email, address, pNum, username, password))
			return true;
		else
			return false;
		
		
	}
	
	public boolean addTimeTable(int ID, LocalDate dateTT)
	{
		stationMaster obj = new stationMaster();
		if(obj.addTimeTable(ID, dateTT))
			return true;
		return false;
	}
	
	
	public String getStationMasterCNIC(String username,String password)
	{
		stationMaster obj = new stationMaster();
		return(obj.returnCNIC(username, password));
		
	}
	
	
	public boolean addTimeTabletoStationMaster(int ID, String cnic)
	{
		stationMaster obj = new stationMaster();
		if(obj.addTimeTabletoSM(ID, cnic))
			return true;
		return false;
	}
	
	
	public boolean addArrival(int ID,String JID,int TNum,String TName,String orig,String dest,int stat,int seats,int dur, float fare)
	{
		stationMaster obj = new stationMaster();
		if(obj.addArrival(ID, JID, TNum, TName, orig, dest, stat, seats, dur, fare))
			return true;
		return false;
	}
	
	public boolean addArrivaltoTimeTable(int TID,String JID)
	{
		stationMaster obj = new stationMaster();
		if(obj.addArrivaltoTimeTable(TID, JID))
			return true;
		return false;
	}
	
	public boolean addSeatsArrivals(String JID, int SeatNum, String SeatStat)
	{
		stationMaster obj = new stationMaster();
		if(obj.addSeatsArrivals(JID, SeatNum, SeatStat))
			return true;
		return false;
	}
	
	public boolean addDeparture(int ID,String JID,int TNum,String TName,String orig,String dest,int stat,int seats,int dur, float fare)
	{
		stationMaster obj = new stationMaster();
		if(obj.addDepartures(ID, JID, TNum, TName, orig, dest, stat, seats, dur, fare))
			return true;
		return false;
	}
	
	public boolean addDeparturetoTimeTable(int TID,String JID)
	{
		stationMaster obj = new stationMaster();
		if(obj.addDeparturetoTimeTable(TID, JID))
			return true;
		return false;
	}
	
	public boolean addSeatsDepartures(String JID, int SeatNum, String SeatStat)
	{
		stationMaster obj = new stationMaster();
		if(obj.addSeatsDepartures(JID, SeatNum, SeatStat))
			return true;
		return false;
	}
	
	public boolean updateArrival(int TID,String JID, int status)
	{
		stationMaster obj = new stationMaster();
		if(obj.updateArrival(TID, JID, status))
			return true;
		return false;
	}
	
	
	public boolean updateDeparture(int TID,String JID, int status)
	{
		stationMaster obj = new stationMaster();
		if(obj.updateDeparture(TID, JID, status))
			return true;
		return false;
	}
	
	public String getArrivals()
	{
		Storage obj = new Storage();
		return obj.getArrivals();
		
	}
	
	public String getDepartures()
	{
		Storage obj = new Storage();
		return obj.getDepartures();
		
	}
	
	public String getStations(String location)
	{
		Storage obj = new Storage();
		return obj.getStations(location);
	}
	
	public String getStationID(String stationName)
	{
		Storage obj = new Storage();
		return obj.getStationID(stationName);
	}
	
	public LinkedList<Integer> bookTicket(String orig,String dest,int noOfSeats,String cnic)
	{
		Storage obj = new Storage();
		LinkedList<Integer> sNo= new LinkedList<Integer>();
		sNo=obj.bookTicket(orig, dest, noOfSeats, cnic);
		return sNo;
	}
	
	public String getCustomersCNIC(String username,String password)
	{
		Storage obj = new Storage();
		return obj.returnCustomerCNIC(username, password);
		
	}

	public LinkedList<Integer> bookTicket2(String orig, String dest, int noOfSeats, String cnic) 
	{
		Storage obj = new Storage();
		LinkedList<Integer> sNo= new LinkedList<Integer>();
		sNo=obj.bookTicket2(orig, dest, noOfSeats, cnic);
		return sNo;
	}

	public String getStationMasters() {
		Storage obj = new Storage();
		return obj.getStationMaster();
	}
	
	
}

