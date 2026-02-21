// Step 1: Import Scanner
import java.util.Scanner;

public class input{

    public static void main(String[] args){

            // Step 2: Create Scanner object
        Scanner scanner=new Scanner(System.in);

        System.out.print("Eneter your age: ");
        // Step 3: Take input
        int age=scanner.nextInt();


        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter your name:");
        String name=scanner.nextLine();

        System.out.print("Enter your gpa:");
        float gpa=scanner.nextFloat();


        System.out.println("Are you a student: ");
        boolean check=scanner.nextBoolean();


        scanner.close();


        System.out.println("Your name is : "+name);
        System.out.println("your age is: "+age);
        System.out.println("Your gpa is : "+gpa);
        System.out.println("Are you a student: "+check);



    }
}