import java.util.*;

class product{
    int productid;
    String name;
    double price;
    int stock;
}

class order{
    int orderId;
    int quantity;
    double totalprice;
    product obj;
}
class Main{
    public static void main(String[] args){
        product p1=new product();
        p1.productid=1;
        p1.name="Laptop";
        p1.price=5000.5000;
        p1.stock=10;
        
        product p2=new product();
        p2.productid=2;
        p2.name="computer";
        p2.price=2000.200;
        p2.stock=4;
        
        product p3=new product();
        p3.productid=3;
        p3.name="mouse";
        p3.price=500;
        p3.stock=20;
        
        Scanner sc=new Scanner(System.in);
        ArrayList<order> orders=new ArrayList<>();
        int orderCounter=1;
        
        while(true){
            System.out.println("Press 1 for order 0 for exit");
            int wants_order=sc.nextInt();
            if(wants_order==0){
                System.out.println("Thanku for visiting our websites");
                break;
            }
            System.out.println("P1 -> name = "+p1.name+"price ="+p1.price+"available stock quantity = "+p1.stock);
            System.out.println("P2 -> name = "+p2.name+"price ="+p2.price+"available stock quantity = "+p2.stock);
            System.out.println("P3 -> name = "+p3.name+"price ="+p3.price+"available stock quantity = "+p3.stock);
            System.out.println("Select product p1->1 p2->2 p3->3");
            int choose=sc.nextInt();
            order o1=new order();
            o1.orderId=orderCounter;
            orderCounter++;
            if(choose==1){
                o1.obj=p1;
            }
            else if(choose==2){
                o1.obj=p2;
            }
            else if(choose==3){
                o1.obj=p3;
            }
            else{
                System.out.println("Invald product, No Such product is available for now");
                continue;
            }
            
            System.out.println("Enter quantity");
            o1.quantity=sc.nextInt();
            if(o1.obj.stock>=o1.quantity){
                o1.totalprice=o1.quantity*o1.obj.price;
                o1.obj.stock-=o1.quantity;
                System.out.println("Order Placed Successfully");
                orders.add(o1);
            }
            else{
                System.out.println("Item out of stock available quantities are : "+o1.obj.stock);
            }
        }
        
        System.out.println("ALL orders");
       
       for(order o:orders){ 
        System.out.println("order ID: "+o.orderId+ ",product: "+o.obj.name+"quantity: "+o.quantity+"total price:"+o.totalprice);
       }
    
    }
}