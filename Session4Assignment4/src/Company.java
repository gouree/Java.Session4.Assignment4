/*
 * In a company, there are employees with two designations Manager and
Trainee. Both the employees share same set of attributes. The basic
salary calculation logic is same, but the basic salaries of trainee and
manager are different. The Managers has a travel allowance equal to 15%
of the basic salary, where as for Trainees, the travel allowance is 10% of
the basic salary. Write a program to maintain the entities using
inheritance.

 */
public class Company
{
	
	public static void main(String args[])
	
	{
		Employee e1= new Employee(10000,"Sia","Employee"); // Employee object
		Employee e2= new Employee(10000,"Ria","Employee");  // Employee object
		Manager m1= new Manager(10000,"gouree","Manager");  // Manager object
		
		
		// calculate ta, salary for employee1 and display the result
		e1.calTaEmp();
		e1.calSal();
		e1.display();
		
		
		// calculate ta, salary for employee2 and display the result
		e2.calTaEmp();
		e2.calSal();
		e2.display();
		
		
		// calculate ta, salary for manager and display the result
		m1.calTaMan();
		m1.calSal();
		m1.display();
	}

}


//employee class
class Employee
{
	double basic, ta,total_sal;
	String name,desig;
	
	
	//constructor to set the values of basic , name and designation
	Employee(double s, String n,String flag)
	{
				basic =s;
				name=n;
				desig=flag;
	}
	
	
	//method to calculate salary
	public double calSal()
	{
		total_sal= basic+ta;
		return(total_sal);
	}
	
	
	//employee method to calculate ta
	public double calTaEmp()
	{
		ta=0.1*basic;
		return(ta);
	}
	
	//method to display result
	public void display()
	{
		System.out.println();
		System.out.println("Name --->"+name);
		System.out.print("  Designation --->"+desig);
		System.out.print ("   Base Salary--->"+basic);
		System.out.print("   TA --->"+ta);
		System.out.print("   Total salary --->"+total_sal);
	}
}


//manager class extends employee class
class Manager extends Employee
{
	//manager constructor which in turn calls employee constructor and stores the result
	public Manager(double s, String n,String flag)
	{
		super(s,n,flag);
	}
	
	//manager method to calculate ta
	
	public double calTaMan()
	{
		ta=.15*basic;
		return(ta);
	}
}