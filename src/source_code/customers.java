package source_code;

public class customers {

	private String CNIC_CUS;
	private String name_CUS;
	private int age_CUS;
	private String email_CUS;
	private String address_CUS;
	private long phoneNumber_CUS;
	private String username_CUS;
	private String password_CUS;
	Storage obj = new Storage();
	public customers()
	{
		this.CNIC_CUS="";
		this.name_CUS="";
		this.age_CUS=18;
		this.email_CUS="";
		this.address_CUS="";
		this.phoneNumber_CUS=0;
		this.username_CUS="";
		this.password_CUS="";
	}
	
	customers(String CNIC, String name, int age, String email, String address, long pNum, String username, String password)
	{
		this.CNIC_CUS=CNIC;
		this.name_CUS=name;
		this.age_CUS=age;
		this.email_CUS=email;
		this.address_CUS=address;
		this.phoneNumber_CUS=pNum;
		this.username_CUS=username;
		this.password_CUS=password;
	}
	
	
	//	SETTERS
	
	
	public void setCNIC(String cnic)
	{
		this.CNIC_CUS=cnic;
	}
	
	public void setName(String name)
	{
		this.name_CUS=name;
	}
	
	public void setAge(int age)
	{
		this.age_CUS=age;
	}
	
	public void setEmail(String email)
	{
		this.email_CUS=email;
	}
	
	public void setAddress(String address)
	{
		this.address_CUS=address;
	}
	
	public void setPhonenumber(long pNum)
	{
		this.phoneNumber_CUS=pNum;
	}
	
	
	
	
	//	GETTERS
	
	
	public String getCNIC()
	{
		return this.CNIC_CUS;
	}
	
	public String getName()
	{
		return this.name_CUS;
	}
	
	public int getAge()
	{
		return this.age_CUS;
	}
	
	public String getEmail()
	{
		return this.email_CUS;
	}
	
	public String getAddress()
	{
		return this.address_CUS;
	}
	
	public long phoneNumber()
	{
		return this.phoneNumber_CUS;
	}
	
	public String getUsername()
	{
		return this.username_CUS;
	}
	
	public String getPassword()
	{
		return this.password_CUS;
	}
	
	public boolean createAccount(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password)
	{
		//DB CALL TO ADD CUSTOMER
		if(obj.addCustomer(cnic, name, age, email, address, phoneNumber, username, password))
			return true;
		return false;
	}
	
	public boolean logIn(String username, String password)
	{
		//CALL TO DB TO AUTEHNTICATE THE USER AND LOG IN
		if(obj.logInCustomers(username, password))
			return true;
		return false;
	}
	
	public boolean logOut()
	{
		//CALL TO DB TO LOG OUT
		return true;
	}
	
	public boolean bookTicket(String origin, String destination, int noOfSeats, customers C)
	{
		return true;
	}
	
	public void viewInfo()
	{
		//DISPLAY INFO FROM DB
	}
	
}
