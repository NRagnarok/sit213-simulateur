package transmetteurs;

import destinations.DestinationInterface;
import information.Information;
import information.InformationNonConforme;
import java.util.Iterator;

public class TransmetteurParfait extends Transmetteur {


    @Override
    public void recevoir(Information information) throws InformationNonConforme {
        this.informationRecue = information;
        transmettre();
    }

    public void transmettre()throws InformationNonConforme {
        this.informationEmise = this.informationRecue;
        emettre();
    }

    @Override
    public void emettre() throws InformationNonConforme {
        Iterator<DestinationInterface> iterator = destinationsConnectees.iterator();
        while (iterator.hasNext()) {
            iterator.next().recevoir(this.informationEmise);
        }
    }
}
