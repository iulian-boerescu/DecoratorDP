package Decoretor;

public class SubscriptionDecorator implements Subscription{

    protected Subscription subsctription;

    public SubscriptionDecorator(Subscription subsctription) {
        this.subsctription = subsctription;
    }

    @Override
    public String getDescription() {
        return subsctription.getDescription();
    }

    @Override
    public double getPrice() {
        return subsctription.getPrice();
    }
}
