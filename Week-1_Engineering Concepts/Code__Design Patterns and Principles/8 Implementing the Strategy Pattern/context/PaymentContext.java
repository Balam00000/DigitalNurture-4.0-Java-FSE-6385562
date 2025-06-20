package context;

import strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy p;
     
    public void setPaymentContext(PaymentStrategy p){
        this.p=p;
    }

    public void pay(double amount){
        if(p==null){
            System.out.println("Payment method Not seleted");
        }
        else{
            p.pay(amount);
        }
    }

    
}
