import java.util.*;

class course{
    course(){
        System.out.println("Parent class constructor called");
    }

    int add(int num1,int num2){
        return num1+num2;
    }

    double add(double num1,double num2){
        return num1+num2;
    }
    
        int add(int... arr){

        int sum=0;

        for(int x:arr){

            sum+=x;
        }

        return sum;
    }


}

class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();

        course s=new course();
        int i_sum=s.add(a,b);
        double f_sum=s.add(c,d);
        
        System.out.println(i_sum);
        System.out.println(f_sum);
    }
}