package Decorator2;

public class MasinaPachetCurse extends MasinaDecorator{
    public MasinaPachetCurse(Masina masina) {
        super(masina);
    }

    @Override
    public String model() {
        return super.model() + "Cursa";
    }

    @Override
    public int putere() {
        return super.putere() + 200;
    }
}
