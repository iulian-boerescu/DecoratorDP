package Decorator2;

public class MasinaPachetSport extends MasinaDecorator{

    public MasinaPachetSport(Masina masina) {
        super(masina);
    }

    public String model(){
        return masina.model() + "Sport";
    }

    public int putere(){
        return masina.putere() + 100;
    }
}
