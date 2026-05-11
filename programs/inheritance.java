import java.util.*;
class parent{
    int id;
    final String country="India";
    parent(int id){
        System.out.println("Parent constructor called");
        this.id=id;
    }
    void print(){
        // country="USA";    ERROR.
        System.out.println("Hello guys this is parent class");
    }
    
    // Now child CANNOT override it.
    final void security(){
        System.out.println("Security method");
    }
}

// if class is declared as final, noone can extends the parent class
class child extends parent{
    String name;
    int id=1;
    child(String name,int id){
        super(id);
        
        System.out.println("Child constructor called");
        this.name=name;
        this.id=id;
        
    }

    int square(){
        return super.id*super.id;
    }
    
    void print(){
        System.out.println("Hello guys this is child class");
        super.print();
    }
    
    void showids(){
        System.out.println("child id : "+this.id);
        System.out.println("child id : "+super.id);
        
    }
    
    

}

class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int id=scanner.nextInt();
        child obj=new child(name,id);

        System.out.println(obj.name);
        System.out.println(obj.id);
        // System.out.println(super.id);  cannot do this 

        obj.print();
        int s=obj.square();
        System.out.println("square of id : "+s);
        
        System.out.println(obj instanceof parent);
        System.out.println(obj instanceof child);
        System.out.println(obj.country);


    }
}