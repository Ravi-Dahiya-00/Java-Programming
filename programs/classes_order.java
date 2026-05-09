
class Product{
    int productId;
    String product_name;
    double price;
    int stock;
    
    Product(int productId,String product_name,double price,int stock){
        this.productId=productId;
        this.product_name=product_name;
        this.price=price;
        this.stock=stock;
    }
    Product(int productId,String product_name){
        this.productId=productId;
        this.product_name=product_name;
        this.stock=10;
        this.price=100.0;
    }
    Product(String product_name,double price){
        this.product_name=product_name;
        this.price=price;
    }
    void updateStock(int quantity){
        stock+=quantity;
    }
    void display(){
        System.out.println(productId+product_name+price+stock);
    }
}

class Customer{
    int customerID;
    String customer_name;
    double walletBalance;
    
    Customer(int customerID,String customer_name,double walletBalance){
        this.customerID=customerID;
        this.customer_name=customer_name;
        this.walletBalance=walletBalance;
    }
    void addMoney(double amount){
        walletBalance+=amount;
    }
    
    void addMoney(int amount){
        walletBalance+=amount;
    }

    void deductMoney(double amount){
        walletBalance-=amount;
    }
}

class Order{
    int orderID;
    double totalAmount;
    String orderStatus;
    
    Customer customer;
    int count;
    Product[] products;
    int[] quantities;
    
    Order(int orderID,Customer customer){
        this.orderID=orderID;
        this.customer=customer;
        
        products=new Product[10];
        quantities=new int[10];
        
        count=0;
        orderStatus="CREATED";
    }
    
    void addProducts(Product p,int qty){
        if(count>=products.length){
            System.out.println("Order is full,cannot add more Products");
            return;
        }
        if(qty<=0){
            System.out.println("Invalid quantity");
            return;
        }
        products[count]=p;
        quantities[count]=qty;
        count++;
    }
    
      void addProducts(Product p){
        if(count>=products.length){
            System.out.println("Order is full,cannot add more Products");
            return;
        }
        products[count]=p;
        quantities[count]=1;
        count++;
    }

    void placeOrder(){
        double total=0;
        for(int i=0;i<count;i++){
            if(products[i].stock<quantities[i]){
                orderStatus="FAILED- STOCK NOT AVAILABLE";
                System.out.println(orderStatus);
                return;
            }
        total+=products[i].price*quantities[i];
        }
        
        if(customer.walletBalance<total){
            orderStatus="FAILED - INSUFFICIENT BALANCE";
            System.out.println(orderStatus);
            return;
        }
        
        customer.deductMoney(total);
        for(int i=0;i<count;i++){
            products[i].stock-=quantities[i];
        }
        
        totalAmount=total;
        orderStatus="COMPLETED";
        System.out.println("Order placed Succesfully");
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Remaining Balance: " + customer.walletBalance);
    }


  
}

class Main{
    public static void main(String[] args){
        
    }
}