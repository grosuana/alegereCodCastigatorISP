/** @author 
 *  Tudor Mangri
 * @grupa
 * 332AB */

package TicheteConcursCiocolata;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TicheteConcursCiocolata.Premiu;

class TestareTudor {

    @Test
    void testVerificareNumePremiu() {
      
        //testam numele  gol
        Premiu premiu1 = new Premiu("", "23",1,"20");
        assertFalse(premiu1.verificareNumePremiu());

        //testam un nume  corect
        Premiu premiu2 = new Premiu("Ciocolata", "23",1,"20");
        assertTrue(premiu2.verificareNumePremiu());

        //testam cu un nume prea lung
        Premiu premiu3 = new Premiu("ciocolatadealunesistafide", "23",1,"20");
        assertFalse(premiu3.verificareNumePremiu());
    }

    @Test
    void testIntroducereCod() {

    			//verifica cod corect (intre 0 si 100)
                Premiu premiu1 = new Premiu("ciocolata", "23",1,"20");
                assertTrue(premiu1.verificareCodPremiu());

                //verifica incorect (prea mic)
                Premiu premiu2 = new Premiu("ciocolata", "23",1,"-1");
                assertFalse(premiu2.verificareCodPremiu());
                
                //verifica incorect (prea mare)
                Premiu premiu3 = new Premiu("ciocolata", "23",1,"200");
                assertFalse(premiu3.verificareCodPremiu());;

    }

}