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
        Boolean var = true;
        this.informationGeneree = new Information();
        for(int i=0; i<1000; i++){
            var = !var;
            this.informationGeneree.add(var);
        }
        super.emettre();
    }
}
