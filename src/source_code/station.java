package source_code;

public class station {

	private int id_ST;
	private String name_ST;
	private String location_ST;
	private String stationMasterCNIC;
	private String city_ST;
	Storage obj = new Storage();
	
	public station()
	{
		this.id_ST=0;
		this.name_ST="";
		this.location_ST="";
		this.stationMasterCNIC="";
		this.city_ST="";
	}
	
	public station(int id, String name, String location,String SM,String city)
	{
		this.id_ST=id;
		this.name_ST=name;
		this.location_ST=location;
		this.stationMasterCNIC=SM;
		this.city_ST=city;
	}
	
	
	//	SETTERS
	
	public void setID(int ID)
	{
		this.id_ST=ID;
	}
	
	public void setName(String name)
	{
		this.name_ST=name;
	}
	
	public void setLocation(String location)
	{
		this.location_ST=location;
	}
	
	public void setCity(String city)
	{
		this.city_ST=city;
	}
	
	
	//	GETTERS
	
	public int getID()
	{
		return this.id_ST;
	}
	
	public String getName()
	{
		return this.name_ST;
	}
	
	public String getLocation()
	{
		return this.location_ST;
	}
	
	public String getCity()
	{
		return this.city_ST;
	}
	
	
	//	FUNCTIONALITY
	
	
	public boolean add(int ID, String name, String location,String SM,String city)
	{
		//DB CALL TO ADD A STATION
		
		if(obj.addStation(ID, name, location, SM,city))
			return true;
		return false;
	}
	
	public boolean delete(int ID)
	{
		//DB CALL TO DELETE A STATION
		if(obj.deleteStation(ID))
			return true;
		return false;
	}
}
