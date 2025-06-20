public class Main5 {
    public static void main(String[] args) {
        
        Notifier notifier = new EmailNotifier();
        notifier = new SMSNotifierDecorator(notifier);
        notifier = new SlackNotifierDecorator(notifier);

        notifier.send("Server is down!");
    }
}
