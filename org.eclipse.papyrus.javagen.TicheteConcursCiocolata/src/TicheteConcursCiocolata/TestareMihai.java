/** @author 
 *  Mihail Cristian Badea
 * @grupa
 * 332AB */
//

package TicheteConcursCiocolata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestareMihai {

	@Test
	void testVerificareNumeParticipant() {
		
		//Verifica nume gol
		Participant participant1 = new Participant("", "23");
		assertFalse(participant1.verificareParticipant());
		
		//Verifica cu nume corect
		Participant participant2 = new Participant("participant", "23");
		assertTrue(participant2.verificareParticipant());
		
		//testam cu un nume prea lung
		Participant participant3 = new Participant("participantparticipantparticipantparticipant", "23");
		assertFalse(participant3.verificareParticipant());;
	}

	@Test
	void testIntroducereCod() {
			// verificam daca sintaxa codului este corecta, un cod are 1 sau 2 cifre
		
			// testam cu un numar de 2 cifre
				Participant participant1 = new Participant("mihai", "23");
				assertTrue(participant1.verificareCod());
				
			// testam cu un numar de 3 cifre
				Participant participant2 = new Participant("participant", "230");
				assertFalse(participant2.verificareCod());
				
			// testam cu un numar negativ	
				Participant participant3 = new Participant("participant", "-1");
				assertFalse(participant3.verificareCod());;
				
				// testam cu un numar de o cifra
				Participant participant4 = new Participant("participant", "4");
				assertTrue(participant4.verificareCod());;
		
	}
	
	
	@Test
	void testIntroducereNumarDecoduri() {
		
		// verificam numarul de coduri introduse de fiecare participant ( trebuie sa fie mai mic de 6
		
		// testam cu un nr de 14 coduri
		Participant participant1 = new Participant("mihai", 14);
		assertFalse(participant1.verificareNumarCoduri());
		
		// testam cu un nr de 5 coduri
		Participant participant2 = new Participant("participant", 5);
		assertTrue(participant2.verificareNumarCoduri());
		
		// testam cu un nr de -4 coduri
		Participant participant3 = new Participant("participant", -4);
		assertFalse(participant3.verificareNumarCoduri());;

}
	@Test
	void testCodCastigator() {
		Participant participant1 = new Participant("mihai", "23");
		assertTrue(participant1.verificareCodCastigator());
	
		Participant participant2 = new Participant("mihai", "8");
		assertFalse(participant2.verificareCodCastigator());
		
		Participant participant3 = new Participant("mihai", "13");
		assertFalse(participant3.verificareCodCastigator());
		
		Participant participant4 = new Participant("mihai", "11");
		assertTrue(participant4.verificareCodCastigator());
		
		Participant participant5 = new Participant("mihai", "9");
		assertFalse(participant5.verificareCodCastigator());
		
		Participant participant6 = new Participant("mihai", "10");
		assertTrue(participant6.verificareCodCastigator());

	}
}
