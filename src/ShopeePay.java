package src;

public class ShopeePay implements PaymentMode{
    public Double determineDiscountRate() {
        return 0.1d;
    }
}
