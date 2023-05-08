package Decoretor;

public class OfflineViewingDecorator extends SubscriptionDecorator{
    public OfflineViewingDecorator(Subscription subsctription) {
        super(subsctription);
    }

    @Override
    public String getDescription() {
        return subsctription.getDescription() + ", vizionare offline";
    }

    @Override
    public double getPrice() {
        return subsctription.getPrice() + 5.0;
    }
}
