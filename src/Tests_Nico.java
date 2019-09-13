import destinations.DestinationFinale;
import sources.SourceFixe;
import transmetteurs.TransmetteurParfait;
import visualisations.SondeLogique;

public class Tests_Nico {
    protected static void test_fonctionnement(){
        Simulateur simulateur;
        SourceFixe sf;
        SondeLogique sl1;
        TransmetteurParfait tp;
        SondeLogique sl2;
        DestinationFinale df;

        sf = new SourceFixe();
        sl1 = new SondeLogique("Sonde 1", 200);
        sl2 = new SondeLogique("Sonde 2", 200);
        tp = new TransmetteurParfait();
        df = new DestinationFinale();

        //simulateur = new Simulateur("");

    }

    public static void main(String[] args) {
        test_fonctionnement();
    }
}
