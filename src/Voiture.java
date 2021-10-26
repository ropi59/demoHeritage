
public class Voiture  extends Vehicule{

	private boolean volant;
	
	public Voiture() {
		super();
	}
	
	public Voiture(String marque, String modele, boolean volant) {
		super(marque, modele);
		this.volant = volant;
		
	}
	
	public void seDeplace() {
		System.out.println("La voiture roule");
	}
	public void klaxon() {
		super.klaxon();
		System.out.println("La voiture fait pouet pouet");
	}
}
