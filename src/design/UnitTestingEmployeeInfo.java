package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo employee1 = new EmployeeInfo("Luz Forero", 25687);
        employee1.setSalary(85000.00);
        employee1.setPerformance(4);
        Assert.assertEquals(85000.00, employee1.getSalary());
        Assert.assertEquals(4,employee1.getPerformance());
        Assert.assertEquals(25687,employee1.getEmployeeId());


    }
}
