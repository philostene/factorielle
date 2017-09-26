package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class factorielleTest {

	@Test
	public void test() {
		//given
		long nbr = 1;
		long res = 1;
		//when
		 Factorielle fac = new Factorielle();
		 res = 4;
		//then
		assertEquals(res,fac.calculer(nbr));
		
	//	fail("Not yet implemented");
	}

}
