package design;

import json.parser.JsonReaderUtil;
import org.w3c.dom.ls.LSOutput;

public abstract class EmployeeAbsClass implements Employee {

    public abstract void vacation();

    public int employeeId() {
        System.out.println("Employee Id");

        return employeeId();
    }

    public String employeeName() {
        System.out.println("Employee Name");
        return employeeName();
    }

    public void assignDepartment() {
        System.out.println("Employee Department");

    }
    public int calSalary(){
        System.out.println("CalSalary");
        return calSalary();

    }

    public void benefitLayout(){
        System.out.println("benefitLayout");
    }

}
