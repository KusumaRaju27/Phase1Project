package IODemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployeeDemo
{

public void EmployeeDetails() throws IOException {

	Employee emp=new Employee();
	//System.out.println(emp);
	
	FileOutputStream fileout=new FileOutputStream("employee.ser");
	ObjectOutputStream outstream= new ObjectOutputStream(fileout);
	//writing an object
	outstream.writeObject(emp);
	outstream.close();
	fileout.close();
	
	System.out.println("employee created successfully");
}
}
	

