import Composite.*;
import Decorator2.Masina;
import Decorator2.MasinaPachetCurse;
import Decorator2.MasinaPachetSport;
import Decorator2.MasinaStoc;
import Decoretor.*;
import Proxy.ProxyVideo;
import Proxy.Video;

public class Main {
    public static void main(String[] args) {
        Subscription subscription = new BasicSubscription();
        subscription = new OfflineViewingDecorator(subscription);
        subscription = new HDStreamingDecoartor(subscription);
        subscription = new PremiumSubscription(subscription);

        System.out.println("Descriere: " + subscription.getDescription());
        System.out.println("Pret: " + subscription.getPrice());

        // Decorator 2 - Masina

        Masina masina = new MasinaStoc();
        masina = new MasinaPachetCurse(masina);
        masina = new MasinaPachetSport(masina);
        System.out.println("\nModel " + masina.model());
        System.out.println("Putere " + masina.putere());

        // Composite - Lucrare de Licenta

        Licenta cap1 = new Capitol1();
        Licenta cap2 = new Capitol2();
        Licenta cap3 = new Capitol3();

        LucrareScrisa lucrare = new LucrareScrisa();
        lucrare.creareLicenta(cap1);
        lucrare.creareLicenta(cap2);
        lucrare.creareLicenta(cap3);

        lucrare.creare();

        // proxi  Video

        Video video = new Video(600);
        ProxyVideo proxyVideo = new ProxyVideo(video);
        System.out.println(proxyVideo.derulare());
        Video video2 = new Video(900);
        proxyVideo = new ProxyVideo(video2);
        System.out.println(proxyVideo.derulare());


    }
}