import java.io.*;

public class instancevariable {

    // this instance variable is visible for any child class.
    public String name;

    // salary  variable is visible in Employee class only.
    private double salary;


    // The name variable is assigned in the constructor.
    public instancevariable(String empname){
        name=empname;
    }


    // The salary variable is assigned a value.
    public void setsalary(double empsal){
        salary=empsal;
    }

    // This method prints the employee details.
    public void printemp(){
        System.out.println("Name : " + name);
        System.out.println("salary: "+salary);
    }

    public static void main(String args[]){
        instancevariable empone=new instancevariable("Ranshika");
        empone.setsalary(1000);
        empone.printemp();
    }
}
