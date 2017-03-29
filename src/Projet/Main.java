package Projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<String> NomVoiture = new ArrayList<>();
    public static void main(String[] args) {
        Fenetre fen = new Fenetre();
        /*TODO		 Boucle qui va se repeter tant que le jeu n'est pas terminer
		TODO Demander à l'utilisateur si il veut :
		    * TODO - Entrer une voiture dans le parking;
		    * TODO - Faire sortir une voiture dans le parking;
		    * TODO - Quitter le programme;
		*/
        Scanner parametre = new Scanner(System.in);
        int choixJoueur;
        boolean recommencer = true;
        while (recommencer) {
            do {
                System.out.println("Demander à l'uilisateur si il veut :" +
                        "\n 1 - Entrer une voiture dans le parking" +
                        "\n 2 - Faire sortir une voiture du parking" +
                        "\n 3 - Quitter le programme" +
                        "\n Attention, votre choix ne peut être compris qu'entre 1 et 3");
                choixJoueur = parametre.nextInt();
            } while (choixJoueur>0 && choixJoueur<4);
            switch (choixJoueur) {
                case 1:
                    entrerdansleparking();
                    break;
                case 2:
                    break;
                case 3:
                    recommencer = false;
                    break;
            }
        }
    }

    //TODO Création automatique d'objet
    public static void entrerdansleparking() {
        String nameCar ,marqueCar, immatriculation;
        Scanner parametre = new Scanner(System.in);
        System.out.println("Choisissez le nom pour la voiture");
        nameCar = parametre.nextLine();
        System.out.println("Ecrivez la marque de la voiture");
        marqueCar = parametre.nextLine();
        System.out.println("Ecrivez l'immatriculation de la voiture");
        immatriculation = parametre.nextLine();
        Voiture blabla = new Voiture(nameCar, marqueCar, immatriculation);
    }
    //TODO Suppression automatique d'objet
    public static void quitterleparking(){

    }
}
