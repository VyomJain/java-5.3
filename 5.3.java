package abstarct;

import java.util.Scanner;

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermanentEmployee permanent=new PermanentEmployee();
		TempEmployee employee=new TempEmployee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 if you are a permanent employee and 2 if you are Temporary Employee");
		int choice =scanner.nextInt();
		switch(choice){
		
		case 1: System.out.println("Enter the basic salary of the employee");
				permanent.basic=scanner.nextDouble();
				permanent.calculate_salary();
				permanent.calulate_total_leaves();
				break;
		case 2: System.out.println("Enter the basic salary of the employee");
				employee.basic=scanner.nextDouble();
				employee.calculate_salary();
				employee.calulate_total_leaves();
		
		}

	}

}

abstract class Employee {

	int empId;
	String empName;
	int total_leaves;
	double total_salary;
abstract void calulate_total_leaves();
abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
abstract void calculate_salary();
	
}

class PermanentEmployee extends Employee{

	int paid_leave=20, sick_leave=4, casual_leave=4;
	double basic, hra,pfa;
	
	void calulate_total_leaves() {
		// TODO Auto-generated method stub
		total_leaves=paid_leave+sick_leave+casual_leave;
		System.out.println("The total leave that a employee have "+total_leaves);
		}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		return false;
	}

	
	void calculate_salary() {
		// TODO Auto-generated method stub
		
		pfa=(12*basic)/100;
		hra=(50*basic)/100;
		total_salary=basic+hra-pfa;
		System.out.println("The total salary of the employee is "+total_salary);
	
		
	}
	
	void print_leave_details(){
		
	}

	
}

class TempEmployee extends Employee{
	
	int paid_leave=20, sick_leave=4, casual_leave=4;
	double basic, hra,pfa;
	
	
	

	void calulate_total_leaves() {
		// TODO Auto-generated method stub
	total_leaves=paid_leave+sick_leave+casual_leave;
	System.out.println("The total leave that a employee have "+total_leaves);
	}


	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		
				
		return false;
	}

	void calculate_salary() {
		// TODO Auto-generated method stub

		pfa=(12*basic)/100;
		hra=(50*basic)/100;
		total_salary=basic+hra-pfa;
		System.out.println("The total salary of the employee is "+total_salary);
	}
	
}