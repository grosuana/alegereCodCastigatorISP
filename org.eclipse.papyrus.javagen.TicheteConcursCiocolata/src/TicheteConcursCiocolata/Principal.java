package TicheteConcursCiocolata;

import java.util.Scanner;

public class Principal  extends Administrator{

	public static  void main(String[] args) {
		 
		Administrator a1 = new Administrator("admin");
		
		Participant p1 = new Participant("Gelu");
		String choice, choice2, choice3;
		System.out.println("------- MENIU ------");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduceti 'a' pentru administrator sau 'p' pentru participant");
		choice = scan.nextLine();
		while (!choice.equals("q")) {
			switch (choice) {
			
			case "a":
				System.out.println( " Ati selectat partea de administrare ");
				
				System.out.println( " ---------- MENIU ---------");
				System.out.println(" 1 - Adaugare Concurs ");
				System.out.println(" 2 - Afisare Concursuri ");
				System.out.println(" 3 - Stergere  Concurs ");
				System.out.println(" 4 - Anuntare  Concurs ");
				System.out.println(" 9 - Schimbati pentru participare ");
				choice2 = scan.nextLine();
						switch(choice2) {
						case "1" :
							a1.adaugareConcursNou();
							break;
						case "2":
							a1.afisareConcurs();
							break;
						case "3":
							a1.stergereConcurs();
							break;
						case "4":
							a1.anuntareConcurs();
							break;
						 
						case "9":
							System.out.println(" Ati ales sa participati");
							choice = "p";
						
						}
				
			case "p":
				System.out.println( " Ati selectat sa participati ");
				System.out.println( " ---------- MENIU ---------");
				System.out.println(" 1 - Adaugare cod "); 
				System.out.println(" 9 - Schimbati pentru administrare ");
				choice2 = scan.nextLine();
					switch(choice2) {
						case "1" :
							p1.introducereDateParticipant();
							break;
						case "9" :
							System.out.println(" Ati ales sa administrati");
							choice = "a";
							break;
							
							
				
			}

		}
		}
	}
}
		