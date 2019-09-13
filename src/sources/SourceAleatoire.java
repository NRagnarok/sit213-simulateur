package sources;

import java.util.Random;
import information.Information;
import information.InformationNonConforme;

/**
 * blablabla
 * @author epoulb
 * @author Nicolas
 */

public class SourceAleatoire extends Source {

    public SourceAleatoire() {
        super();
        try{
            generer();
        }catch (Exception e){

        }
    }

    public void generer() throws InformationNonConforme {
        this.informationGeneree = new Information();

        Random random = new Random();

        for(int i=0; i<1000; i++){
            this.informationGeneree.add(random.nextBoolean());
        }
        super.emettre();
    }
}
