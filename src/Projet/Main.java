package Projet;

public class Main {
	public static void main(String[] args) {
		Voiture maVoiture = new Voiture("Cabriolet", "Wolkswagen", 7, 9);
		maVoiture.setSortie(new Date);
		maVoiture.payer();
	}

}