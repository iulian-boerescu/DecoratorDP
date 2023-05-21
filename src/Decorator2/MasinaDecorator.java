package Decorator2;

public abstract class MasinaDecorator implements Masina{

    protected Masina masina;

    public MasinaDecorator(Masina masina) {
        this.masina = masina;
    }

    @Override
    public String model() {
        return masina.model();
    }

    @Override
    public int putere() {
        return masina.putere();
    }
}
