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
        try{
            generer();
        }catch (Exception e){

        }
    }

    public void generer() throws InformationNonConforme {
        this.informationGeneree = new Information();
        for(int i=0; i<1000; i++){
            this.informationGeneree.add(1);
        }
        super.emettre();
    }
}
