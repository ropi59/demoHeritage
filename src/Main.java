
public class Main {

	public static void main(String[] args) {

		Vehicule v1 = new Vehicule("Peugeot", "Bleue");
		System.out.println(v1);
		
		Voiture v2 = new Voiture();
		System.out.println(v2);
		
		v1.klaxon();
		v2.klaxon();
	}

}
