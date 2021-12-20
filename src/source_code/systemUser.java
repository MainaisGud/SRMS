package source_code;

import java.util.LinkedList;

public class systemUser {

	private String CNIC_SU;
	private String name_SU;
	private int age_SU;
	private String emailAddress_SU;
	private String address_SU;
	private long phoneNumber_SU;
	private String username_SU;
	private String password_SU;
	private LinkedList<station> stationsList;
	private LinkedList<stationMaster> stationMastersList;
	Storage obj = new Storage();
	
	public systemUser()
	{
		this.CNIC_SU="";
		this.name_SU="";
		this.age_SU=18;
		this.emailAddress_SU="";
		this.address_SU="";
		this.phoneNumber_SU=0;
		this.username_SU="";
		this.password_SU="";
		stationsList = new LinkedList<station>();
		stationMastersList = new LinkedList<stationMaster>();
	}
	
	public systemUser(String cnic, String name, int age, String email, String address, long phoneNum, String username, String password)
	{
		this.CNIC_SU=cnic;
		this.name_SU=name;
		this.age_SU=age;
		this.emailAddress_SU=email;
		this.address_SU=address;
		this.phoneNumber_SU=phoneNum;
		this.username_SU=username;
		this.password_SU=password;
		stationsList = new LinkedList<station>();
		stationMastersList = new LinkedList<stationMaster>();
		
	}
	
	
	//	SETTERS
	
	public void setCNIC(String cnic)
	{
		this.CNIC_SU=cnic;
	}
	
	public void setName(String name)
	{
		this.name_SU=name;
	}
	
	public void setAge(int age)
	{
		this.age_SU=age;
	}
	
	public void setEmail(String email)
	{
		this.emailAddress_SU=email;
	}
	
	public void setAddress(String address)
	{
		this.address_SU=address;
	}
	
	public void setPhoneNumber(long pNum)
	{
		this.phoneNumber_SU=pNum;
	}
	
	
	//	GETTERS
	
	
	public String getCNIC()
	{
		return this.CNIC_SU;
	}
	
	public String getName()
	{
		return this.name_SU;
	}
	
	public int getAge()
	{
		return this.age_SU;
	}
	
	public String getEmail()
	{
		return this.emailAddress_SU;
	}
	
	public String getAddress()
	{
		return this.address_SU;
	}
	
	public long getPhoneNumber()
	{
		return this.phoneNumber_SU;
	}
	
	public String getUsername()
	{
		return this.username_SU;
	}
	
	public String getPassword()
	{
		return this.password_SU;
	}
	
	
	public station getStation(int i)
	{
		return this.stationsList.get(i);
	}
	
	public LinkedList<station> getStationsList()
	{
		return this.stationsList;
	}
	
	public stationMaster getStationMaster(int i)
	{
		return this.getStationMaster(i);
	}
	
	public LinkedList<stationMaster> getStationMasters()
	{
		return this.stationMastersList;
	}
	
	
	//	FUNCTIONALITY
	
	
	
	public boolean addUser(String cnic,String name,int age, String email, String address, long pNum, String username, String password)
	{
		
		//DB CALL TO ADD USER
		if(obj.addSystemUser(cnic,name,age,email,address,pNum,username,password))
			return true;
		return false;
	}
	
	public boolean deleteUser(String username)
	{
		//CALL TO DB TO DELETE
		if(obj.deleteSystemUser(username))
			return true;
		return false;
	}
	
	public boolean logIn(String username, String password)
	{
		if(obj.logInSystemUser(username, password))
			return true;
		return false;
	}
	
	public boolean logOut()
	{
		//CALL TO DB TO LOG OUT
		return true;
	}
	
	
	
	public boolean addStationMaster(String CNIC, String name, int age, String email, String address, long pNum, String username, String password)
	{
		stationMaster obj= new stationMaster(CNIC,name,age,email,address,pNum,username,password);
		
		if(stationMastersList.size()<1)
		{
			stationMastersList.add(obj);
			obj.add(CNIC, name, age, email, address, pNum, username, password);
		}
		for(int i=0;i<stationMastersList.size();i++)
		{
			if(stationMastersList.get(i).getCNIC().equals(CNIC))
			{
				stationMastersList.add(obj);
				stationMastersList.get(i).add(CNIC,name,age,email,address,pNum,username,password);
				return true;
			}
		}
		
		return true;
	}
	
	public boolean deleteStationMaster(String username)
	{
		stationMaster obj=new stationMaster();
		
		if(obj.delete(username))
			return true;
		
		return false;
	}
	
	public boolean addStation(int ID,String name, String loc, String ssmcnic,String city)
	{
		station obj = new station(ID,name,loc,ssmcnic,city);
		
		if(stationsList.size()<1)
		{
			stationsList.add(obj);
			if(obj.add(ID, name, loc, ssmcnic,city))
				return true;
		
		}
		for(int i=0;i<stationsList.size();i++)
		{
			if(stationsList.get(i).getID()==ID)
			{
				stationsList.add(obj);
				stationsList.get(i).add(ID, name, loc, ssmcnic,city);
				return true;
			}
		}
		
		return false;
	}
	
	
	public boolean deleteStation(int ID)
	{
		station obj=new station();
		
		if(obj.delete(ID))
		{
			return true;
		}
		
		return false;
	}
	
}
