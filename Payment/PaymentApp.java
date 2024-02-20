package Payment;

public class PaymentApp {
    public static void main(String[] args) {
        //Creating Order Object with PAYMENT METHOD specified:
        Order order1 = new Order("Salvatore_Gray Bag", 2,2099.99,"GCash");

        //Creating Order Object with NO PAYMENT METHOD specified:
        Order order2 = new Order("Dong-A Fine-TECH Pen", 5,39.75);
    }
}
