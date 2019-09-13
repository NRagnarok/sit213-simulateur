package transmetteurs;

import destinations.DestinationInterface;
import information.Information;
import information.InformationNonConforme;

public class TransmetteurParfait extends Transmetteur {


    @Override
    public void recevoir(Information information) throws InformationNonConforme {
        this.informationRecue = information;
    }

    public TransmetteurParfait() {
        super();
    }

    @Override
    public Information getInformationRecue() {
        return super.getInformationRecue();
    }

    @Override
    public Information getInformationEmise() {
        return super.getInformationEmise();
    }

    @Override
    public void connecter(DestinationInterface destination) {
        super.connecter(destination);
    }

    @Override
    public void deconnecter(DestinationInterface destination) {
        super.deconnecter(destination);
    }

    @Override
    public void emettre() throws InformationNonConforme {

    }
}
