package application;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.sql.Date;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import source_code.SmartRailwayManagementSystem;

public class UI_Call_Handler {
	
	
	SmartRailwayManagementSystem alphaobj = new SmartRailwayManagementSystem();
	
	@FXML
	private TextField SAusername;
	
	@FXML
	private TextField SApassword;
	
	@FXML
	private TextField sucnic;
	
	@FXML
	private TextField suname;
	
	@FXML
	private TextField suage;
	
	@FXML
	private TextField suemail;
	
	@FXML
	private TextField suaddress;
	
	@FXML
	private TextField suphone;
	
	@FXML
	private TextField suusername;
	
	@FXML
	private TextField supassword;
	
	
	@FXML
	private TextField sudelusername;
	
	
	@FXML
	private TextField sID;
	
	@FXML
	private TextField sname;
	
	@FXML
	private TextField sloc;
	
	@FXML
	private TextField ssmcnic;
	
	@FXML
	private DatePicker date;
	
	@FXML
	private TextField timetableID;
	
	private static String smCnic;
	
	
	@FXML
	private TextField journeyID;
	
	@FXML
	private TextField trainNumber;
	
	@FXML
	private TextField trainName;
	
	@FXML
	private TextField origin;
	
	@FXML
	private TextField destination;
	
	@FXML
	private TextField status;
	
	@FXML
	private TextField seats;
	
	@FXML
	private TextField duration;
	
	@FXML
	private TextField fare;
	
	@FXML
	private TextField numberOfSeats;
	
	
	@FXML
	private TextField sscity;
	
	@FXML
	private  static String orig;
	
	@FXML
	private static String dest;
	
	@FXML 
	private static String cusUserName;
	
	@FXML
	private static String cusPassword;
	
	@FXML
	public void superAdminHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdmin_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("SUPER ADMIN");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@FXML
	public void systemUserHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("systemUser_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("SYSTEM USER");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void stationMasterHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMaster_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("STATION MASTER");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void customersHomePage(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customer_LogIn_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CUSTOMERS");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void ExitHomePage(ActionEvent Event)
	{
		System.exit(0);
	}
	
	
	
