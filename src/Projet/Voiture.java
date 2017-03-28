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
    //fonction qui renvoie la date d'entrée
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
    //fonction qui rï¿½cupï¿½re la date de sortie
    public void setSortie(Date sortie) {
        this.sortie = sortie;
    }
    //Place Disponible
    public void placeDisponible(Object Voiture, int positionX, int positionY){}
   
    public int payer(Date entree, Date sortie) {
    	int duree= Date sortie - Date entree;
    	
    }
    
    public void garer(Object Voiture, int pPositionX,int pPositionY){

    	if (Parking.getPlaceRestante()>0 && Parking.getParking(pPositionX,pPositionX) == null){
    		Parking.setParking(pPositionX, pPositionY, Voiture);
    		Parking.setplaceRestante(Parking.getplaceRestante()-1);
        }
    	else {
    		System.out.println("La place est prise a cette emplacement");
    	}
    }
    public void quitterParking(){
    	payer();
    	System.out.println("La voiture" + this.nameCar + "quitte le parking!");
    	Parking.setParking(this.positionX, this.positionY, '\0');
    }
}