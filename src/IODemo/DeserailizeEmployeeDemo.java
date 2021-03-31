package IODemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

class details
{
	String user;
	String Password;
	
	public details(String user, String password)
	{
		
		this.user = user;
		this.Password = password;
	}
	
	public String getUser()
	{
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	void acceptdetails() {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("Enter Username");
		this.setUser(scan.nextLine());
		//this.user=scan.nextLine();
		System.out.print("Enter Password");
		this.setPassword(scan.nextLine());
		//this.password=scan.nextLine();
	}
	void display()
	{
		
		
			System.out.println("USER:"+this.getUser());
			System.out.println("Password:"+this.getPassword());
	
			int length=user.length();
			try {
				if(length < 6)
				    throw new Exception("Username must be greater than 6 characters");
				else if(!user.equals("admin") && !Password.equals("admin"))
				{
					throw new Exception("valid user1");
					//System.out.println("Valid user");
				}
				else if(!Password.equals("admin") && !user.equals("admin")) {
					throw new Exception("Invalid Credentials admin");
					//System.out.println("Invalid user");
				}
				else 
				 System.out.println("Login success");
			}
			catch(Exception ex) {
			System.out.println(ex.getMessage());
				
			}
	}
}
public class DeserailizeEmployeeDemo 
{
	public static  void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		//Employee emp=(Employee)in.readObject();
		System.out.println("--------Welcome to LockedMe.com MyPage------");
		
		details d=new details("user","password");
		
		d.acceptdetails();
		d.display();
		
	Scanner scan = new Scanner(System.in);
//		System.out.println("Select  Options\n option: 1: Employee Details\n Option 2:Remove "
//				+ "Employee Details\n Option3: Exit the application");
//		scan.nextLine();
	outerloop:
	while(true) 
	{
		System.out.println("Option 1: Enter Employee Details");
		System.out.println("Option 2: Display Employee Details");
		System.out.println("Option 3: Remove Employee Details");
		System.out.println("Option 4: Exit");
		System.out.println("Enter 1 or 2 or 3 or 4");
		
		int option=3;
		option=scan.nextInt();
		
		switch(option) {
		case 1: SerializeEmployeeDemo sd=new SerializeEmployeeDemo();
		sd.EmployeeDetails();continue;
		case 2:
			
			FileInputStream filein=new FileInputStream("employee.ser");
			ObjectInputStream in= new ObjectInputStream(filein);
			
			Employee emp=(Employee)in.readObject();
			System.out.println("Selected option is"+option);
		System.out.println(emp);
		//System.out.println("Employee object has been deserialized");
		in.close();
		filein.close(); continue;
		case 3:System.out.println("in progress"); continue;
		case 4: System.out.println("Exiting the application");break outerloop;
	
	}
		
	}
	}
}


