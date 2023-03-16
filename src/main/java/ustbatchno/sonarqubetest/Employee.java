package ustbatchno.sonarqubetest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {

		Employeeee e1 = new Employeeee("Finla", 23, 1, 23000);
		Employeeee e2 = new Employeeee("Sasi", 22, 7, 27000);
		Employeeee e3 = new Employeeee("Deera", 30, 6, 35000);
		Employeeee e4 = new Employeeee("Geethu", 45, 10, 50000);
		Employeeee e5 = new Employeeee("Akshay", 29, 12, 700000);
		List<Employeeee> list = Arrays.asList(e1, e2, e3, e4, e5);
		
		for(Employeeee k:list){
			if ((k.getYears() >= 1) && (k.getYears() <= 3))
				k.setSalary(k.getSalary() + (0.25) * k.getSalary());
			else if (k.getYears() >= 3 && (k.getYears() <= 6))
				k.setSalary(k.getSalary() + (0.05) * k.getSalary());
			else if (k.getYears() >= 6 && (k.getYears() <= 10))
				k.setSalary(k.getSalary() + (0.10) * k.getSalary());
			else if (k.getYears() >= 10)
				k.setSalary(k.getSalary() + (0.10) * k.getSalary());
		}
		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		 
	     myout.println(list);
	    
		
		 myout.close();
	}

}
