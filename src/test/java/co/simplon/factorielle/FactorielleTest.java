package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class FactorielleTest {

	public long calculer(long nbr){
		long res =0;
		 Factorielle fac = new Factorielle();
		 res = fac.calculer(nbr);
		return res;
	}
	
	 public static String getMethodeFullName()
	  {
	          Throwable t = new Throwable();
	          t.fillInStackTrace();
	          StackTraceElement e = t.getStackTrace()[1];
	          String className = e.getClassName();
	          String functionName = e.getMethodName();
	          return functionName;
	  //        return className + "." + functionName;
	  }
	
	@Test (expected = IllegalArgumentException.class)
	public void factorielle_0_egal_moins_1() {
		//given
		long nbr = -1;  //fact(nbr)
	//	long res = 1;  //résultat attendu
		long resCalcule;
		//when
		 
		 resCalcule = calculer(nbr);
		 
		//then
		// assertEquals(res,resCalcule);
		// assertTrue(res == resCalcule);
	}
	
	@Test
	public void factorielle_0_egal_1() {
		//given
		long nbr = 0;  //fact(nbr)
		long res = 1;  //résultat attendu
		long resCalcule;
		//when
		 
		 resCalcule = calculer(nbr);
		 
		//then
		// assertEquals(res,resCalcule);
		 assertTrue(res == resCalcule);
	}
	
	@Test @Ignore
	public void factorielle_1_egal_1() {
		//given
				long nbr = 1;  //fact(nbr)
				long res = 1;  //résultat attendu
				long resCalcule;
				//when
				resCalcule = calculer(nbr);
				//then
			//	 assertEquals(res,resCalcule);
				 assertTrue(res == resCalcule);
				 
	}
	
	@Test
	public void factorielle_3_egal_6() {
		//given
				long nbr = 1;  //fact(nbr)
				long res = 1;  //résultat attendu
				long resCalcule;
				//when
				resCalcule = calculer(nbr);
				 
				//then
			//	 assertEquals(res,resCalcule);
				 assertTrue(res == resCalcule);
	}
	@Test 
	public void factorielle_2_pas_egal_2() {
		//given
				long nbr = 2;  //fact(nbr)
				long res = 10;  //résultat attendu
				long resCalcule;
				//when
				resCalcule = calculer(nbr);
				//then
			//	 assertEquals(res,resCalcule);
				fail("la diff est toto " + (resCalcule - res));
				assertTrue("la diff est de " + (resCalcule - res),res == resCalcule);
				 
				 ;
	}
	@Test
	public void factorielle_3_pas_egal_6() {
		//given
				long nbr = 3;  //fact(nbr)
				long res = 7;  //résultat attendu
				long resCalcule;
				//when
				resCalcule = calculer(nbr);
				 
				//then
			//	 assertEquals(res,resCalcule);
				 assertTrue(res == resCalcule);
	}

//	@Test (timeout = 1000000)
	@Test
	public void timoutFactoriel_100_passes() {
		//given
		
				long nbr = 19;  //fact(nbr)
				long res = 1;  //résultat attendu
				long resCalcule =0;
				//when
				Duration dureExec = new Duration();
	
				for (long i=0;i<1L;i++){
					resCalcule = calculer(nbr);
				};
				
				dureExec.duree(getMethodeFullName());
			
				
				 assertTrue(res == resCalcule);
					
				 
	}
}
