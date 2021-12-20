package source_code;

import java.time.LocalDate;
import java.util.LinkedList;

public class Storage {

	
	private PersHand obj = new MySQL();
	
	public Storage()
	{
		
	}
	
	public  boolean addSuperAdmin(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password)
	{
		if(obj.addSuperAdmin(cnic, name, age, email, address, phoneNumber, username, password))
			return true;
		return false;
	}
	public  boolean logInSuperAdmin(String username, String password)
	{
		if(obj.logInSuperAdmin(username, password))
			return true;
		return false;
	}
	public  boolean addSystemUser(String cnic,String name,int age, String email, String address, long pNum, String username, String password)
	{
		if(obj.addSystemUser(cnic, name, age, email, address, pNum, username, password))
			return true;
		return false;
	}
	public  boolean deleteSystemUser(String username)
	{
		if(obj.deleteSystemUser(username))
			return true;
		return false;
	}
	public  boolean logInSystemUser(String username, String password)
	{
		if(obj.logInSystemUser(username, password))
			return true;
		return false;
	}
	public  boolean addStationMaster(String cnic,String name,int age, String email, String address, long pNum, String username, String password)
	{
		if(obj.addStationMaster(cnic, name, age, email, address, pNum, username, password))
			return true;
		return false;
	}
	public  boolean deleteStationMaster(String username)
	{
		if(obj.deleteStationMaster(username))
			return true;
		return false;
	}
	public  boolean addStation(int ID, String name, String loc, String ssmcnic,String city)
	{
		if(obj.addStation(ID, name, loc, ssmcnic, city))
			return true;
		return false;
	}
	public  boolean deleteStation(int ID)
	{
		if(obj.deleteStation(ID))
			return true;
		return false;
	}
	public  boolean logInStationMaster(String username, String password)
	{
		if(obj.logInStationMaster(username, password))
			return true;
		return false;
	}
	public  boolean addCustomer(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password)
	{
		if(obj.addCustomer(cnic, name, age, email, address, phoneNumber, username, password))
			return true;
		return false;
	}
	public  boolean logInCustomers(String username, String password)
	{
		if(obj.logInCustomers(username, password))
			return true;
		return false;
	}
	public  boolean addTimeTable(int ID, LocalDate dateTT)
	{
		if(obj.addTimeTable(ID, dateTT))
			return true;
		return false;
	}
	public  String returnsmCNIC(String username, String password)
	{
		return obj.returnsmCNIC(username, password);
			
	}
	public  boolean addTimeTabletoStationMaster(int ID,String cnic)
	{
		if(obj.addTimeTabletoStationMaster(ID, cnic))
			return true;
		return false;
	}
	public  boolean addArrivals(String JID,int TNum,String TName,String orig,String dest,int status,int seats,int dur,float fare)
	{
		if(obj.addArrivals(JID, TNum, TName, orig, dest, status, seats, dur, fare))
			return true;
		return false;
	}
	public  boolean addArrivaltoTimeTable(int TID, String JID)
	{
		if(obj.addArrivaltoTimeTable(TID, JID))
			return true;
		return false;
	}
	public  boolean addSeatsArrivals(String JID, int SeatNum, String SeatStat)
	{
		if(obj.addSeatsArrivals(JID, SeatNum, SeatStat))
			return true;
		return false;
	}
	public  boolean addDepartures(String JID,int TNum,String TName,String orig,String dest,int status,int seats,int dur,float fare)
	{
		if(obj.addDepartures(JID, TNum, TName, orig, dest, status, seats, dur, fare))
			return true;
		return false;
	}
	public  boolean addDeparturetoTimeTable(int TID, String JID)
	{
		if(obj.addDeparturetoTimeTable(TID, JID))
			return true;
		return false;
	}
	public  boolean addSeatsDepartures(String JID, int SeatNum, String SeatStat)
	{
		if(obj.addSeatsDepartures(JID, SeatNum, SeatStat))
			return true;
		return false;
	}
	public  boolean updateArrival(String JID,int status)
	{
		if(obj.updateArrival(JID, status))
			return true;
		return false;
	}
	public  boolean updateDeparture(String JID,int status)
	{
		if(obj.updateDeparture(JID, status))
			return true;
		return false;
	}
	public  String getArrivals()
	{
		String a=obj.getArrivals();
		return a;
	}
	public  String getDepartures()
	{
		String a=obj.getDepartures();
		return a;
	}
	public  String getStations(String loc)
	{
		String a=obj.getStations(loc);
		return a;
	}
	public  String getStationID(String stationName)
	{
		String a = obj.getStationID(stationName);
		return a;
	}
	public  LinkedList<Integer> bookTicket(String orig,String dest,int seats,String cnic)
	{
		LinkedList<Integer> a = new LinkedList<Integer>();
		a=obj.bookTicket(orig, dest, seats, cnic);
		return a;
	}
	public  String returnCustomerCNIC(String username, String password)
	{
		String a =obj.returnCustomerCNIC(username, password);
		return a;
	}
	public  LinkedList<Integer> bookTicket2(String orig, String dest, int noOfSeats, String cnic)
	{
		LinkedList<Integer> a = new LinkedList<Integer>();
		a=obj.bookTicket2(orig, dest, noOfSeats, cnic);
		return a;
	}
	public  String getStationMaster()
	{
		String a =obj.getStationMaster();
		return a;
	}
	
}
