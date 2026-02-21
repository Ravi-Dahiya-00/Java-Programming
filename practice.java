import java.util.*;

class practice {
    public static void main(String[] Args){

        // declaration
        int[] numbers=new int[3];

        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=30;

        // declaration + initialization
        int[] arr={1,2,3,4};


        // accessing
        System.out.println(arr[1]);
        System.out.println(numbers[0]);

        // access invalid index → ArrayIndexOutOfBoundsException

        // traversing 
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // (arr.length) It is a property, not a method.


        // enhance for loop
        for (int num:numbers){
            System.out.println(num);
        }

    


    Scanner scanner=new Scanner(System.in);

    int[][] arr_2d=new int[2][3];

    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            arr_2d[i][j]=scanner.nextInt();
        }
    }
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr_2d[i][j]+" ");
        }
        System.out.println();
    }

    
}
}