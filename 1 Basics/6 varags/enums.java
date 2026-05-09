import java.util.*;

enum day{
    MONDAY,
    TUESDAY,
    SATURDAY,
    SUNDAY
}

public class enums {
    enum level{
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args){
        level l=level.HIGH;
        System.out.println(l);
    

    day d=day.MONDAY;
    
    switch(d){
        case MONDAY:
            System.out.println("Start of week");
                break;
        case TUESDAY:
            System.out.println("Second day of the week");
        case SUNDAY:
            System.out.println("End of the week");
        case SATURDAY:
            System.out.println("Last second day of the week");
        default:
            System.out.println("Middle of the week");
    }


    for (day i : day.values()){
        System.out.print(i+" ");
    }
    System.out.println();

    day a=day.valueOf("MONDAY");
    System.out.println(a);

    
}

}