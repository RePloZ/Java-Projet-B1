package Projet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Voiture {
    //Variables
    private String nameCar;
    private String marqueCar;
    private String immatriculationCar;
    private Date entree;
    private Date sortie;
    private int positionX;
    private int positionY;

    //constructeur
    public Voiture(String pNameCar, String pMarqueCar, String pImmatriculationCar) {
        this.nameCar = pNameCar;
        this.marqueCar = pMarqueCar;
        this.entree = new Date();
        this.immatriculationCar = pImmatriculationCar;
    }

    //Fonction qui renvoie la date d'entrÃ©e
    public Date getEntree() {
        return entree;
    }

    //fonction qui renvoie la sortie
    public Date getSortie() {
        return sortie;
    }

    //fonction qui renvoie la position verticale
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    //fonction qui renvoie la position horizontale
    public int getPositionY() {
        return positionY;
    }
    //fonction qui rÃ©cupÃ¨re la date de sortie

    public void garer() {
        Scanner parametre = new Scanner(System.in);
        if (Parking.getPlaceRestante() > 0 && Parking.getParking(positionX,positionY) == false) {
            System.out.println("Quelle est la position X du parking ?");
            setPositionX(parametre.nextInt());
            System.out.println("Quelle est la position Y du parking ?");
            setPositionY(parametre.nextInt());
            Parking.setParking(positionX, positionY, false);
            Parking.setPlaceRestante(Parking.getPlaceRestante() - 1);
        } else {
            System.out.println("La place est prise a cet emplacement");
        }
    }

    public void quitterParking() {
        payer();
        System.out.println("La voiture " + this.nameCar + " quitte le parking!");
        Parking.setParking(this.positionX, this.positionY, true);
    }


    // obtenir le temps écoulé
    //paiement
    public void payer() {
        sortie = new Date();
        SimpleDateFormat heure = new SimpleDateFormat("H");
        SimpleDateFormat minute = new SimpleDateFormat("mm");
        String heureEntree = heure.format(entree);
        String heureSortie = heure.format(sortie);
        String minuteEntree = minute.format(entree);
        String minuteSortie = minute.format(sortie);
        int heureEcoulee = Integer.parseInt(heureEntree) - Integer.parseInt(heureSortie);
        int minuteEcoulee = Integer.parseInt(minuteEntree) - Integer.parseInt(minuteSortie);

        if (minuteEcoulee>0) {
            heureEcoulee++;
        }
        int montant = heureEcoulee * 5;
        System.out.println("le montant à payer est :" + montant);
    }
}