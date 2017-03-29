package Projet;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Voiture {
    //Variables
    private String nameCar;
    private String marqueCar;
    private Date entree;
    private Date sortie;
    private int positionX;
    private int positionY;

    //constructeur
    public Voiture(String pNameCar, String pMarqueCar) {
        this.nameCar = pNameCar;
        this.marqueCar = pMarqueCar;
        this.entree = new Date();
    }
    //Fonction qui renvoie la marque de la voiture
    public String getMarqueCar() {
        return marqueCar;
    }
    //Fonction qui renvoie la date d'entrée
    public Date getEntree() {
        return entree;
    }
    //Fonction qui récupère le nom de la voiture
    public String getNameCar(){
        return this.nameCar;
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
    //fonction qui récupère la date de sortie

    public void garer() {
        boolean ok = false;
        Scanner parametre = new Scanner(System.in);
        while (!ok){
            if (Parking.combienVoiture() < 22*22) {
                System.out.println("Quelle est la position X du parking ?");
                setPositionX(parametre.nextInt());
                System.out.println("Quelle est la position Y du parking ?");
                setPositionY(parametre.nextInt());
                if (!Parking.getParking(positionX, positionY)){
                    ok=true;
                    Parking.setParking(positionX, positionY, true);
                    Parking.setPlaceRestante(Parking.getPlaceRestante() - 1);
                } else {
                    System.out.println("La place est prise a cet emplacement");
                }
            } else {
                ok=true;
                System.out.println("Il n'y a plus de place");
            }
        }
    }

    public void quitterParking() {
        payer();
        System.out.println("La voiture " + this.nameCar + " quitte le parking!");
        Parking.setParking(this.positionX, this.positionY, true);
    }
    // obtenir le temps �coul�
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
        if (montant==0){
            System.out.println("Vous êtes restés moins d'une minute, c'es gratuit !");
        }
        System.out.println("le montant � payer est :" + montant);
    }
}