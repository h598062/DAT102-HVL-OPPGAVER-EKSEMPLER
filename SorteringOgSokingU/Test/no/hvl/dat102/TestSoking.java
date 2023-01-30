package no.hvl.dat102;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class TestSoking {

	private final Integer[] tab = { 7, 14, 17, 3, 12, 17, 6, 10, 14, 11 };
	private final Integer[] tab2 = { 5 };
	private final Integer[] tab3 = {};
	private final Integer[] tab4 = null;

	
		// Test for forste element - bruk tab
	
		// Test for siste element - bruk tab
		
		// Test for element i midten - bruk tab
			
		// Test for at element ikke fins -bruk tab
			
		// Test for duplikater - bruk tab
		
		// Test for at et element fins - bruk tab
		
	
		// Test på tabell av lengde 1 og teste at et element ikke fins - bruk tab2
	
        // test på tabell av lengde 1 og teste at et element fins - bruk tab2
	
		// Test for en tom tabell - bruk tab3
		

	@Test
	public void nullTabell() {
		// Test for en null-tabell
		assertThrows(NullPointerException.class, () -> SorteringOgSoking.sok(tab4, 0, tab4.length - 1, 1));
	}
}
