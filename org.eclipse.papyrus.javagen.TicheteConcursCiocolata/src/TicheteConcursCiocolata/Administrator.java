// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TicheteConcursCiocolata;

import java.util.Scanner;

/************************************************************/
/**
 * 
 */
public class Administrator extends Premiu {
	/**
	 * 
	 */
	public Concurs[] concurs;
	/**
	 * 
	 */
	private String nume;
	public int nrPremii1;
	public int nrPremii2;
	public int nrPremii3;
	public String codCastigator;
	public String codCastigator2;
	public String codCastigator3;
	Premiu[] p;
	Premiu[] p2;
	Premiu[] p3;
	

	/**
	 * 
	 */
	

	public void adaugareConcursNou() {
		boolean valide = true;
		Scanner scan = new Scanner(System.in);
		//athis.concurs = new Concurs[]
		System.out.println("  Scrie un nume pentru concurs");
		String nume = scan.nextLine();

		System.out.println("  Numar premii pentru categoria 1");
		 nrPremii1 = scan.nextInt();
		scan.nextLine();

		System.out.println(nrPremii1);

		 p = new Premiu[nrPremii1];
		Categorie[] c = new Categorie[3];

		for (int i = 0; i < nrPremii1; i++) {
			valide = true;
			System.out.println("Introduceti numele premiului " + (i + 1) + " din categoria 1");
			String numePremiu = scan.nextLine();

			System.out.println("Ati introdus " + numePremiu);

			System.out.println("Introduceti dataExtragere");
			String dataExtr = scan.nextLine();

			System.out.println("Introduceti oraExtragere");
			int oraExtr = scan.nextInt();
			scan.nextLine();

			System.out.println("Introduceti codCastigator");
			 codCastigator = scan.nextLine();
			 setCodCastigator(codCastigator);

			if (oraExtr > 24 || oraExtr < 0) {
				System.out.println("Ora invalida");
				valide = false;
			}
			if (valide) {
				p[i] = new Premiu(numePremiu, dataExtr, oraExtr, codCastigator);
			} else {
				i--;
			}

		}
		c[0] = new Categorie(" Categorie 1", p);

		System.out.println("  Numar premii pentru categoria 2");
		 nrPremii2 = scan.nextInt();
		scan.nextLine();

		 p2 = new Premiu[nrPremii2];

		for (int i = 0; i < nrPremii2; i++) {
			valide = true;
			System.out.println("Introduceti numele premiului " + (i + 1) + " din categoria 2");
			String numePremiu2 = scan.nextLine();
			System.out.println("Introduceti dataExtragere");
			String dataExtr2 = scan.nextLine();
			System.out.println("Introduceti oraExtragere");
			int oraExtr2 = scan.nextInt();
			scan.nextLine();

			System.out.println("Introduceti codCastigator");
			 codCastigator2 = scan.nextLine();
			 setCodCastigator(codCastigator2);

			if (oraExtr2 > 24 || oraExtr2 < 0) {
				System.out.println("Ora invalida");
				valide = false;
			}
			if (valide) {
				p2[i] = new Premiu(numePremiu2, dataExtr2, oraExtr2, codCastigator2);
			} else {
				i--;
			}

		}
		c[1] = new Categorie(" Categorie 2", p2);

		System.out.println("  Numar premii pentru categoria 3");
		 nrPremii3 = scan.nextInt();
		scan.nextLine();

		Premiu[] p3 = new Premiu[nrPremii3];

		for (int i = 0; i < nrPremii3; i++) {

			valide = true;
			System.out.println("Introduceti numele premiului " + (i + 1) + " din categoria 3");
			String numePremiu3 = scan.nextLine();
			System.out.println("Introduceti data extragere");
			String dataExtr3 = scan.nextLine();
			System.out.println("Introduceti ora extragere");
			int oraExtr3 = scan.nextInt();
			scan.nextLine();

			System.out.println("Introduceti cod castigator");
			 codCastigator3 = scan.nextLine();
			 setCodCastigator(codCastigator3);

			if (oraExtr3 > 24 || oraExtr3 < 0) {
				System.out.println("Ora invalida");
				valide = false;
			}
			if (valide) {
				p3[i] = new Premiu(numePremiu3, dataExtr3, oraExtr3, codCastigator3);
				
			} else {
		
				i--;
			}

		}
		c[2] = new Categorie(" Categorie 3", p3);
		Concurs concursNou = new Concurs(nume, c);
		this.concurs = ArrayHelper.push(this.concurs, concursNou);
		//System.out.println("valideeeeeeeeeeeezzzzzzzz");
		//concursNou.validareOraData();

	}

	/**
	 * 
	 */
	public void stergereConcurs() {
		Scanner scan = new Scanner(System.in);
		int indexToRemove = -1;
		String nume;
		System.out.println("Introduceti numele concursului: ");
		nume = scan.nextLine();
		System.out.println("Se sterge concursul " + nume);
		for(int i = 0; i< this.concurs.length; i++) {
			if(nume.equals(this.concurs[i].getNumeConcurs())) {
				indexToRemove = i;
			}
		}
		this.concurs = ArrayHelper.removeTheElement(this.concurs, indexToRemove);
	}

	/**
	 * 
	 */
	public void anuntareConcurs() {
		Scanner scan = new Scanner(System.in);
		String nume;
		System.out.println("Introduceti numele concursului: ");
		nume = scan.nextLine();
		System.out.println("Au fost trimise emailuri catre departamentele implicate.\n Felicitari! Concursul " + nume + " tocmai a fost lansat!");;
	}

	public void afisareConcurs() {
		for( int i =0; i< this.concurs.length; i++) {
			System.out.println("Numele concursului: " + this.concurs[i].getNumeConcurs());
			System.out.println("Numele categoriilor: ");
			System.out.println(this.concurs[i].categorii[0].getNume());
			System.out.println(this.concurs[i].categorii[1].getNume());
			System.out.println(this.concurs[i].categorii[2].getNume());
			
			for(int k=0; k<3; k++) {
				System.out.println("Premiile categoriei " + (k+1) + ": ");
				for( int j = 0; j < this.concurs[j].categorii[k].premii.length; j++) {
					this.concurs[j].categorii[k].premii[j].afisare();
				}
			}
			
		}
	}

	public Administrator() {
		
		this.concurs = new Concurs[0];
		this.nume = "admin";
	}

	public Administrator(String nume) {
		this.concurs = new Concurs[0];
		this.nume = nume;
	}

	public Concurs[] getConcurs() {
		return concurs;
	}

	public void setConcurs(Concurs[] concurs) {
		this.concurs = concurs;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	

};
