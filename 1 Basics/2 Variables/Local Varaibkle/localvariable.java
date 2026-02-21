public class localvariable {
    public void pupage(){
        int age=0;
        age+=7;
        System.out.println("Puppy age is : "+age);
    }

    public static void main(String args[]){
        localvariable local=new localvariable();
        local.pupage();



        int var=10;
        System.out.println("Int Variable: "+ var);

        double size=10.5;
        System.out.println("Double variable : "+ size);

        char currency='$';
        System.out.println("Currency: "+currency);

        boolean isStudent=true;
        System.out.println("is Student : "+isStudent);

        if(isStudent){
            System.out.println("You are a student");
        }




        // reference variables   

        String name="Ravi";
        System.out.println("Hello "+name);


    }
}
