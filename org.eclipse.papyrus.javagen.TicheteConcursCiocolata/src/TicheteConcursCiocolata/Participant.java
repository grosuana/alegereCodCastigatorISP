// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package TicheteConcursCiocolata;

import java.util.Scanner;

/************************************************************/
/**
 * 
 */
public class Participant extends Administrator {
	/**
	 * 
	 */
	private String nume;
	/**
	 * 
	 */
	private String telefon;
	/**
	 * 
	 */
	private String[] coduriIntroduse;

	/**
	 * 
	 */
	public void adaugareCod() {
	}

	/**
	 * 
	 */

	public void afisareNumarDeCoduriIntroduse() {
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String[] getCoduriIntroduse() {
		return coduriIntroduse;
	}

	public void setCoduriIntroduse(String[] coduriIntroduse) {
		this.coduriIntroduse = coduriIntroduse;
	}

	public Participant(String nume, String telefon) {
		super();
		this.nume = nume;
		this.telefon = telefon;
	}

	public void introducereDateParticipant() {
		Participant[] p = new Participant[100];
		Scanner scan = new Scanner(System.in);
		System.out.println("  Introduceti numele dumneavoastra : ");
		String nume = scan.nextLine();
		System.out.println("  Introduceti cate coduri doriti sa bagati : ");
		int nrCoduri = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < nrCoduri; i++) {
			System.out.println("Introduceti cod castigator");
			String codIntrodus = scan.nextLine();
			System.out.println(" Codul este valid");
			if (i == 0) {
				System.out.println("Participati pentru categoria 1 de premii");
				for(int j = 0; j < nrPremii1;j++) {
					if(p[j].codCastigator == codIntrodus) {
						System.out.println("Codul este castigator");
					}
					else System.out.println("Codul nu este castigator");
					
				}

				
			} else if (i == 2) {
				System.out.println("Participati pentru categoria 2 de premii");
				for(int j = 0; j < nrPremii2;j++) {
					if(p2[j].getCodCastigator2() == codIntrodus) {
						System.out.println("Codul este castigator");
					}
					else System.out.println("Codul nu este castigator");
				}

			} else if (i == 4) {
				System.out.println("Participati pentru categoria 3 de premii");
				for(int j = 0; j < nrPremii3;j++) {
					if(p3[j].getCodCastigator3() == codIntrodus) {
						System.out.println("Codul este castigator");
					}
					else System.out.println("Codul nu este castigator");

			}
			}
			else if (i > 4) {
				System.out.println(" Ati introdus maximul de coduri deja");
				i = nrCoduri + 1;

			} else
				System.out.println(" Nu sunteti eligibil pentru urmatoarea categorie");
		
	}
	}

	

	public Participant(String nume) {
		this.nume = nume;

	}

};
