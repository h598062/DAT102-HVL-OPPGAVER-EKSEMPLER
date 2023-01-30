package no.hvl.dat102;

public class KlientTelefonliste {

	public static <T> void main(String[] args) {

		Kontakt[] venner = new Kontakt[7];
		venner[0] = new Kontakt("Jon", "Samulesen", "55535879");
		venner[1] = new Kontakt("Sarah", "Barvik", "56512102");
		venner[2] = new Kontakt("Marhus", "Rein", "57210233");
		venner[3] = new Kontakt("Laura", "Gjertsen", "54237761");
		venner[4] = new Kontakt("Frank", "Alstad", "55425699");
		venner[5] = new Kontakt("Lars", "Selvik", "57734421");
		venner[6] = new Kontakt("Elise", "Alstad", "53425699");
		/**************************************************/
		Kontakt[] vennerS = new Kontakt[7];
		for (int i = 0; i < vennerS.length; i++) {
			vennerS[i] = venner[i];
		}

		// Lager noen flere usorterte data for de ulike sorterinsgmetodene

		Kontakt[] venner1 = new Kontakt[7];
		for (int i = 0; i < venner1.length; i++) {
			venner1[i] = venner[i];
		}

		Kontakt[] venner2 = new Kontakt[7];
		for (int i = 0; i < venner2.length; i++) {
			venner2[i] = venner[i];
		}

		Kontakt[] venner3 = new Kontakt[7];
		for (int i = 0; i < venner3.length; i++) {
			venner3[i] = venner[i];
		}
		Kontakt[] venner4 = new Kontakt[7];
		for (int i = 0; i < venner4.length; i++) {
			venner4[i] = venner[i];
		}

		Kontakt[] venner5 = new Kontakt[7];
		for (int i = 0; i < venner5.length; i++) {
			venner5[i] = venner[i];
		}

		Kontakt[] venner6 = new Kontakt[7];
		for (int i = 0; i < venner6.length; i++) {
			venner6[i] = venner[i];
		}

		// Utskrift av data
		System.out.println("\n Originale data ");
		for (int i = 0; i < venner.length; i++) {
			System.out.println(venner[i]);
		}
		/* Lineær søking i usortert tabell , venner */
		/* Lineærsøking som returnerer sann eller usann */
		Kontakt kontakt1 = venner[2];
		Kontakt kontakt2 = new Kontakt("Ole", "Olsen", "55555555");
		Kontakt resultat = null;

		System.out.println("\nUtskrift fra  linearSok som returnerer resultat eller null ");

		resultat = SorteringOgSoking.sok(venner, 0, venner.length - 1, kontakt1);

		if (resultat != null) {
			System.out.print(kontakt1);
			System.out.println(" er med");
		} else {
			System.out.print(kontakt1);
			System.out.println(" er ikke med");
		}

		resultat = SorteringOgSoking.sok(venner, 0, venner.length - 1, kontakt2);

		if (resultat != null) {
			System.out.print(kontakt2);
			System.out.println(" er med");
		} else {
			System.out.print(kontakt2);
			System.out.println(" er ikke med");
		}

	}// main
}// class
