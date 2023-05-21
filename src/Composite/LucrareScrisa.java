package Composite;

import java.util.ArrayList;
import java.util.List;

public class LucrareScrisa implements Licenta{
    private List<Licenta> licentascrisa = new ArrayList<>();

    public void creareLicenta(Licenta licenta) {
        licentascrisa.add(licenta);
    }

    @Override
    public void creare() {
        System.out.println("Afisare Licenta");

        for (Licenta licenta : licentascrisa){
            licenta.creare();
        }
    }
}
