package source_code;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;

public abstract class PersHand {

	
	public abstract boolean addSuperAdmin(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password);
	public abstract boolean logInSuperAdmin(String username, String password);
	public abstract boolean addSystemUser(String cnic,String name,int age, String email, String address, long pNum, String username, String password);
	public abstract boolean deleteSystemUser(String username);
	public abstract boolean logInSystemUser(String username, String password);
	public abstract boolean addStationMaster(String cnic,String name,int age, String email, String address, long pNum, String username, String password);
	public abstract boolean deleteStationMaster(String username);
	public abstract boolean addStation(int ID, String name, String loc, String ssmcnic,String city);
	public abstract boolean deleteStation(int ID);
	public abstract boolean logInStationMaster(String username, String password);
	public abstract boolean addCustomer(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password);
	public abstract boolean logInCustomers(String username, String password);
	public abstract boolean addTimeTable(int ID, LocalDate dateTT);
	public abstract String returnsmCNIC(String username, String password);
	public abstract boolean addTimeTabletoStationMaster(int ID,String cnic);
	public abstract boolean addArrivals(String JID,int TNum,String TName,String orig,String dest,int status,int seats,int dur,float fare);
	public abstract boolean addArrivaltoTimeTable(int TID, String JID);
	public abstract boolean addSeatsArrivals(String JID, int SeatNum, String SeatStat);
	public abstract boolean addDepartures(String JID,int TNum,String TName,String orig,String dest,int status,int seats,int dur,float fare);
	public abstract boolean addDeparturetoTimeTable(int TID, String JID);
	public abstract boolean addSeatsDepartures(String JID, int SeatNum, String SeatStat);
	public abstract boolean updateArrival(String JID,int status);
	public abstract boolean updateDeparture(String JID,int status);
	public abstract String getArrivals();
	public abstract String getDepartures();
	public abstract String getStations(String loc);
	public abstract String getStationID(String stationName);
	public abstract LinkedList<Integer> bookTicket(String orig,String dest,int seats,String cnic);
	public abstract String returnCustomerCNIC(String username, String password);
	public abstract LinkedList<Integer> bookTicket2(String orig, String dest, int noOfSeats, String cnic);
	public abstract String getStationMaster();
	
}

