package no.hvl.dat102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

/**
 * Tester Karakter.
 * 
 * @Ole Olsen
 */
public class KarakterTest {

	@Test
	public void er100enA() {
		assertEquals('A', Karakter.beregnKarakter(100), "feil karakter");
	}

	@Test
	public void er95enA()  {
		assertEquals('A', Karakter.beregnKarakter(95), "feil karakter");
	}

	@Test
	public void er90enA()  {
		assertEquals('A', Karakter.beregnKarakter(90), "feil karakter");
	}

	@Test
	public void er89enB()  {
		assertEquals('B', Karakter.beregnKarakter(89), "feil karakter");
	}

	@Test
	public void er82enB() {
		assertEquals('B', Karakter.beregnKarakter(82), "feil karakter");
	}

	@Test
	public void er80enB()  {
		assertEquals('B', Karakter.beregnKarakter(80), "feil karakter");
	}

	@Test
	public void er79enC() {
		assertEquals('C', Karakter.beregnKarakter(79), "feil karakter");
	}

	@Test
	public void er66enC() {
		assertEquals('C', Karakter.beregnKarakter(66), "feil karakter");
	}

	@Test
	public void er60enC()  {
		assertEquals('C', Karakter.beregnKarakter(60), "feil karakter");
	}

	@Test
	public void er59enD()  {
		assertEquals('D', Karakter.beregnKarakter(59), "feil karakter");
	}

	@Test
	public void er54enD()  {
		assertEquals('D', Karakter.beregnKarakter(54), "feil karakter");
	}

	@Test
	public void er50enD()  {
		assertEquals('D', Karakter.beregnKarakter(50), "feil karakter");
	}

	@Test
	public void er49enE(){
		assertEquals('E', Karakter.beregnKarakter(49), "feil karakter");
	}

	@Test
	public void er45enE() {
		assertEquals('E', Karakter.beregnKarakter(45), "feil karakter");
	}

	@Test
	public void er40enE()  {
		assertEquals('E', Karakter.beregnKarakter(40), "feil karakter");
	}

	@Test
	public void er39enF()  {
		assertEquals('F', Karakter.beregnKarakter(39), "feil karakter");
	}

	@Test
	public void er37enF()  {
		assertEquals('F', Karakter.beregnKarakter(37), "feil karakter");
	}

	@Test
	public void er0enF() {
		assertEquals('F', Karakter.beregnKarakter(0), "feil karakter");
	}

	// Forventer at metoden skal kaste unntaket for at testen skal v�re riktig.
	@Test
	public void er101ulovlig() {
		assertThrows(FeilKarakterException.class, () -> Karakter.beregnKarakter(101));
	}

	// ... Samme her
	@Test
	public void erNegativUlovlig() {
		assertThrows(FeilKarakterException.class, () -> Karakter.beregnKarakter(-1));
	}

}
