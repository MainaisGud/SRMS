package source_code;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;

public class timetable {

	private int timeTableID;
	private LocalDate dateOfTimeTable;
	private LinkedList<journey> arrivals;
	private LinkedList<journey> departures;
	Storage obj = new Storage();
	
	public timetable(String jID, int tnum, String tname, String origin, String dest, int status, int totalSeats, int duration, float fare)
	{
		this.timeTableID=0;
		this.dateOfTimeTable=null;
		this.arrivals = new LinkedList<journey>();
		this.departures = new LinkedList<journey>();
	}
	
	public timetable(int ID, LocalDate dateTT)
	{
		this.timeTableID=ID;
		this.dateOfTimeTable=dateTT;
		this.arrivals = new LinkedList<journey>();
		this.departures = new LinkedList<journey>();
	}
	
	
	//	SETTERS
	
	public timetable() {
		this.timeTableID=0;
		this.dateOfTimeTable=null;
		this.arrivals = new LinkedList<journey>();
		this.departures = new LinkedList<journey>();
	}

	public void setTimeTableID(int ID)
	{
		this.timeTableID=ID;
	}
	
	public void setDate(LocalDate date)
	{
		this.dateOfTimeTable=date;
	}
	
	
	
	//	GETTERS
	
	public int getTimeTableID()
	{
		return this.timeTableID;
	}
	
	public LocalDate getDateOfTimeTable()
	{
		return this.dateOfTimeTable;
	}
	
	
	//	FUNCTIONALITY
	
	public boolean addTimeTable(int ID, LocalDate dateTT)
	{
		//DB CALL TO ADD TIMETABLE
		if(obj.addTimeTable(ID, dateTT))
			return true;
		
		return false;
	}
	
	public boolean addArrival(int TID,String JID, int trainNo, String trainName, String origin, String Destination,int status,int totalSeats,int duration, float fare)
	{
		journey obj = new arrivals(JID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
		
		if(arrivals.size()<1)
		{
			arrivals.add(obj);
			obj.add(TID,JID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
			return true;
		}
		
		for (int i=0;i<arrivals.size();i++)
		{
			if(arrivals.get(i).getJourneyID().equals(JID))
			{
				arrivals.add(obj);
				obj.add(TID,JID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
				return true;
				
			}
		}
		return false;
	}
	
	public boolean addDeparture(int TID,String JID, int trainNo, String trainName, String origin, String Destination,int status,int totalSeats,int duration, float fare)
	{
		journey obj = new departures(JID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
		
		if(departures.size()<1)
		{
			departures.add(obj);
			obj.add(TID, JID, trainNo, trainName, origin, Destination, status, totalSeats, duration, fare);
			return true;
		}
		
		for (int i=0;i<departures.size();i++)
		{
			if(departures.get(i).getJourneyID().equals(JID))
			{
				departures.add(obj);
				obj.add(TID,JID,trainNo,trainName,origin,Destination,status,totalSeats,duration,fare);
				return true;
				
			}
		}
		return false;
	}
	
	
	public boolean updateArrival(String JID,int status)
	{
		journey obj = new arrivals();
		obj.update(JID,status);
		return true;
	}
	
	public boolean updateDeparture(String JID,int status)
	{
		journey obj = new departures();
		obj.update(JID,status);
		return true;
	}
	
	
}
