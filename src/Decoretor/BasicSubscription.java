package Decoretor;

public class BasicSubscription implements Subscription{

    @Override
    public String getDescription() {
        return "Abonament de Baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
