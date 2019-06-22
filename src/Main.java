/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class Main {

    public static void main(String[] args) {
        IPayment payment;

        payment = new WebshopPayment();
        payment.pay(300);

        payment = new PayPalAdapter();
        payment.pay(369);
    }
}
