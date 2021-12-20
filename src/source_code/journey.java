package source_code;

import java.util.LinkedList;

public abstract class journey {

	private String journeyID;
	private int trainNumber;
	private String trainName;
	private LinkedList<customers> PassengersList ;
	private String origin;
	private String destination;
	private int status;
	private int totalSeats;
	private int duration;
	private float fare;
	private LinkedList<Integer> seatsAvailability;
	
	journey()
	{
		
		this.journeyID="";
		this.trainNumber=0;
		this.trainName="";
		this.PassengersList=new LinkedList<customers>();
		this.origin="";
		this.destination="";
		this.status=0;
		this.totalSeats=0;
		this.duration=0;
		this.fare=0;
		this.seatsAvailability=new LinkedList<Integer>();
		
	}
	
	journey(String jID, int tnum, String tname, String orig, String dest, int status, int totalseats, int duration, float fare)
	{
		this.journeyID=jID;
		this.trainNumber=tnum;
		this.trainName=tname;
		this.origin=orig;
		this.destination=dest;
		this.status=status;
		this.totalSeats=totalseats;
		this.duration=duration;
		this.fare=fare;
		
	}
	
	
	public void setjID(String jID)
	{
		this.journeyID=jID;
	}
	
	public void setTrainNumber(int tnum)
	{
		this.trainNumber=tnum;
	}
	
	public void setTrainName(String tname)
	{
		this.trainName=tname;
	}
	
	public boolean addPassenger(customers c)
	{
		if(this.PassengersList.add(c))
			return true;
		return false;
	}
	
	public void setOrigin(String orig)
	{
		this.origin=orig;
	}
	
	public void setDestination(String dest)
	{
		this.destination=dest;
	}
	
	public void setStatus(int status)
	{
		this.status=status;
	}
	
	public void setTotalSeats(int tseats)
	{
		this.totalSeats=tseats;
	}
	
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	
	public void setFare(float fare)
	{
		this.fare=fare;
	}
	
	public boolean seatsAvailability(int val)
	{
		if(this.seatsAvailability.add(val))
			return true;
		return false;
	}
	

	
	//	GETTERS
	
	
	
	public String getJourneyID()
	{
		return this.journeyID;
	}
	
	public int getTrainNumber()
	{
		return this.trainNumber;
	}
	
	public String getTrainName()
	{
		return this.trainName;
	}
	
	public customers getPassenger(int i)
	{
		return this.PassengersList.get(i);
	}
	
	public LinkedList<customers> getPassengers()
	{
		return this.PassengersList;
	}
	
	public String getOrigin()
	{
		return this.origin;
	}
	
	public String getDestination()
	{
		return this.destination;
	}
	
	public int getStatus()
	{
		return this.status;
	}
	
	public int getTotalSeats()
	{
		return this.totalSeats;
	}
	
	public int getDuration()
	{
		return this.duration;
	}
	
	public float getFare()
	{
		return this.fare;
	}
	
	public int getSeatAvailability(int i)
	{
		return this.seatsAvailability.get(i);
	}
	
	public LinkedList<Integer> getSeatAvailability()
	{
		return this.seatsAvailability;
	}
	
	public boolean bookTicket(String origin, String destination, int noOfSeats, customers C)
	{
		return true;
	}
	
	abstract public boolean add(int TID,String JID, int tnum, String tname, String orig, String dest, int status, int totalSeats,int dur, float fare);
	abstract public boolean update(String jID, int status);
	
}
