import java.util.*;
class forloop{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("hello"+i);
        }


        // Multiple Variables in for
        for (int i=0 , j=5 ; i < j ;i++,j--){
            System.out.println("hii"+i);
        }
            /*
            Variables must be same type
            You can update multiple variables
            */

        int a;
        for (a=0;a<5;a++){
            System.out.println(a);
        }


        // Enhanced for Loop (For-Each Loop)
        int[] arr={10,20,30};
        for (int num:arr){
            System.out.println(num);
        }



        // Nested for Loop
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // 🔹 break : Stops loop completely.
        for (int i=0;i<5;i++){
            if(i==4){
                break;
            }
            System.out.print(i+" ");
        }

        System.out.println();
        // 🔹 continue : Skips current iteration.
        for (int i=1;i<=5;i++){
            if(i==3)
                continue;
            System.out.print(i+" ");
        }

        System.out.println();
        // 🔹 Labeled for Loop (Advanced)    Used in nested loops to break outer loop.
        outer:
            for(int i=1;i<=3;i++){
                for(int j=1;j<=3;j++){
                    if(i==2)
                        break outer;
                    System.out.println(i+" "+j);
                }
            }

            



    }
}