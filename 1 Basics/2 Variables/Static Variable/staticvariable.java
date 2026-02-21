import java.io.*;
public class staticvariable {
    
       // salary  variable is a private static variable
    private static double salary;

       // DEPARTMENT is a constant
    public static final String Department="Development";

    public static void main(String args[]){
        salary=1000;
        System.out.println(Department+" average salary "+salary);
    }
}