package Projet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner parametre = new Scanner(System.in);
    private static ArrayList<Voiture> NomVoiture = new ArrayList<>();

    public static void main(String[] args) {
        Fenetre fen = new Fenetre();
        Parking.initialiseTableau();
        int choixJoueur;
        boolean recommencer = true;
        while (recommencer) {
            System.out.println("Menu des actions :" +
                    "\n 1 - Entrer une voiture dans le parking" +
                    "\n 2 - Faire sortir une voiture du parking" +
                    "\n 3 - Observer toutes les voitures du parking" +
                    "\n 4 - Rechercher une voiture selon son nom" +
                    "\n 5 - Rechercher une voiture selon sa position" +
                    "\n 6 - Quitter le programme");
            choixJoueur = parametre.nextInt();
            switch (choixJoueur) {
                case 1:
                    entrerdansleparking();
                    fen.miseajour();
                    break;
                case 2:
                    quitterleparking();
                    fen.miseajour();
                    break;
                case 3:
                    voirToutesLesVoitures();
                    break;
                case 4:
                    voirVoitureSelonNom();
                    break;
                case 5:
                    voirVoitureSelonPosition();
                    break;
                case 6:
                    recommencer = false;
                    break;
                default:
                    System.out.println("Nombre incorrecte, veuillez choisir un autre nombre." +
                            "\n Attention, votre choix ne peut être compris qu'entre 1 et 6");

            }
        }
    }

    //Fonction principale qui gère l'entrée dans le parking
    public static void entrerdansleparking() {
        String nameCar, marqueCar, immatriculation;
        do {
            System.out.println("Choisissez le nom pour la voiture");
            nameCar = parametre.nextLine();
        }while(nameCar.equals(""));
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

    //Fonction principale qui permet de voir toutes les voitures
    public static void voirToutesLesVoitures() {
        for (Voiture objet : NomVoiture) {
            System.out.println("Nom de la voiture : " + objet.getNameCar() +
                    "\nNom de la marque : " + objet.getMarqueCar() +
                    "\nDate complete d'entrée dans le Parking : " + objet.getEntree() +
                    "\nPosition X de la voiture" + objet.getPositionX() +
                    "\nPosition Y de la voiture" + objet.getPositionY());
        }
    }

    //Fonction principale qui permet de rechercher une voiture selon son nom.
    public static void voirVoitureSelonNom() {
        System.out.println("Ecrivez le nom de votre voiture");
        String nameCar = parametre.nextLine();
        boolean ok = false;
        for (Voiture objet : NomVoiture) {
            if (objet.getNameCar().equals(nameCar)) {
                System.out.println("Nom de la voiture : " + objet.getNameCar() +
                        "\nNom de la marque : " + objet.getMarqueCar() +
                        "\nDate complete d'entrée dans le Parking : " + objet.getEntree() +
                        "\nPosition X de la voiture" + objet.getPositionX() +
                        "\nPosition Y de la voiture" + objet.getPositionY());
                ok = true;
            }
        }
        if (!ok) {
            System.out.println("Nous n'avons trouvez aucune voiture à ce nom.\nVeuillez Reessayer.");
        }
    }

    public static void voirVoitureSelonPosition() {
        boolean ok = false;
        System.out.println("Quelle est la position X du vehicule ?");
        int positionX = parametre.nextInt();
        System.out.println("Quelle est la position Y du vehicule ?");
        int positionY = parametre.nextInt();
        for (Voiture objet : NomVoiture) {
            if (objet.getPositionY() == positionY && objet.getPositionX() == positionX) {
                System.out.println("Nom de la voiture : " + objet.getNameCar() +
                        "\nNom de la marque : " + objet.getMarqueCar() +
                        "\nDate complete d'entrée dans le Parking : " + objet.getEntree() +
                        "\nPosition X de la voiture" + objet.getPositionX() +
                        "\nPosition Y de la voiture" + objet.getPositionY());
            }
            ok = true;
        }
        if (!ok) {
            System.out.println("Nous n'avons trouvez aucune voiture à ce nom.\nVeuillez Reessayer.");
        }
    }

    //TODO Suppression automatique d'objet
    public static void quitterleparking() {
        boolean ok = false;
        System.out.println("Donner le nom de la voiture");
        String nomVoiture = parametre.nextLine();
        System.out.println("Donner la position X de votre voiture");
        int positionX = parametre.nextInt();
        System.out.println("Donner la position Y de votre voiture");
        int positionY = parametre.nextInt();
        for (Voiture objet : NomVoiture) {
            if (objet.getPositionX() == positionX && objet.getPositionY() == positionY && objet.getNameCar().equals(nomVoiture)) {
                objet.payer();
                Parking.setParking(objet.getPositionX(), objet.getPositionY(), false);
                ok = true;
                break;
            }
        }
        if (!ok) {
            System.out.println("Aucune voiture n'a été trouvé à cette emplacement");
        }
    }
}
