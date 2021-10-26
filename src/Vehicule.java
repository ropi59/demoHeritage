
public class Vehicule {

	private String marque;
	private String couleur;
	
	public Vehicule() {
		
	}
	
	public Vehicule(String marque, String couleur) {
		this.marque = marque;
		this.couleur = couleur;
	}


	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void seDeplace() {
		System.out.println("Le vehicule se deplace");
	}
	
	public void klaxon() {
		System.out.println("Le vehicule Klaxonne");
	}

	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ", couleur=" + couleur + "]";
	}
	
}
