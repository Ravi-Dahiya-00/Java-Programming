import java.util.*;

class car{
    void fuel(){
        System.out.println("can have diesel petrol as the fuel");
    }

}

class Sedan extends car{
    
    @Override
    void fuel(){
        System.out.println("Shiny car,but runs on diesel");
    }

}

class engine extends car{
    void fuel(){
        System.out.println("converting diesel to smooth motion");
    }

    public static void main(String[] args){
        car a1,a2,a3;
        a1=new car();
        a2=new Sedan();
        a3=new engine();

        a1.fuel();
        a2.fuel();
        a3.fuel();
    }
}

