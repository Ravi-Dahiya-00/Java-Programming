public class passing {
    public static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int sum(int... arr){
        int total=0;
        for(int num:arr){
            total+=num;
        }
        return total;
    }
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5};
        printarray(numbers);

            int[] values={1,2,3,4};
            System.out.println("Sum"+sum(values));
    }



}
