package design;

import java.util.Scanner;

public class EmployeeInfo {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private String departmentName;
	private String employeeName;
	private int employeeId;
	private int performance;
	private static double salary;

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	public void describeCompany(String description) {
		System.out.println(description);
	}
	public void assignDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName){
		this.departmentName = departmentName;
	}
	public String getEmployeeName(){
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		EmployeeInfo.salary = salary;
	}
	public double calcSalary(double salary) {
		double YearlySalary = salary * 12;
		return YearlySalary;
	}
	public EmployeeInfo(String name, int employeeId){
			this.employeeId=employeeId;
			employeeName = name;
	}




	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
			int total=0;


		public double calculateEmployeeBonus(double salary, int performance) {

			double yearlyBonus = 0;
			if (performance == 5) {
				yearlyBonus = salary * 0.1 * 12;
			} else if (performance == 4) {
				yearlyBonus = salary * 0.08 * 12;
			} else if (performance == 3) {
				yearlyBonus = salary * 0.06 * 12;
			} else if (performance == 2) {
				yearlyBonus = 0;
				System.out.println("Poor performance need to improve.");
			} else {
				yearlyBonus = 0;
				System.out.println("You are fired.");
			}
			System.out.println("Total Bonus: " + yearlyBonus);
			return yearlyBonus;


	}


	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(int salary){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
		//Calculate pension
		String priorYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 2, convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() -2, convertedTodaysDate.length());
        int start = Integer.parseInt(priorYear);
        int current = Integer.parseInt(currentYear);

        int numberOfYears = current - start;
        if (numberOfYears >= 3 ){
        	total = (int)(EmployeeInfo.salary * 0.15);
        }else if (numberOfYears == 2){
        	total = (int) (EmployeeInfo.salary * 0.10);
        }else if (numberOfYears == 1) {
			total = (int) (EmployeeInfo.salary * 0.05);
		}else if(numberOfYears == 0) {
        	total=0;

		}
		System.out.println("Pension Amount: $"+ total);

		return total;

	}

	public String employeeName() {
		return null;
	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
