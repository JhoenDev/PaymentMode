package Payment;

public class Order {
    private String item;
    private Integer quantity;
    private Double unitPrice, totalAmount;
    PaymentMode paymentMode;

    //Constructor where Payment Method is specified in Instantiation of ORDER object.
    public Order(String item, Integer quantity, Double unitPrice, String paymentMethod) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        setPaymentMode(paymentMethod);

        //print details
        System.out.printf("%-15s %s\n%-15s P %.2f\n%-15s %d\n\n","Order Item is",item,"Unit Price is",unitPrice,"Quantity is",quantity);
        //print total
        setTotalAmount(paymentMethod);
    }

    //Constructor where Payment Method is NOT specific in instantiation of ORDER object.
    public Order(String item, Integer quantity, Double unitPrice) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

        //print details
        System.out.printf("%-15s %s\n%-15s P %.2f\n%-15s %d\n\n","Order Item is",item,"Unit Price is",unitPrice,"Quantity is",quantity);
        //print total for ALL payment Method
        String[] paymentModes = {"GCash","Maya","ShopeePay"};
        for (String paymentMode : paymentModes ) {
            setPaymentMode(paymentMode);
            setTotalAmount(paymentMode);
        }
    }

    public void setTotalAmount(String paymentMethod){
        this.totalAmount = unitPrice * quantity - (unitPrice * quantity * this.paymentMode.determineDiscountRate());
        System.out.printf("Payment order details if %s :\n%-20s %.2f\n%-20s P %.2f\n\n", paymentMethod,"Discount rate is",paymentMode.determineDiscountRate(),"Payment amount is",totalAmount);
    }

    public void setPaymentMode(String paymentMethod){
        switch(paymentMethod) {
            case "GCash":
                this.paymentMode = new GCash(); break;
            case "Maya":
                this.paymentMode = new Maya(); break;
            case "ShopeePay":
                this.paymentMode = new ShopeePay(); break;
        }
    }


}
