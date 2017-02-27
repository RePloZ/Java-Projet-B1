package Projet;

import java.util.Date;

public class Voiture {
    private String nameCar;
    private String marqueCar;
    private String immatriculationCar;
    private Date entree;
    private Date sortie;
    private int positionX;
    private int positionY;

    public Voiture(String pNameCar, String pMarqueCar, String pImmatriculationCar, int pPositionX, int pPositionY){
        this.nameCar = pNameCar;
        this.marqueCar = pMarqueCar;
        this.entree = new Date();
        this.positionX = pPositionX;
        this.positionY = pPositionY;
    }

    public Date getEntree() {
        return entree;
    }
    public Date getSortie() {
        return sortie;
    }
    public String getImmatriculationCar() {
        return immatriculationCar;
    }
    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }

    public void setSortie(Date sortie) {
        this.sortie = sortie;
    }
    public void garer(Object Voiture, int positionX, int positionY){
    	setParking(positionX, postionY, Voiture);
    }

}
