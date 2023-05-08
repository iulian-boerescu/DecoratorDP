package Decoretor;

public class HDStreamingDecoartor extends SubscriptionDecorator{
    public HDStreamingDecoartor(Subscription subsctription) {
        super(subsctription);
    }
    @Override
    public String getDescription() {
        return subsctription.getDescription() + ", calitate HD";
    }

    @Override
    public double getPrice() {
        return subsctription.getPrice() + 3.0;
    }
}
