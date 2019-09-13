package destinations;

import information.Information;
import information.InformationNonConforme;

public class DestinationFinale extends Destination {
    @Override
    public void recevoir(Information information) throws InformationNonConforme {
        this.informationRecue = information;
    }
}
