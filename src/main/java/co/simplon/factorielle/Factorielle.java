package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factorielle
 */
public class Factorielle 
{
	static Logger LOGGER =  (Logger) LoggerFactory.getLogger(Factorielle.class);
	public Factorielle() {
		super();
	}

	public long calculer(long n) {
		
		LOGGER.info("Msg #1");
		LOGGER.warn("Msg #2");
		LOGGER.error("Msg #3");
		LOGGER.debug("Msg #4");
		LOGGER.trace("MSG TRACE");

		LOGGER.info("calculer() je suis dans la boucle "+ n);
		
		if (n > 1) {

			long res = n * calculer(n-1);

			return res;
		} else if (n < 0) {
			LOGGER.debug("n<0 "+ n);
			throw new IllegalArgumentException();

		} else if (n == 0L)     			return 1;

		return n;
	}

}