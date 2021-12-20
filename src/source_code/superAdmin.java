package source_code;

import java.util.LinkedList;

public class superAdmin {

	private String CNIC_SA;
	private String name_SA;
	private int age_SA;
	private String emailAddress_SA;
	private String address_SA;
	private long phoneNumber_SA;
	private String username_SA;
	private String password_SA;
	private LinkedList<systemUser> systemUsers_SA;
	Storage obj = new Storage();
	systemUser SUobj = new systemUser();
	
	public superAdmin()
	{
		this.CNIC_SA="";
		this.name_SA="";
		this.age_SA=18;
		this.emailAddress_SA="";
		this.address_SA="";
		this.phoneNumber_SA=0;
		this.username_SA="admin";
		this.password_SA="admin";
		this.systemUsers_SA= new LinkedList<systemUser>();
	}
	
	
	@SuppressWarnings("unused")
	private superAdmin(String cnic, String name, int age, String email, String address, long phoneNum, String username, String password)
	{
		this.CNIC_SA=cnic;
		this.name_SA=name;
		this.age_SA=age;
		this.emailAddress_SA=email;
		this.address_SA=address;
		this.phoneNumber_SA=phoneNum;
		this.username_SA=username;
		this.password_SA=password;
		this.systemUsers_SA= new LinkedList<systemUser>();
		
	}
	
	
	//	SETTERS
	
	public void setCNIC(String cnic)
	{
		this.CNIC_SA=cnic;
	}
	
	public void setName(String name)
	{
		this.name_SA=name;
	}
	
	public void setAge(int age)
	{
		this.age_SA=age;
	}
	
	public void setEmail(String email)
	{
		this.emailAddress_SA=email;
	}
	
	public void setAddress(String address)
	{
		this.address_SA=address;
	}
	
	public void setPhoneNumber(long pNum)
	{
		this.phoneNumber_SA=pNum;
	}
	
	
	//	GETTERS
	
	public String getCNIC()
	{
		return this.CNIC_SA;
	}
	
	public String getName()
	{
		return this.name_SA;
	}
	
	public int getAge()
	{
		return this.age_SA;
	}
	
	public String getEmail()
	{
		return this.emailAddress_SA;
	}
	
	public String getAddress()
	{
		return this.address_SA;
	}
	
	public long getPhoneNumber()
	{
		return this.phoneNumber_SA;
	}
	
	public String getUsername()
	{
		return this.username_SA;
	}
	
	public String getPassword()
	{
		return this.password_SA;
	}
	
	public systemUser getSystemUser(int i)
	{
		return this.systemUsers_SA.get(i);
	}
	
	public LinkedList<systemUser> getSystemUsers()
	{
		return this.systemUsers_SA;
	}
	
	
	//	FUNCTIONALITY
	
	
	public boolean createAccount(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password)
	{
		//superAdmin SA_USER=new superAdmin(cnic,name,age,email,address,phoneNumber,username,password);
		//DB CALL TO ADD SUPER ADMIN
		if(obj.addSuperAdmin(cnic, name, age, email, address, phoneNumber, username, password))
			return true;
		return false;
	}
	
	public boolean logIn(String username, String password)
	{
		//CALL TO DB TO AUTEHNTICATE THE USER AND LOG IN
		if(obj.logInSuperAdmin(username, password))
			return true;
		return false;
	}
	
	public boolean logOut()
	{
		
		return true;
	}
	
	public boolean addSystemUser(String cnic,String name,int age, String email, String address, long pNum, String username, String password)
	{
		systemUser obj = new systemUser(cnic,name,age,email,address,pNum,username,password);
		
		if(systemUsers_SA.size()<1)
		{
			systemUsers_SA.add(obj);
			systemUsers_SA.get(0).addUser(cnic,name,age,email,address,pNum,username,password);
			return true;
			
		}
		
		
		for (int i=0;i<systemUsers_SA.size();i++)
		{
			if(systemUsers_SA.get(i).getUsername().equals(username))
				return false;
			else
			{
				systemUsers_SA.get(i).addUser(cnic,name,age,email,address,pNum,username,password);
				systemUsers_SA.add(obj);
				return true;
				
			}
		}
		
		return false;
	}
	
	public boolean deleteSystemUser(String username)
	{
		//DB retrieves relevant System User against the Username provided
		
		if(SUobj.deleteUser(username))
			return true;
		return false;
		
		
	}
	
	
	
	
}
