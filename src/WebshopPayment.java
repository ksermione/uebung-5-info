/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class WebshopPayment implements IPayment {

    public void pay(Integer amount) {
        System.out.println(PaymentDisplayStringAssembly.assembleString(PaymentMethod.TRANSFER, amount));
    }
}
