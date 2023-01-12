package no.hvl.dat102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Eks modifisert fra Mughals bok Java som første programmeringsspråk 
public class BagKlient {
	static final String SENSUR = "SLADDET";
	static String ord[] = { "Java", "er", "gøy", "moro", "og", "kult", "mest", "gøy" };

	public static void main(String[] args) {

		//Alt: List<String> = new ArrayList<>();		
		List<String> ordliste = new LinkedList<>();
		for (int i = 0; i < ord.length; i++) {
			ordliste.add(ord[i]);
		}
		System.out.println("Opprinnelig ordliste: " + ordliste);

		// Opprett en liste med ord som skal sladdes
		// Alt: List<String> sladdeteOrd = new ArrayList<>();
		List<String> sladdeteOrd = new LinkedList<>();
		sladdeteOrd.add("gøy");
		sladdeteOrd.add("kult");
		sladdeteOrd.add("morsom"); 

		// Sladd ord i ordlisten 

		for (String element : ordliste) {
			if (sladdeteOrd.contains(element)) {
				int indeks = ordliste.indexOf(element);
				ordliste.set(indeks, SENSUR);
			}
		}
		// Utskrift
		System.out.println("Sladdet ordliste: " + ordliste.toString());
	}

}
