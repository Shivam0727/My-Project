package ARS;

import java.sql.*;
import java.util.Scanner;
public class Start 
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("");
		System.out.println("************************** Welcome To Airline Reservation System *****************************************");
		System.out.println("");
		
		 // For Table-1
		System.out.println("--> Enter Registration Details : ");
		System.out.println("");
		
		System.out.println("First Name :");
		String fname=sc.next();
		
		System.out.println("Last Name :");
		String lname=sc.next();
		
		System.out.println("Email :");
		String Email = sc.next();

		System.out.println("Phone_no :");
		long Phone_no = sc.nextLong();

		System.out.println("DOB :");
		String DOB = sc.next();
		
		
	
		
		// For Table-2
		System.out.println("--> Enter Flight Details : ");
		System.out.println("");
		
		System.out.println("Flight Name :");
		String Flight_Name=sc.next();
		
		System.out.println("Flight Start From :");
		String Start_From=sc.next();
		
		System.out.println("Flight End to :");
		String End_To=sc.next();
		
		System.out.println("Flight Capacity :");
		int Flight_Capacity=sc.nextInt();
		
		System.out.println("Flight Date :");
		String Flight_Date=sc.next();
		
		System.out.println("Flight Timing :");
		String Flight_Timing=sc.next();
		
		System.out.println("Flight Price:");
		String Price = sc.next();
		
		
		
		// For Table-3
		System.out.println("--> Enter Reservation Details : ");
		System.out.println("");
		
		System.out.println("Reservation Id :");
		String Reservation_Id=sc.next();
		
		System.out.println("Reservation Type :");
		String Class_Type=sc.next();
		
		System.out.println("Reservation Date :");
		String Reservation_Date=sc.next();
		
		
		
		// for Table-4
		System.out.println("--> Enter Booking Details : ");
		System.out.println("");
		
		
		System.out.println("Ticket Booking Id :");
		String Ticket_Booking_Id=sc.next();
		
		System.out.println("Ticket Booking Date :");
		String Ticket_Booking_Date=sc.next();
		
		System.out.println("Seat No :");
		String Seat_No =sc.next();
		
		System.out.println("Offer Applicable on Ticket :");
		String Offer =sc.next();
		
		System.out.println("Payment Mode  :");
		String Payment_Mode=sc.next();
		
		
		// for Table-5
		System.out.println("--> Enter Transactions Details : ");
		System.out.println("");
		
		System.out.println("Transaction Id :");
		String Transaction_Id=sc.next();
		
		System.out.println("Transaction Date :");
		String Transaction_Date=sc.next();
		
		System.out.println("Transaction Time :");
		String Transaction_Time=sc.next();
		
		System.out.println("UTR-NO :");
		String UTR_NO=sc.next();
		
		System.out.println("Transaction Mode :");
		String Transaction_Mode=sc.next();
		
		System.out.println("Amount Paid :");
		String Amount_Paid =sc.next();
		
		System.out.println("-------------------------------Thankyou Soo Much Your Database is Updated --------------------------------------");
		
		
		try {
			// Loading Driver and Creating Connections ...
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ARS", "root","Shivam@07122000");
			System.out.println("Database connected Successfully!!");
			Statement st = con.createStatement();
			
			
			// 1st : Table-1 for Signup Process ...
			
			st.execute("create table Signup_Process(  fname varchar(15)  , lname varchar(15) , Email varchar(50) , Phone_no varchar(50) , DOB varchar(50))");
			System.out.println("Table-1 Created ...");
			PreparedStatement ps=con.prepareStatement("insert into Signup_Process(fname,lname ,email , Phone_no , DOB) values(?,?,?,?,?)");
		
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, Email);
			ps.setLong(4, Phone_no);
			ps.setString(5, DOB);
			ps.executeUpdate();
			System.out.println("Inserted in Table-1 Successfully...");
			
			
			
			// 2nd : Table-2 for Flights
			st.execute("create table Flights(Flight_Name varchar(50) , Start_From varchar(50) , End_To varchar(50) , Flight_Capacity int(10) ,Flight_Date varchar(50) , Flight_Timing varchar(40) , Price varchar(15))");
			System.out.println("Table-2 Created ...");
			PreparedStatement ps1=con.prepareStatement("insert into Flights (Flight_Name  , Start_From  , End_To , Flight_Capacity  , Flight_Date , Flight_Timing , Price ) values (?,?,?,?,?,?,? )");
			ps1.setString(1, Flight_Name);
			ps1.setString(2, Start_From);
			ps1.setString(3, End_To);
			ps1.setInt(4, Flight_Capacity);
			ps1.setString(5, Flight_Date);
			ps1.setString(6, Flight_Timing);
			ps1.setString(7, Price);
			ps1.executeUpdate();
			System.out.println("Inserted in Table-2 Successfully...");
			
			
			
			// 3rd : Table-3 for Reservation 
			st.execute("create table Reservation(Reservation_Id varchar(50) , Class_Type varchar(50) , Reservation_Date varchar(30)) ");
			System.out.println("Table-3 Created ...");
			PreparedStatement ps2=con.prepareStatement("insert into Reservation(Reservation_Id  , Class_Type  , Reservation_Date ) values (?,?,?)");
			ps2.setString(1, Reservation_Id);
			ps2.setString(2, Class_Type);
			ps2.setString(3, Reservation_Date);
			ps2.executeUpdate();
			System.out.println("Inserted in Table-3 Successfully...");
			
			
			
			
			// 4th : Table-4 for Booking ticket
			st.execute("create table Ticket_Booking(Ticket_booking_Id varchar(50) , Ticket_Booking_Date varchar(50) , Seat_No varchar(15) ,Offer varchar(50) , Payment_Mode varchar(30)) ");
			System.out.println("Table-4 Created ...");
			PreparedStatement ps3=con.prepareStatement("insert into TIcket_Booking (Ticket_booking_Id , Ticket_Booking_Date , Seat_No ,Offer , Payment_Mode ) values (?,?,?,?,?)");
			ps3.setString(1 , Ticket_Booking_Id);
			ps3.setString(2, Ticket_Booking_Date);
			ps3.setString(3, Seat_No);
			ps3.setString(4, Offer);
			ps3.setString(5, Payment_Mode);
			ps3.executeUpdate();
			System.out.println("Inserted in Table-4 Successfully...");
			
		
			// 5th : Table-5 for Transactions
			st.execute("create table Transaction(Transaction_Id varchar(50) , Transaction_Date varchar(50) , Transaction_Time varchar(15) ,UTR_NO varchar(50) , Transacction_Mode varchar(30) , Amount_Paid int(10)) ");
			System.out.println("Table-5 Created ...");
			PreparedStatement ps4=con.prepareStatement("insert into transaction(Transaction_Id  , Transaction_Date  , Transaction_Time  ,UTR_NO , Transaction_Mode  , Amount_Paid ) values (?,?,?,?,?,?)");
			ps4.setString(1, Transaction_Id);
			ps4.setString(2, Transaction_Date);
			ps4.setString(3, Transaction_Time);
			ps4.setString(4, UTR_NO);
			ps4.setString(5, Transaction_Mode);
			ps4.setString(6, Amount_Paid);
			ps4.executeUpdate();
			System.out.println("Inserted in Table-5 Successfully...");
			
			
			}
		catch (ClassNotFoundException e) 
			{	
				e.printStackTrace();
			}
		catch (SQLException e) 
			{	
				e.printStackTrace();
			}
		}

}