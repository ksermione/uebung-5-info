/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class PaymentDisplayStringAssembly {
    public static String assembleString(PaymentMethod paymentMethod, Integer amountPayed) {
        return "Payment successfull!\nPayed via: " + paymentMethod + "\nAmount Payed: " + amountPayed + "\n";
    }
}
