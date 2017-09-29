package co.simplon.factorielle;

public class Duration {

	private double debut;
	private double fin;
	private double ecart;
	
	
	
	Duration(){
		debut = System.currentTimeMillis();
	}

    public double duree(){
    	fin = System.currentTimeMillis();
    	return fin - debut;
    }

	public double getDebut() {
		return debut;
	}



	public void setDebut(double debut) {
		this.debut = debut;
	}



	public double getFin() {
		return fin;
	}



	public void setFin(double fin) {
		this.fin = fin;
	}



	public double getEcart() {
		return ecart;
	}



	public void setEcart(double ecart) {
		this.ecart = ecart;
	};
	
	
	
}
