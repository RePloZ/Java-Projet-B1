package Projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Voiture> NomVoiture = new ArrayList<>();
    public static void main(String[] args) {
        Fenetre fen = new Fenetre();;
        Parking.initialiseTableau();
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

            } while (!(choixJoueur>0 && choixJoueur<4));
            switch (choixJoueur) {
                case 1:
                    entrerdansleparking();
                    fen.miseajour();
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
        Voiture nine = new Voiture(nameCar, marqueCar);
        nine.garer();
        NomVoiture.add(nine);
        //NomVoiture.contains(nine.getSortie());
        //appel de la fonction qui donne le nombre de voiture actuellement dans le Parking
        //que tu stock dans une variable (nombreVoiture)
        // puis quand tu créé, tu nommes ta voiture dans un String = "voiture" + nombreVoiture;
    }
    //TODO Suppression automatique d'objet
    public static void quitterleparking(){
        boolean ok = false;
        Scanner parametre = new Scanner(System.in);
        System.out.println("Donner le nom de la voiture");
        String nomVoiture = parametre.nextLine();
        System.out.println("Donner la position X de votre voiture");
        int positionX = parametre.nextInt();
        System.out.println("Donner la position Y de votre voiture");
        int positionY = parametre.nextInt();
        for (Voiture objet:NomVoiture) {
            if(objet.getPositionX()==positionX && objet.getPositionY()==positionY && objet.getNameCar().equals(nomVoiture)){
                Parking.setParking(objet.getPositionX(), objet.getPositionY(), false);
                ok = true;
                break;
            }
        }
        if (!ok){
            System.out.println("Aucune voiture n'a été trouvé à cette emplacement");
        }
    }
}
