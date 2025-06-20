package ma;

import context.PaymentContext;
import strategy.CreditCardPayment;
import strategy.PayPalPayment;

public class Main8 {
    public static void main(String[] args) {
         PaymentContext pc=new PaymentContext();

         pc.setPaymentContext(new CreditCardPayment("1234-5678-9876-5432", "JOHN"));
         pc.pay(2000);

         pc.setPaymentContext(new PayPalPayment("John@gmail.com"));
         pc.pay(2500);

    }
    
}
