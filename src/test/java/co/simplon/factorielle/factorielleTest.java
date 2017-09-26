package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class factorielleTest {

	@Test
	public void test() {
		//given
		long nbr = 0;
		long res = 1;
		//when
		 Factorielle fac = new Factorielle();
		
		//then
		//assertEquals(res,fac.calculer(nbr));
		
		for (long i = 0; i <20;i++){
			if (i == 0) {res = 1;}
			else {res= res*i;}
			assertEquals("toto "+i,res,fac.calculer(i));
		}
		
	//	fail("Not yet implemented");
	}

}
