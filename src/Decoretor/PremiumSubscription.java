package Decoretor;

public class PremiumSubscription extends SubscriptionDecorator{
    public PremiumSubscription(Subscription subsctription) {
        super(subsctription);
    }

    @Override
    public String getDescription() {
        return subsctription.getDescription() + ", Premium";
    }

    @Override
    public double getPrice() {
        return subsctription.getPrice() + 9.0;
    }
}
