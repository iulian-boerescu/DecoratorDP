package Decorator2;

public class MasinaStoc implements Masina{
    @Override
    public String model() {
        return "Model 1";
    }

    @Override
    public int putere() {
        return 120;
    }
}