	@FXML
	public void superAdminLogIn(ActionEvent Event)
	{
		
		try
		{
			String username=SAusername.getText();
			String password=SApassword.getText();
			
			if(alphaobj.superAdminLogIn(username,password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminMenu_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Logged In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("unsuccessfullogin_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Cannot Log In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	@FXML
	public void superAdminSignUp(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSignUp_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CREATE AN ACCOUNT");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@FXML
	public void superAdminAddSysUser(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdd_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CREATE A SYSTEM USER ACCOUNT");
			stage.setScene(new Scene(root_one));
			stage.show();
			//
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminDelSysUser(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserDel_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DELETE A SYSTEM USER");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminLogOut(ActionEvent Event)
	{
		System.exit(0);
	}
	
	
	@FXML
	public void superAdminAddedSystemUser(ActionEvent Event)
	{
		
		String cnic,name,email,address,username,password,ageString,pNumString;
		int age=0;
		long pNum;
		
		cnic=sucnic.getText();
		name=suname.getText();
		ageString=suage.getText();
		age=Integer.parseInt(ageString);
		email=suemail.getText();
		address=suaddress.getText();
		pNumString=suphone.getText();
		pNum=Long.parseLong(pNumString);
		username=suusername.getText();
		password=supassword.getText();
		
		
		
		try
		{
			
			if(alphaobj.superAdminAddSystemUser(cnic, name, age, email, address, pNum, username, password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Not Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminDeletedSystemUser(ActionEvent Event)
	{
		
		String username;
		username=sudelusername.getText();
		
		
		try
		{
			
			if(alphaobj.superAdminDeleteSystemUser(username))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Deleted");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Not Deletedffff");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void superAdminCreateAccount(ActionEvent Event)
	{
		
		String cnic,name,email,address,username,password,ageString,pNumString;
		int age=0;
		long pNum;
		
		cnic=sucnic.getText();
		name=suname.getText();
		ageString=suage.getText();
		age=Integer.parseInt(ageString);
		email=suemail.getText();
		address=suaddress.getText();
		pNumString=suphone.getText();
		pNum=Long.parseLong(pNumString);
		username=suusername.getText();
		password=supassword.getText();
		
		
		
		try
		{
			
			if(alphaobj.superAdminCreateAccount(cnic, name, age, email, address, pNum, username, password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminCreated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Super Admin Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminNotCreated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Super Admin Not Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void systemUserLogIn(ActionEvent Event)
	{
		
		try
		{
			String username=SAusername.getText();
			String password=SApassword.getText();
			
			if(alphaobj.systmerUserLogIn(username,password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("systemUserMenu_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Logged In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("unsuccessfullogin_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Cannot Log In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	@FXML
	public void systemUserAddStationMaster(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("systemUserAddStationMaster_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CREATE A STATION MASTER ACCOUNT");
			stage.setScene(new Scene(root_one));
			stage.show();
			//
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void systemUserDelStationMaster(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("systemUserDelStationMaster_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DELETE A STATION MASTER");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void systemUserAddStation(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("systemUserAddStation_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("ADD A STATION");
			stage.setScene(new Scene(root_one));
			stage.show();
			//
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void systemUserDelStation(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("systemUserDelStation_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("DELETE A STATION");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@FXML
	public void systemUserLogOut(ActionEvent Event)
	{
		System.exit(0);
	}
	
	
	@FXML
	public void systemUserAddedStationMaster(ActionEvent Event)
	{
		
		String cnic,name,email,address,username,password,ageString,pNumString;
		int age=0;
		long pNum;
		
		cnic=sucnic.getText();
		name=suname.getText();
		ageString=suage.getText();
		age=Integer.parseInt(ageString);
		email=suemail.getText();
		address=suaddress.getText();
		pNumString=suphone.getText();
		pNum=Long.parseLong(pNumString);
		username=suusername.getText();
		password=supassword.getText();
		
		
		
		try
		{
			
			if(alphaobj.systemUserAddStationMaster(cnic, name, age, email, address, pNum, username, password))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("System User Not Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void systemUserDeletedStationMaster(ActionEvent Event)
	{
		
		String username;
		username=sudelusername.getText();
		
		
		try
		{
			
			if(alphaobj.systemUserDeleteStationMaster(username))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Station Master Deleted");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Station Master Not Deleted");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void systemUserAddedStation(ActionEvent Event)
	{
		String sId,name,loc,cnic,city;
		int sid=0;
		
		sId=sID.getText();
		sid=Integer.parseInt(sId);
		name=sname.getText();
		loc=sloc.getText();
		cnic=ssmcnic.getText();
		city=sscity.getText();
		
		
		try
		{
			
			if(alphaobj.systemUserAddStation(sid, name, loc, cnic,city))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Station Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Station Not Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void systemUserDeletedStation(ActionEvent Event)
	{
		String sId;
		int sid=0;
		
		sId=sID.getText();
		sid=Integer.parseInt(sId);
		
		
		try
		{
			
			if(alphaobj.systemUserDelStation(sid))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Station Deleted");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotDeleted_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Station Not Deleted");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void stationMasterLogIn(ActionEvent Event)
	{
		
		try
		{
			String username=SAusername.getText();
			String password=SApassword.getText();
			
			if(alphaobj.stationMasterLogIn(username, password))
			{
				smCnic=alphaobj.getStationMasterCNIC(username, password);
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMasterMenu_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Logged In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("unsuccessfullogin_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Cannot Log In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	@FXML
	public void customerLogIn(ActionEvent Event)
	{
		
		try
		{
			String username=SAusername.getText();
			String password=SApassword.getText();
			
			if(alphaobj.customersLogIn(username, password))
			{
				cusUserName=username;
				cusPassword=password;
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customers_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Logged In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("unsuccessfullogin_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Cannot Log In");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	@FXML
	public void customersSignUp(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customerSignUp_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("CREATE AN ACCOUNT");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void customersCreateAccount(ActionEvent Event)
	{
		
		String cnic,name,email,address,username,password,ageString,pNumString;
		int age=0;
		long pNum;
		
		cnic=sucnic.getText();
		name=suname.getText();
		ageString=suage.getText();
		age=Integer.parseInt(ageString);
		email=suemail.getText();
		address=suaddress.getText();
		pNumString=suphone.getText();
		pNum=Long.parseLong(pNumString);
		username=suusername.getText();
		password=supassword.getText();
		
		
		try
		{
			
			if(alphaobj.addCustomer(cnic, name, age, email, address, pNum, username, password))
			{
				
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminCreated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Customer Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminNotCreated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("Customer Not Added");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	@FXML
	public void stationMasterAddTimeTable(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMasterAddTimeTable_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("ADD A TIME TABLE");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	


	@FXML
	public void stationMasterAddingTimeTable(ActionEvent Event)
	{
		String TID=timetableID.getText();
		int timetableID=Integer.parseInt(TID);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		LocalDate dateTT = date.getValue();
		
		
		try
		{
			if(alphaobj.addTimeTable(timetableID, dateTT))
			{
				if(alphaobj.addTimeTabletoStationMaster(timetableID,smCnic))
				{
					FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdded_UI.fxml"));
					Parent root_one = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setTitle("TIME TABLE ADDED");
					stage.setScene(new Scene(root_one));
					stage.show();
				}
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("TIME TABLE NOT ADDED");
				stage.setScene(new Scene(root_one));
				stage.show();
				
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void stationMasterAddArrivals(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMasterAddArrivals_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("ADD AN ARRIVAL IN THE TIME TABLE");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void stationMasterAddingArrivals(ActionEvent Event)
	{
		
		String TID,JID,TNum,TName,orig,dest,stat,totalseats,dur,fa;
		int TimeTableID,TrainNumber,statusofArrival,TotalSeats,Duration;
		float Fare;
		
		TID=timetableID.getText();
		TimeTableID=Integer.parseInt(TID);
		JID=journeyID.getText();
		TNum=trainNumber.getText();
		TrainNumber=Integer.parseInt(TNum);
		TName=trainName.getText();
		orig=origin.getText();
		dest=destination.getText();
		stat=status.getText();
		statusofArrival=Integer.parseInt(stat);
		dur=duration.getText();
		Duration=Integer.parseInt(dur);
		totalseats=seats.getText();
		TotalSeats=Integer.parseInt(totalseats);
		fa=fare.getText();
		Fare=Float.parseFloat(fa);
		
		try
		{
			if(alphaobj.addArrival(TimeTableID, JID, TrainNumber, TName, orig, dest, statusofArrival, TotalSeats, Duration, Fare))
			{
			
					if(alphaobj.addArrivaltoTimeTable(TimeTableID,JID))
					{
						for (int i=0;i<TotalSeats;i++)
						{
							alphaobj.addSeatsArrivals(JID, i+1, "Available");
						}
						FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdded_UI.fxml"));
						Parent root_one = (Parent) fxmlLoader.load();
						Stage stage = new Stage();
						stage.setTitle("ARRIVAL ADDED");
						stage.setScene(new Scene(root_one));
						stage.show();
					}
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("ARRIVAL NOT ADDED");
				stage.setScene(new Scene(root_one));
				stage.show();
				
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void stationMasterAddDepartures(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMasterAddDepartures_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("ADD A DEPARTURE IN THE TIME TABLE");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void stationMasterAddingDepartures(ActionEvent Event)
	{
		
		String TID,JID,TNum,TName,orig,dest,stat,totalseats,dur,fa;
		int TimeTableID,TrainNumber,statusofArrival,TotalSeats,Duration;
		float Fare;
		
		TID=timetableID.getText();
		TimeTableID=Integer.parseInt(TID);
		JID=journeyID.getText();
		TNum=trainNumber.getText();
		TrainNumber=Integer.parseInt(TNum);
		TName=trainName.getText();
		orig=origin.getText();
		dest=destination.getText();
		stat=status.getText();
		statusofArrival=Integer.parseInt(stat);
		dur=duration.getText();
		Duration=Integer.parseInt(dur);
		totalseats=seats.getText();
		TotalSeats=Integer.parseInt(totalseats);
		fa=fare.getText();
		Fare=Float.parseFloat(fa);
		
		try
		{
			if(alphaobj.addDeparture(TimeTableID, JID, TrainNumber, TName, orig, dest, statusofArrival, TotalSeats, Duration, Fare))
			{
			
					if(alphaobj.addDeparturetoTimeTable(TimeTableID,JID))
					{
						for (int i=0;i<TotalSeats;i++)
						{
							alphaobj.addSeatsDepartures(JID, i+1,"Available");
						}
						FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserAdded_UI.fxml"));
						Parent root_one = (Parent) fxmlLoader.load();
						Stage stage = new Stage();
						stage.setTitle("DEPARTURE ADDED");
						stage.setScene(new Scene(root_one));
						stage.show();
					}
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("superAdminSystemUserNotAdded_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("DEPARTURE NOT ADDED");
				stage.setScene(new Scene(root_one));
				stage.show();
				
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void stationMasterUpdateArrivals(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMasterUpdateArrivals_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("UPDATE ARRIVAL");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void stationMasterUpdatingArrivals(ActionEvent Event)
	{
		String TID=timetableID.getText();
		String JID=journeyID.getText();
		String stat=status.getText();
		int Status = Integer.parseInt(stat);
		int TimeTableID=Integer.parseInt(TID);
		
		try
		{
			if(alphaobj.updateArrival(TimeTableID, JID, Status))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("ArrivalsUpdated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("ARRIVAL UPDATED");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("ArrivalsNotUpdated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("ARRIVAL NOT UPDATED");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void stationMasterUpdateDepartures(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("stationMasterUpdateDeparture_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("UPDATE DEPARTURE");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void stationMasterUpdatingDepartures(ActionEvent Event)
	{
		String TID=timetableID.getText();
		String JID=journeyID.getText();
		String stat=status.getText();
		int Status = Integer.parseInt(stat);
		int TimeTableID=Integer.parseInt(TID);
		
		try
		{
			if(alphaobj.updateDeparture(TimeTableID, JID, Status))
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("ArrivalsUpdated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("DEPARTURE UPDATED");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("ArrivalsNotUpdated_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("DEPARTURE NOT UPDATED");
				stage.setScene(new Scene(root_one));
				stage.show();
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void customerViewTimeTable(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customersViewTimeTable_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("VIEW TIME TABLE");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void customerViewArrivals(ActionEvent Event)
	{
		try
		{
			String s=alphaobj.getArrivals();
			Text text= new Text();
			text.setX(50); 
		    text.setY(50); 
		    text.setScaleX(1);
		    text.setScaleY(1);
		    Group root = new Group(text);   
			text.setText(s);
			text.setFont(Font.font("Lato", FontPosture.ITALIC, 15));
			Stage stage = new Stage();
			stage.setTitle("Arrivals");
			stage.setScene(new Scene(root,800,800));
			stage.show();
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void customerViewDepartures(ActionEvent Event)
	{
		try
		{
			String s=alphaobj.getDepartures();
			String d="";
			Text text= new Text();
			text.setX(50); 
		    text.setY(50); 
		    text.setScaleX(1);
		    text.setScaleY(1);
		    Group root = new Group(text);   
			text.setText(s);
			text.setFont(Font.font("Lato", FontPosture.ITALIC, 15));
			Stage stage = new Stage();
			stage.setTitle("Departures");
			stage.setScene(new Scene(root,800,800));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void customerBookTicket(ActionEvent Event)
	{
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customersBookingDetails_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("BOOK TICKET");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void customerBookTicket2(ActionEvent Event)
	{
		orig=origin.getText();
		dest=destination.getText();
		
		try
		{
			FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customersBookingDetails2_UI.fxml"));
			Parent root_one = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("BOOK TICKET");
			stage.setScene(new Scene(root_one));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void customerTicketBooked(ActionEvent Event)
	{
		LinkedList<Integer> seatNoBooked= new LinkedList<Integer>();
		String Station = sloc.getText();
		String SID=alphaobj.getStationID(Station);
		int sid=Integer.parseInt(SID);
		String Seats = numberOfSeats.getText();
		int seats = Integer.parseInt(Seats);
		String cnic=alphaobj.getCustomersCNIC(cusUserName,cusPassword);
		seatNoBooked=alphaobj.bookTicket(orig, dest, seats, cnic);
		try
		{
			
			if(seatNoBooked==null)
			{
				seatNoBooked=alphaobj.bookTicket2(orig, dest, seats, cnic);
				if(seatNoBooked!=null)
				{
					FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customersTicketBooked_UI.fxml"));
					Parent root_one = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setTitle("TICKET BOOKED");
					stage.setScene(new Scene(root_one));
					stage.show();
				}
				else
				{
					FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customersTicketNotBooked_UI.fxml"));
					Parent root_one = (Parent) fxmlLoader.load();
					Stage stage = new Stage();
					stage.setTitle("TICKET NOT BOOKED");
					stage.setScene(new Scene(root_one));
					stage.show();
				}
			}
			
			else
			{
				FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("customersTicketBooked_UI.fxml"));
				Parent root_one = (Parent) fxmlLoader.load();
				Stage stage = new Stage();
				stage.setTitle("TICKET BOOKED");
				stage.setScene(new Scene(root_one));
				stage.show();
		
			}
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void customerViewStations(ActionEvent Event)
	{
		try
		{
			String s=alphaobj.getStations(orig);
			Text text= new Text();
			text.setX(50); 
		    text.setY(50); 
		    text.setScaleX(1);
		    text.setScaleY(1);
		    Group root = new Group(text);   
			text.setText(s);
			text.setFont(Font.font("Lato", FontPosture.ITALIC, 15));
			Stage stage = new Stage();
			stage.setTitle("Stations Near You");
			stage.setScene(new Scene(root,800,800));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void viewStationMasters(ActionEvent Event)
	{
		try
		{
			String s=alphaobj.getStationMasters();
			Text text= new Text();
			text.setX(50); 
		    text.setY(50); 
		    text.setScaleX(1);
		    text.setScaleY(1);
		    Group root = new Group(text);   
			text.setText(s);
			text.setFont(Font.font("Lato", FontPosture.ITALIC, 15));
			Stage stage = new Stage();
			stage.setTitle("Station Masters");
			stage.setScene(new Scene(root,800,800));
			stage.show();
			
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
