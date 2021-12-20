package source_code;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.LinkedList;

public class MySQL extends PersHand {

	String DriverClass="com.mysql.cj.jdbc.Driver";
	String Path_DB="jdbc:mysql://localhost:3306/SRMS";
	String USERNAME_DB="root";
	String PASSWORD_DB="usmanmalik740";
	
	
	public boolean addSuperAdmin(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password)
	{
		
		try {
			
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				String sql="INSERT INTO superadmin(cnic,Name,Age,Email_Address,Address,PhoneNumber,Username,Password) VALUES(?,?,?,?,?,?,?,?)";
				PreparedStatement statement=con.prepareStatement(sql);
				statement.setString(1,cnic);
				statement.setString(2,name);
				statement.setInt(3, age);
				statement.setString(4,email);
				statement.setString(5,address);
				statement.setLong(6, phoneNumber);
				statement.setString(7,username);
				statement.setString(8,password);
				
				int rowsInserted=statement.executeUpdate();
				if(rowsInserted>0)
				{
					
					return true;
				}
		
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public boolean logInSuperAdmin (String username, String password)
	{
		
		try {
		
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select username,password from superAdmin");
				
				String userName="";
				String passWord="";
				
				while(rs.next())
				{
					userName=rs.getString(1);
					passWord=rs.getString(2);
					if(username.equals(userName) && password.equals(passWord))
					{
						return true;
					}
				}
				
				
				
				
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}	
		
		return false;
	}
	
	
	
	public boolean addSystemUser(String cnic,String name,int age, String email, String address, long phoneNumber, String username, String password)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO systemUser(cnic,Name,Age,Email_Address,Address,PhoneNumber,Username,Password) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,cnic);
			statement.setString(2,name);
			statement.setInt(3, age);
			statement.setString(4,email);
			statement.setString(5,address);
			statement.setLong(6, phoneNumber);
			statement.setString(7,username);
			statement.setString(8,password);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}
	
	
	
	public boolean deleteSystemUser(String username)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			String query="delete from systemUser where username='"+username+"'";
			int result=stmt.executeUpdate(query);
			
			
			if(result==0)
			{
					return false;
			}
			else
			{
				return true;
			}
			
				
			
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	

