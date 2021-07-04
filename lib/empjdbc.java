package lib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.io.*;
import java.util.*;
class employee
{
 String name,job;
 int age,sal;
  employee()
{
	
			 Scanner s=new Scanner(System.in);
			  System.out.println("enter the employee name");
			   name=s.next();
			 System.out.println("enter the employee age");
			   age=s.nextInt();
			  
	
}
 void display()
{
	 try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/iprimed","root","0804");  
			 
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp1");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
/*.out.println("name:"+ name);
System.out.println("age :"+ age);
System.out.println("salary:"+ sal);
System.out.println(" job :"+ desgi);*/
}
 public void raisesalary()
 {
 	try{  
 		Class.forName("com.mysql.jdbc.Driver");  
 		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/iprimed","root","0804");  
 		 
 		Statement stmt=con.createStatement();  
 		ResultSet rs=stmt.executeQuery("select * from emp1");  
 		while(rs.next())
 		{
 			 String job=rs.getString(4);
 			  if(job.equals("clerk"))
 			  {
 				  int sal=rs.getInt(5);
 				  sal=sal+(sal*10/100);
 				  System.out.println("raisedsalary: "+sal);
 			  }
 			  else if(job.equals("programmer"))
 			  {
 				  int sal=rs.getInt(5);
 				  sal=sal+(sal*20/100);
 				  System.out.println("raisedsalary: "+sal);
 			  }
 			  else
 			  {
 				  int sal=rs.getInt(5);
 				  sal=sal+(sal*25/100);
 				  System.out.println("raisedsalary: "+sal);
 			  }
 		}
 		  
 		con.close();  
 		}catch(Exception e){ System.out.println(e);}  
  
 }
}
final class clerk extends employee
{
  clerk()
{
	  try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/iprimed","root","0804");  
			   
     sal=10000;
      job="clerk";
	PreparedStatement pst1=con.prepareStatement("INSERT INTO EMP1(name,age,job,salary)VALUES(?,?,?,?)");
			pst1.setString(1, name);
			pst1.setInt(2, age);
			pst1.setString(3,job);
			pst1.setInt(4, sal);
			 int i=pst1.executeUpdate();
			con.close();  
			}catch(Exception e){ System.out.println(e);}

} 

}
final class programmer extends employee
{
  programmer()
{
	  try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/iprimed","root","0804");  
			   
			sal=20000;
			   job="programmer";
	PreparedStatement pst1=con.prepareStatement("INSERT INTO EMP1(name,age,job,salary)VALUES(?,?,?,?)");
			pst1.setString(1, name);
			pst1.setInt(2, age);
			pst1.setString(3, job);
			pst1.setInt(4, sal);
			 int i=pst1.executeUpdate();
			con.close();  
			}catch(Exception e){ System.out.println(e);}

  
} 
/*public void raisesalary()
{
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/prodapt","root","system");  
	 
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from emp");  
	while(rs.next())
	{
		 String job=rs.getString(4);
		  if(job.equals("clerk"))
		  {
			  int sal=rs.getInt(5);
			  sal=sal+(sal*10/100);
			  System.out.println("raisedsalary: "+sal);
		  }
		  else if(job.equals("programmer"))
		  {
			  int sal=rs.getInt(5);
			  sal=sal+(sal*20/100);
			  System.out.println("raisedsalary: "+sal);
		  }
		  else
		  {
			  int sal=rs.getInt(5);
			  sal=sal+(sal*25/100);
			  System.out.println("raisedsalary: "+sal);
		  }
	}
	  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  

/* sal=sal+(sal*20/100);
 System.out.println("raisedsalary: "+sal);
}*/
}
final class manager extends employee
{
  manager()
{
   try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/iprimed","root","0804");  
		   
		sal=30000;
		  job="manager";
PreparedStatement pst1=con.prepareStatement("INSERT INTO EMP1(name,age,job,salary)VALUES(?,?,?,?)");
		pst1.setString(1, name);
		pst1.setInt(2, age);
		pst1.setString(3, job);
		pst1.setInt(4, sal);
		 int i=pst1.executeUpdate();
		con.close();  
		}catch(Exception e){ System.out.println(e);}
} 
/*public void raisesalary()
{
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/prodapt","root","system");  
	 
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from emp");  
	while(rs.next())
	{
		 String job=rs.getString(4);
		  if(job.equals("clerk"))
		  {
			  int sal=rs.getInt(5);
			  sal=sal+(sal*10/100);
			  System.out.println("raisedsalary: "+sal);
		  }
		  else if(job.equals("programmer"))
		  {
			  int sal=rs.getInt(5);
			  sal=sal+(sal*20/100);
			  System.out.println("raisedsalary: "+sal);
		  }
		  else
		  {
			  int sal=rs.getInt(5);
			  sal=sal+(sal*25/100);
			  System.out.println("raisedsalary: "+sal);
		  }
	}
	  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  

 /*sal=sal+(sal*25/100);
 System.out.println("raisedsalary: "+sal);
}*/
}
public class empjdbc
{
	public static void main(String[] args) throws Exception
	{
		Scanner s=new Scanner(System.in);
       employee e=null;
 int c1,c2,i=0;
do
{
  System.out.println("1.create \n2.display \n3.raisesalary \n4.exit ");
System.out.println("enter ur number");
c1=s.nextInt();
 switch(c1)
{
  case 1: do
           {
            System.out.println("1.clerk \n2.programmer \n3.Manager \n4.exit "); 
             System.out.println("enter ur number");
              c2=s.nextInt();
              switch(c2)
             {
              case 1: e=new clerk();
                       break;
              case 2: e=new programmer();
                         
                        break;
              case 3: e=new manager();
                        
                        break;
              }
              } while(c2<4);
              break;
 case 2:  try
           {
	          e.display();
             }
             catch(Exception ex) {}
 
              break;
 case 3:
             e.raisesalary();
             
             break; 
      }
      } while(c1<4);
                
	}
}