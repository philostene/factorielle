package co.simplon.factorielle;
 
/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) {
    	
    		if (n > 1) {
    			
    			long res = n * calculer(n-1);
    			
    			return res;
    		} else if (n < 0) {
    			throw new IllegalArgumentException();
    		
   		} else if (n == 0L)     			return 1;
    	
    		return n;
    }

}