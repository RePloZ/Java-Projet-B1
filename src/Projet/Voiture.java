package Projet;

import java.util.Date;

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
    public Voiture(String pNameCar, String pMarqueCar, String pImmatriculationCar, int pPositionX, int pPositionY){
        this.nameCar = pNameCar;
        this.marqueCar = pMarqueCar;
        this.entree = new Date();
        this.positionX = pPositionX;
        this.positionY = pPositionY;
    }
    //fonction qui renvoie l'entr�e
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
    //fonction qui renvoie la position horizontale
    public int getPositionY() {
        return positionY;
    }
    //fonction qui r�cup�re la date de sortie
    public void setSortie(Date sortie) {
        this.sortie = sortie;
    }
<<<<<<< Updated upstream
    //Place Disponible
    public void placeDisponible(Object Voiture, int positionX, int positionY){
=======
    
    public int Payer(Date entree, Date sortie) {
    	int duree= Date sortie - Date entree;
    	
    }
    public void garer(Object Voiture, int positionX, int positionY){
>>>>>>> Stashed changes
    	if (PlaceRestante>0){    	
    		setParking(positionX, postionY, Voiture);
        }
    	else {
    		System.out.println("Il n'y a plus de place");
    	}
    }
   

}
>>>>>>> Stashed changes
