package TicheteConcursCiocolata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TicheteConcursCiocolata.Premiu;

class TestareTudor {

    @Test
    void testVerificareNumePremiu() {
        //initializari


        //testam numele  golS
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

                Premiu premiu1 = new Premiu("ciocolata", "23",1,"20");
                assertTrue(premiu1.verificareCodPremiu());


                Premiu premiu2 = new Premiu("ciocolata", "23",1,"-1");
                assertFalse(premiu2.verificareCodPremiu());


                Premiu premiu3 = new Premiu("ciocolata", "23",1,"200");
                assertFalse(premiu3.verificareCodPremiu());;

    }

}