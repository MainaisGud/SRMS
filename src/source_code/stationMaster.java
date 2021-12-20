package source_code;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;

public class stationMaster {
	
	private String CNIC_SM;
	private String name_SM;
	private int age_SM;
	private String emailAddress_SM;
	private String address_SM;
	private long phoneNumber_SM;
	private String username_SM;
	private String password_SM;
	private LinkedList<timetable> trainSchedule;
	Storage obj = new Storage();
	
	public stationMaster()
	{
		this.CNIC_SM="";
		this.name_SM="";
		this.age_SM=18;
		this.emailAddress_SM="";
		this.address_SM="";
		this.phoneNumber_SM=0;
		this.username_SM="";
		this.password_SM="";
		this.trainSchedule = new LinkedList<timetable>();
	}
	
	public stationMaster(String cnic,String name, int age, String email, String address, long pNum, String username, String password)
	{
		this.CNIC_SM=cnic;
		this.name_SM=name;
		this.age_SM=age;
		this.emailAddress_SM=email;
		this.address_SM=address;
		this.phoneNumber_SM=pNum;
		this.username_SM=username;
		this.password_SM=password;
		this.trainSchedule = new LinkedList<timetable>();
	}
	
	
	
	//	SETTERS
	
	
	public void setCNIC(String cnic)
	{
		this.CNIC_SM=cnic;
	}
	
	public void setName(String name)
	{
		this.name_SM=name;
	}
	
	public void setAge(int age)
	{
		this.age_SM=age;
	}
	
	public void setEmail(String email)
	{
		this.emailAddress_SM=email;
	}
	
	public void setAddress(String address)
	{
		this.address_SM=address;
	}
	
	public void setPhoneNumber(long pNum)
	{
		this.phoneNumber_SM=pNum;
	}
	
	
	
	//	GETTERS
	
	
	public String getCNIC()
	{
		return this.CNIC_SM;
	}
	
	public String getName()
	{
		return this.name_SM;
	}
	
	public int getAge()
	{
		return this.age_SM;
	}
	
	public String getEmail()
	{
		return this.emailAddress_SM;
	}
	
	public String getAddress()
	{
		return this.address_SM;
	}
	
	public long getPhoneNumber()
	{
		return this.phoneNumber_SM;
	}
	
	public String getUsername()
	{
		return this.username_SM;
	}
	
	public String getPassword()
	{
		return this.password_SM;
	}
	
	public timetable getTimeTable(int i)
	{
		return this.trainSchedule.get(i);
	}
	
	public LinkedList<timetable> getTimeTable()
	{
		return this.trainSchedule;
	}
	
	
	//	FUNCTIONALITY
	
	
	public boolean logIn(String username, String password)
	{
		// DB CALL TO AUTENTHICATE USER
		
		if(obj.logInStationMaster(username, password))
			return true;
		return false;
	}
	
	public boolean logOut()
	{
		//CALL TO DB TO LOG OUT
		return true;
	}
	
	public boolean add(String cnic, String name, int age, String email, String address, long pNum, String username, String password)
	{
		//DB CALL TO ADD
		if(obj.addStationMaster(cnic, name, age, email, address, pNum, username, password))
			return true;
		return false;
	}
	
	public boolean delete(String username)
	{
		//DB CALL TO DELETE
		if(obj.deleteStationMaster(username))
			return true;
		return false;
	}
	
	public boolean addTimeTable(int ID, LocalDate dateTT )
	{
		timetable obj = new timetable(ID,dateTT);
		if(trainSchedule.size()<1)
		{
			trainSchedule.add(obj);
			trainSchedule.get(0).addTimeTable(ID,dateTT);
			return true;
			
		}
		
		
		for(int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==ID)
			{
				trainSchedule.add(obj);
				trainSchedule.get(i).addTimeTable(ID,dateTT);
				return true;
			}
		}
		return false;
	}
	
	public boolean addArrival(int TID,String JID, int tnum, String tname, String origin, String dest, int status,int totalSeats, int duration, float fare)
	{
		timetable obj = new timetable(JID,tnum,tname,origin,dest,status,totalSeats,duration,fare);
		
		if(trainSchedule.size()<1)
		{
			trainSchedule.add(obj);
			obj.addArrival(TID, JID, tnum, tname, origin, dest, status, totalSeats, duration, fare);
			return true;
		}
		
		
		
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==TID)
			{
				trainSchedule.get(i).addArrival(TID,JID,tnum,tname, origin, dest, status, totalSeats, duration, fare);
				obj.addArrival(TID, JID, i, tname, origin, dest, status, totalSeats, duration, fare);
				return true;
			}
		}
		return false;
	}
	
	
	public boolean addDepartures(int TID, String JID, int tnum, String tname, String origin, String dest, int status, int totalSeats,int duration, float fare)
	{
		timetable obj = new timetable(JID,tnum,tname,origin,dest,status,totalSeats,duration,fare);
		
		if(trainSchedule.size()<1)
		{
			trainSchedule.add(obj);
			obj.addDeparture(TID, JID, tnum, tname, origin, dest, status, totalSeats, duration, fare);
			return true;
		}
		
		
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==TID)
			{
				trainSchedule.get(i).addDeparture(TID,JID,tnum,tname, origin, dest, status, totalSeats, duration, fare);
				obj.addDeparture(TID, JID, i, tname, origin, dest, status, totalSeats, duration, fare);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateArrival(int ID,String JID,int status)
	{
		timetable obj = new timetable();
		if(trainSchedule.size()<1)
		{
			obj.updateArrival(JID, status);
			return true;
		}
		
		
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==ID)
			{
				trainSchedule.get(i).updateArrival(JID,status);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateDeparture(int ID,String JID,int status)
	{
		
		timetable obj = new timetable();
		if(trainSchedule.size()<1)
		{
			obj.updateDeparture(JID, status);
			return true;
		}
		
		
		for (int i=0;i<trainSchedule.size();i++)
		{
			if(trainSchedule.get(i).getTimeTableID()==ID)
			{
				trainSchedule.get(i).updateDeparture(JID,status);
				return true;
			}
		}
		return false;
	}
	
	public String returnCNIC(String username,String password)
	{
		return obj.returnsmCNIC(username, password);
	}

	public boolean addTimeTabletoSM(int iD, String cnic) {
		if(obj.addTimeTabletoStationMaster(iD, cnic))
			return true;
		return false;
	}

	
	public boolean addArrivaltoTimeTable(int ID, String JID)
	{
		if(obj.addArrivaltoTimeTable(ID, JID))
			return true;
		return false;
	}
	
	public boolean addSeatsArrivals(String JID, int SeatNum, String SeatStat)
	{
		if(obj.addSeatsArrivals(JID, SeatNum, SeatStat))
			return true;
		return false;
	}
	
	public boolean addDeparturetoTimeTable(int ID, String JID)
	{
		if(obj.addDeparturetoTimeTable(ID, JID))
			return true;
		return false;
	}
	
	public boolean addSeatsDepartures(String JID, int SeatNum, String SeatStat)
	{
		if(obj.addSeatsDepartures(JID, SeatNum, SeatStat))
			return true;
		return false;
	}
}
