package Projet;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Voiture maVoiture = new Voiture("Cabriolet", "Wolkswagen", 7, 9);
		Date sortie = new Date();
		maVoiture.setSortie(sortie);
		maVoiture.payer();
	}

}