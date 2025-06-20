public class Main4 {
    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(250.00);

        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(150.00);
    }
}