		return false;
	}
	
	
	public boolean logInSystemUser (String username, String password)
	{
		
		try {
		
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select username,password from systemUser");
				
				String userName="";
				String passWord="";
				
				while(rs.next())
				{
					userName=rs.getString(1);
					passWord=rs.getString(2);
					if(username.equals(userName) && password.equals(passWord))
					{
						return true;
					}
				}
				
				
				
				
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}	
		
		return false;
	}
	
	
	public boolean addStationMaster(String cnic,String name,int age, String email, String address, long phoneNumber, String username, String password)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO stationMaster(cnic,Name,Age,Email_Address,Address,PhoneNumber,Username,Password) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,cnic);
			statement.setString(2,name);
			statement.setInt(3, age);
			statement.setString(4,email);
			statement.setString(5,address);
			statement.setLong(6, phoneNumber);
			statement.setString(7,username);
			statement.setString(8,password);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}
	
	
	
	public boolean deleteStationMaster(String username)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			String query="delete from stationmaster where username='"+username+"'";
			int result=stmt.executeUpdate(query);
			
			
			if(result==0)
			{
					return false;
			}
			else
			{
				return true;
			}
			
				
			
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	

		return false;
	}
	
	
	public boolean addStation(int ID, String name, String loc, String ssmcnic,String city)
	{
		
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO station(Station_ID,Station_Name,Location,Station_Master_CNIC,City) VALUES(?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1, ID);
			statement.setString(2,name);
			statement.setString(3, loc);
			statement.setString(4,ssmcnic);
			statement.setString(5, city);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
		
		
	}
	
	
	public boolean deleteStation(int iD)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			String query="delete from station where Station_ID='"+iD+"'";
			int result=stmt.executeUpdate(query);
			
			
			if(result==0)
			{
					return false;
			}
			else
			{
				return true;
			}
			
				
			
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	

		return false;
		
	}
	
	
	public boolean logInStationMaster (String username, String password)
	{
		
		try {
		
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select username,password from stationmaster");
				
				String userName="";
				String passWord="";
				
				while(rs.next())
				{
					userName=rs.getString(1);
					passWord=rs.getString(2);
					if(username.equals(userName) && password.equals(passWord))
					{
						return true;
					}
				}
				
				
				
				
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}	
		
		return false;
	}
	
	
	public String returnsmCNIC(String username, String password)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select username,password,cnic from stationmaster");
			
			String userName="";
			String passWord="";
			String cnic="";
			while(rs.next())
			{
				userName=rs.getString(1);
				passWord=rs.getString(2);
				cnic=rs.getString(3);
				if(username.equals(userName) && password.equals(passWord))
				{
					return cnic;
				}
			}
			
			
			
			
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	
	
	return "";
	}
	
	public boolean addCustomer(String cnic, String name, int age, String email, String address, long phoneNumber, String username, String password)
	{
		
		try {
			
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				String sql="INSERT INTO customers(cnic,Name,Age,Email_Address,Address,Phone_Number,Username,Password) VALUES(?,?,?,?,?,?,?,?)";
				PreparedStatement statement=con.prepareStatement(sql);
				statement.setString(1,cnic);
				statement.setString(2,name);
				statement.setInt(3, age);
				statement.setString(4,email);
				statement.setString(5,address);
				statement.setLong(6, phoneNumber);
				statement.setString(7,username);
				statement.setString(8,password);
				
				int rowsInserted=statement.executeUpdate();
				if(rowsInserted>0)
				{
					
					return true;
				}
		
		
			}
		
		catch (ClassNotFoundException | NullPointerException | SQLException e) {
			
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean logInCustomers (String username, String password)
	{
		
		try {
		
				Class.forName(DriverClass);
				Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select username,password from customers");
				
				String userName="";
				String passWord="";
				
				while(rs.next())
				{
					userName=rs.getString(1);
					passWord=rs.getString(2);
					if(username.equals(userName) && password.equals(passWord))
					{
						return true;
					}
				}
				
				
				
				
		
			}
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}	
		
		return false;
	}
	
	public boolean addTimeTable(int ID, LocalDate dateTimeTable)
	{
		
		try {
			
			Date  dateTT =  Date.valueOf(dateTimeTable);
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO timetable(TimeTableID,DateOfTimeTable) VALUES(?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,ID);
			statement.setDate(2, dateTT);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
		
	}
	
	public boolean addTimeTabletoStationMaster(int ID, String cnic)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO stationmastertimetable(CNIC,TimeTableID) VALUES(?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,cnic);
			statement.setInt(2,ID);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	}
	
	
	public boolean addArrivals(String JID,int TNum,String TName,String orig,String dest,int status,int seats,int dur,float fare)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO arrivals(Journey_ID,TrainNumber,TrainName,Origin,Destination,Status,TotalSeats,Duration,Fare) VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,JID);
			statement.setInt(2,TNum);
			statement.setString(3, TName);
			statement.setString(4,orig);
			statement.setString(5,dest);
			statement.setInt(6,status);
			statement.setInt(7,seats);
			statement.setInt(8,dur);
			statement.setFloat(9, fare);
			
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
	}
	
	
	public boolean addArrivaltoTimeTable(int TID, String JID)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO timetablearrivals(TimeTableID,Journey_ID) VALUES(?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,TID);
			statement.setString(2,JID);
			
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
	}
	
	
	public boolean addSeatsArrivals(String JID,int SeatNum,String SeatStat)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO seatsavailabilityarrivals(Journey_ID,SeatNumber,SeatStatus) VALUES(?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,JID);
			statement.setInt(2,SeatNum);
			statement.setString(3,SeatStat);
			
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
	}
	
	
	public boolean addDepartures(String JID,int TNum,String TName,String orig,String dest,int status,int seats,int dur,float fare)
	{
		
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO departures(Journey_ID,TrainNumber,TrainName,Origin,Destination,Status,TotalSeats,Duration,Fare) VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,JID);
			statement.setInt(2,TNum);
			statement.setString(3, TName);
			statement.setString(4,orig);
			statement.setString(5,dest);
			statement.setInt(6,status);
			statement.setInt(7,seats);
			statement.setInt(8,dur);
			statement.setFloat(9, fare);
			
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
	}
	
	
	public boolean addDeparturetoTimeTable(int TID, String JID)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO timetabledepartures(TimeTableID,Journey_ID) VALUES(?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,TID);
			statement.setString(2,JID);
			
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
	}
	
	
	public boolean addSeatsDepartures(String JID,int SeatNum,String SeatStat)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO seatsavailabilitydepartures(Journey_ID,SeatNumber,SeatStatus) VALUES(?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,JID);
			statement.setInt(2,SeatNum);
			statement.setString(3,SeatStat);
			
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
			}
	
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
	
	}
	
	
	public boolean updateArrival(String JID, int status)
	{
		
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * FROM arrivals";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			
			
			while(rs.next())
			{
				String temp=rs.getString("Journey_ID");
				if (temp.compareToIgnoreCase(JID)==0)
				{
					
					rs.updateInt(6, status);
					rs.updateRow();
				}
			}
			return true;
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return false;
	}
	
	
	public boolean updateDeparture(String JID, int status)
	{
		
		
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * FROM departures";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			
			
			while(rs.next())
			{
				String temp=rs.getString("Journey_ID");
				if (temp.compareToIgnoreCase(JID)==0)
				{
					
					rs.updateInt(6, status);
					rs.updateRow();
				}
			}
			return true;
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return false;
	}
	
	public String getArrivals()
	{
		
		String s="";
		Date d=null;
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			
			
			
			String selectSql = "SELECT * FROM arrivals";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			
			
			
			
			
			s+="\n     Journey ID"+"                      "+"Train Number"+"                      "+"Train Name"+"                      "+"Origin"+"                      "+"Destination"+"                      "+"Status"+"                      "+"Total Seats"+"                      "+"Duration"+"                      "+"Fare"+"\n\n\n\n";
			
			while(rs.next())
			{
				
				
				s+="     "+rs.getString(1)+"                             "+rs.getString(2)+"                                        "+rs.getString(3)+"                            "+rs.getString(4)+"                     "+rs.getString(5)+"                             "+rs.getString(6)+"                             "+rs.getString(7)+"                                  "+rs.getString(8)+" hrs                           "+rs.getString(9)+" RS-/"+"\n\n\n";
			
			
			
			
			}
			return s;
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
		return "";
		
	}
	
	public String getDepartures()
	{
		
		String s="";
		Date d=null;
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * FROM departures";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			
			s+="\n     Journey ID"+"                      "+"Train Number"+"                      "+"Train Name"+"                      "+"Origin"+"                      "+"Destination"+"                      "+"Status"+"                      "+"Total Seats"+"                      "+"Duration"+"                      "+"Fare\n\n\n\n";
			
			while(rs.next())
			{
				s+="     "+rs.getString(1)+"                             "+rs.getString(2)+"                                        "+rs.getString(3)+"                            "+rs.getString(4)+"                     "+rs.getString(5)+"                             "+rs.getString(6)+"                             "+rs.getString(7)+"                                  "+rs.getString(8)+" hrs                           "+rs.getString(9)+" RS-/\n\n\n";
				
			
			}
			return s;
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		
		return "";
		
	}
	
	public Date getArrivalTID(String d)
	{
		Date a=null;
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			PreparedStatement pstmt=con.prepareStatement("select TimeTableID from timetablearrivals Where Journey_ID=?");
			pstmt.setString(1,d);
			ResultSet rs2=pstmt.executeQuery();
			a=getArrivalDate(rs2.getInt(1));
			System.out.print("A");
			
			return a;
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return a;
		
	}
	
	public Date getArrivalDate(int TID)
	{
		String a="";
		Date t = null;
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			PreparedStatement pstmt=con.prepareStatement("select * from timetable Where TimeTableID=?");
			pstmt.setInt(1,TID);
			ResultSet rs2=pstmt.executeQuery();
			t=rs2.getDate(2);
			System.out.print("D");
			return t;
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return t;
	}
	
	public String getStations(String city)
	{
		String a="";
		
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * FROM station where City='"+city+"'";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			a+=" NAME                                                                                         LOCATION\n\n";
			while (rs.next())
			{
				a+=rs.getString(2)+"                                                                "+rs.getString(3)+"'\n\n";
			}
			
			return a;
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return a;
	}
	
	public String getStationID(String stationName)
	{
		String a="";
		
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * from station";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			
			
			while (rs.next())
			{
				String temp=rs.getString(2);
				if(temp.equalsIgnoreCase(stationName))
				{
					a=rs.getString(1);
					return a;
				}
			}
			
			
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return a;
	}
	
	
	public LinkedList<Integer> bookTicket(String orig,String dest,int seats,String cnic)
	{
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * from arrivals";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			LinkedList<Integer>  sNo= new LinkedList<Integer>();
			
			while (rs.next())
			{
				String a="",b="";
				a=rs.getString("Origin");
				b=rs.getString("Destination");
				if(a.equalsIgnoreCase(orig) && b.equalsIgnoreCase(dest))
				{
					if(updatePassengersListArrivals(rs.getString(1),cnic))
					{
						sNo=updateseatsAvailabilityArrivals(rs.getString(1),seats);
						return sNo;
						
					}
					
				}
			}
			
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return null;
	}
	
	public LinkedList<Integer> bookTicket2(String orig,String dest,int seats,String cnic)
	{
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * from departures";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			LinkedList<Integer>  sNo= new LinkedList<Integer>();
			
			while (rs.next())
			{
				String a="",b="";
				a=rs.getString("Origin");
				b=rs.getString("Destination");
				if(a.equalsIgnoreCase(orig) && b.equalsIgnoreCase(dest))
				{
					if(updatePassengersListDepartures(rs.getString(1),cnic))
					{
						sNo=updateseatsAvailabilityDepartures(rs.getString(1),seats);
						return sNo;
						
					}
					
				}
			}
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return null;
	}
	public boolean updatePassengersListArrivals(String JID,String CNIC)
	{
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO passengersListArrivals(Journey_ID,CNIC) VALUES(?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,JID);
			statement.setString(2,CNIC);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
		
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return false;
		
	}
		
	public boolean updatePassengersListDepartures(String JID,String CNIC)
	{
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String sql="INSERT INTO passengersListDepartures(Journey_ID,CNIC) VALUES(?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,JID);
			statement.setString(2,CNIC);
			
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				
				return true;
		
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return false;
		
	}
		
	
	public LinkedList<Integer> updateseatsAvailabilityArrivals(String JID,int seats)
	{
		
		LinkedList<Integer> seatNumbers = new LinkedList<Integer>();
		
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * FROM seatsavailabilityarrivals ORDER BY 2";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			
			while(rs.next())
			{
				String temp=rs.getString(1);
				String status=rs.getString(3);
				int seatNo=rs.getInt(2);
				
				if(temp.equalsIgnoreCase(JID)&& status.equalsIgnoreCase("Available"))
				{
					if(seats>0)
					{
						String newstatus="Booked";
						rs.updateString(3,newstatus);
						rs.updateRow();
						seats--;
						seatNumbers.add(seatNo);
					}
				}
					
				
			}
			System.out.print("AAAA"+seatNumbers);
			return seatNumbers;
			
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return seatNumbers;
		
		
	}
	
	public LinkedList<Integer> updateseatsAvailabilityDepartures(String JID,int seats)
	{
		
		LinkedList<Integer> seatNumbers = new LinkedList<Integer>();
		
		try
		{
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			String selectSql = "SELECT * FROM seatsavailabilitydepartures ORDER BY 2";
			Statement statement = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = statement.executeQuery(selectSql);
			
			while(rs.next() && seats>0)
			{
				String temp=rs.getString(1);
				String status=rs.getString(3);
				int seatNo=rs.getInt(2);
				
				if(temp.equalsIgnoreCase(JID)&& status.equalsIgnoreCase("Available"))
				{
					String newstatus="Booked";
					rs.updateString(3,newstatus);
					rs.updateRow();
					seats--;
					seatNumbers.add(seatNo);
				}
					
				
			}
			return seatNumbers;
			
			
		}
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		return seatNumbers;
		
	}
	
	
	public String returnCustomerCNIC(String username, String password)
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select username,password,cnic from customers");
			
			String userName="";
			String passWord="";
			String cnic="";
			while(rs.next())
			{
				userName=rs.getString(1);
				passWord=rs.getString(2);
				cnic=rs.getString(3);
				if(username.equals(userName) && password.equals(passWord))
				{
					return cnic;
				}
			}
			
			
			
			
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	
	
	return "";
	}
	
	public String getStationMaster()
	{
		try {
			
			Class.forName(DriverClass);
			Connection con=DriverManager.getConnection(Path_DB, USERNAME_DB, PASSWORD_DB);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select cnic,name,address from stationmaster");
			String a="CNIC                                                           NAME                                                   ADDRESS\n\n";
			
			while(rs.next())
			{
				a+=rs.getString(1)+"                                     "+rs.getString(2)+"                                     "+rs.getString(3)+"\n\n";
			}
			
			return a;
			
			
	
		}
	
	catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
	e.printStackTrace();
	}	
	
	return "";
	}
	
	
	
	
}
