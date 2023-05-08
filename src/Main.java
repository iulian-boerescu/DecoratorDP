import Decoretor.*;

public class Main {
    public static void main(String[] args) {
        Subscription subscription = new BasicSubscription();
        subscription = new OfflineViewingDecorator(subscription);
        subscription = new HDStreamingDecoartor(subscription);
        subscription = new PremiumSubscription(subscription);

        System.out.println("Descriere: " + subscription.getDescription());
        System.out.println("Pret: " + subscription.getPrice());

    }
}