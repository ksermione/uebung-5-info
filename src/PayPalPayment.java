/**
 * Created by oksana.shcherban on 22.06.19.
 */
public class PayPalPayment {

    String username;
    String password;
    Integer amount;
    String recepient;
    Boolean loggedIn;

    Boolean login(String name, String password) {
        this.username = name;
        this.password = password;
        this.loggedIn = true;
        return true;
    }

    void setRecepient(String recepient) {
        this.recepient = recepient;
    }

    void setAmount(Integer amount) {
        this.amount = amount;
    }

    void confirm() {

    }
}
