package design;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo employee1 = new EmployeeInfo("Luz Forero",25687);
		EmployeeInfo employee2 = new EmployeeInfo("Vallerie Blankinship", 25688);
		EmployeeInfo employee3 = new EmployeeInfo("Camila Nieto", 25689);

		employee1.assignDepartment("Accounting");
		employee2.assignDepartment("Production");
		employee3.assignDepartment("Shipping");

		employee1.setSalary(85000.00);
		employee1.calcSalary(employee1.getSalary());
		employee2.setSalary(60000.00);
		employee2.calcSalary(employee1.getSalary());
		employee3.setSalary(45000.00);
		employee3.calcSalary(employee1.getSalary());

		employee1.setPerformance(4);
		employee2.setPerformance(3);
		employee2.setPerformance(2);

		System.out.println(employee1.calculateEmployeeBonus(85000,4));
		System.out.println(employee2.calculateEmployeeBonus(60000,3));
		System.out.println(employee3.calculateEmployeeBonus(45000,2));

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();

		List<Object> employeeRecord25687 = new ArrayList<Object>();
		employeeRecord25687.add(employee1.employeeName());
		employeeRecord25687.add(employee1.calcSalary(employee1.getSalary()));

		List<Object> employeeRecord25688 = new ArrayList<Object>();
		employeeRecord25688.add(employee2.employeeName());
		employeeRecord25688.add(employee2.calcSalary(employee2.getSalary()));


		List<Object> employeeRecord25689 = new ArrayList<Object>();
		employeeRecord25689.add(employee3.employeeName());
		employeeRecord25689.add(employee3.calcSalary(employee3.getSalary()));


		employeeInfo.put(25687, employeeRecord25687);
		employeeInfo.put(25688, employeeRecord25688);
		employeeInfo.put(25689, employeeRecord25689);





	}

}
