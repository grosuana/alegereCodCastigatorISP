//GROSU ANA, 332AB

package TicheteConcursCiocolata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testareAdaugareConcurs {

	@Test
	void testVerificareNumeConcurs() {
		//initializari
		Premiu[] premii = new Premiu[1];
		premii[0] = new Premiu();
		Categorie[] categorii = new Categorie[1];
		categorii[0] = new Categorie("", premii);
		
		
		//testam numele de concurs gol
		Concurs concurs1 = new Concurs("", categorii);
		assertFalse(concurs1.verificareNumeConcurs());
		
		//testam un nume de concurs corect
		Concurs concurs2 = new Concurs("numeleMeu", categorii);
		assertTrue(concurs2.verificareNumeConcurs());
		
		//testam cu un nume prea lung
		Concurs concurs3 = new Concurs("numeleMeunumeleMeunumeleMeunumeleMeu", categorii);
		assertFalse(concurs3.verificareNumeConcurs());
	}

	@Test
	void testVerificareExistentaPremii() {
		//initializari
		Premiu[] premii = new Premiu[1];
		Premiu[] premiiGoale = new Premiu[0];
		premii[0] = new Premiu();
		
		Categorie[] categorii = new Categorie[3];
		categorii[0] = new Categorie("", premii);
		categorii[1] = new Categorie("", premiiGoale);
		categorii[2] = new Categorie("", premii);
		
		//testam cu categorii ce nu contin premii
		Concurs concurs1 = new Concurs("", categorii);
		assertFalse(concurs1.verificareExistentaPremii());
		
		//testam cu categorii ce contin premii
		categorii[1] = new Categorie("", premii);
		Concurs concurs2 = new Concurs("", categorii);
		assertTrue(concurs2.verificareExistentaPremii());
	}

	@Test
	void testVerificareExistentaDataExtragere() {
		//initializari
		Premiu[] premiiFaraData = new Premiu[1];
		premiiFaraData[0] = new Premiu();
		
		Premiu[] premiiCuData = new Premiu[1];
		premiiCuData[0] = new Premiu("premiu","12.12",0,"cod");
		
		Categorie[] categoriiFaraData = new Categorie[3];
		categoriiFaraData[0] = categoriiFaraData[1] =categoriiFaraData[2]= new Categorie("", premiiFaraData);
		
		Categorie[] categoriiCuData = new Categorie[3];
		categoriiCuData[0] = categoriiCuData[1] =categoriiCuData[2] = new Categorie("", premiiCuData);
		
		//testam cu un concurs in care un premiu nu are data de extragere
		Concurs concurs1 = new Concurs("", categoriiFaraData);
		assertFalse(concurs1.verificareExistentaDataExtragere());
		
		//testam cu un concurs in care exista data de extragere
		Concurs concurs2 = new Concurs("", categoriiCuData);
		assertTrue(concurs2.verificareExistentaDataExtragere());
	
	}

	
	
	@Test
	void testValidareOraData() {
		
		Premiu[] premii1 = new Premiu[1];
		Premiu[] premii2 = new Premiu[1];
		Premiu[] premii3 = new Premiu[1];
		Premiu[] premii4 = new Premiu[1];
		
		premii1[0] = new Premiu("premiu","12.12",234,"cod");
		premii2[0] = new Premiu("premiu","1232.12",13,"cod");
		premii3[0] = new Premiu("premiu","12.1232",13,"cod");
		premii4[0] = new Premiu("premiu","12.12",13,"cod");
		
		Categorie[] categorii1 = new Categorie[3];
		Categorie[] categorii2 = new Categorie[3];
		Categorie[] categorii3 = new Categorie[3];
		Categorie[] categorii4 = new Categorie[3];
		
		categorii1[0] = categorii1[1] =categorii1[2]= new Categorie("", premii1);
		categorii2[0] = categorii2[1] =categorii2[2]= new Categorie("", premii2);
		categorii3[0] = categorii3[1] =categorii3[2]= new Categorie("", premii3);
		categorii4[0] = categorii4[1] =categorii4[2]= new Categorie("", premii4);
		
		//testam cu un ora invalida
		Concurs concurs1 = new Concurs("", categorii1);
		assertFalse(concurs1.validareOraData());
		
		//testam cu un zi invalida
		Concurs concurs2 = new Concurs("", categorii2);
		assertFalse(concurs2.validareOraData());
		
		//testam cu un luna invalida
		Concurs concurs3 = new Concurs("", categorii3);
		assertFalse(concurs3.validareOraData());
		
		//testam cu un data corecta
		Concurs concurs4 = new Concurs("", categorii4);
		assertTrue(concurs4.validareOraData());
	}

}
