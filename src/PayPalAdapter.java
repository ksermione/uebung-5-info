/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class PayPalAdapter implements IPayment {

    PayPalPayment payPal;
    String webShopName = "Sonnenbrillen-Webshop";

    public void pay(Integer amount) {
        payPal = new PayPalPayment();
        payPal.login("user", "pass");
        payPal.setAmount(amount);
        payPal.setRecepient(webShopName);
        payPal.confirm();
        System.out.println(PaymentDisplayStringAssembly.assembleString(PaymentMethod.PAYPAL, amount));
    }
}
