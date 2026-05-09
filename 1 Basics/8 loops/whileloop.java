import java.util.*;
class whileloop {
    public static void main(String[] args){
    int i=1;

    while (i<=5){
        System.out.println(i);
        i++;
    }

    Scanner scanner=new Scanner(System.in);
    int num=0;
    while(num!=-1){
        System.out.println("Enter a no (-1) to stop: ");
        num=scanner.nextInt();
    }

    // 4️⃣ Infinite while Loop
    /*
        while (true) {
        System.out.println("Running forever");
        }        */

    i=1;
    do{
        System.out.println(i);
        i++;
    }while(i<=5);

    i=1;
    while(i<=3){
        int j=i;
        while(j<=3){
            System.out.print("* ");
            j++;
        }
        System.out.println();
        i++;
    }

    i=1;
    while(true){
        if(i==5){
            break;
        }
        System.out.print(i+" ");
        i++;
    }

    outer:
    while(true){
        while(true){
            break outer;
        }
    }


    
}
}
