package sources;

import information.*;
import destinations.DestinationInterface;
import java.util.*;

/**
 * blablabla
 * @author epoulb
 * @author Nicolas
 */

public class SourceFixe extends Source {

    public SourceFixe() {
        super();
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
        super.emettre();
    }
}
