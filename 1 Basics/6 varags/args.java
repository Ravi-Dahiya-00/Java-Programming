import java.util.*;
public class args {

    public static int sum(int... numbers){
        int total=0;
        for(int num : numbers){
            total+=num;
        }
        return total;
    }

    public static void printnames(String... names){
        for (String name:names){
            System.out.println(name);
        }
    }
    public static void main(String[] args){
        System.out.println(sum(1,2,3,4));

        System.out.println(sum(10,30,12));

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        
        System.out.println(sum(arr));



        System.out.println(arr);  //prints the reference address
        System.out.println(Arrays.toString(arr));

        printnames("Ravi","Aman","Neha");

        // Only One Varargs Parameter Allowed
        // void test(int... a, int... b)  // ❌ Not allowed

        // Varargs Must Be Last Parameter
        // void test(String name, int... marks)  // ✅ Correct
        // void test(int... marks, String name)  // ❌ Wrong

    }
}
