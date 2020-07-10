package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile extends Student {
    public static void main(String[] args) {


        //Apply Unit Test into all the methods in this package.
        Student student = new Student();
        Assert.assertEquals(student.getFirstName(),"");
        System.out.println(student.getFirstName()+""+student.getLastName());
    }
}
