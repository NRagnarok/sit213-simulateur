package destinations;

import information.Information;
import information.InformationNonConforme;

public class DestinationFinale extends Destination {
    public DestinationFinale() {
        super();
    }

    @Override
    public Information getInformationRecue() {
        return super.getInformationRecue();
    }

    @Override
    public void recevoir(Information information) throws InformationNonConforme {

    }
}
