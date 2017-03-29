package Projet;

public class Parking {
    //soit il y a une voiture soit il n'y a pas de voiture
	private static boolean parking[][] = new boolean[22][22];
   
	private static int placeRestante = 0;

    public static void initialiseTableau(){
        for (int i=0; i<=21; i++){
            for (int j=0; j<=21; j++){
                setParking(i,j,false);
            }
        }
    }
    public static void setParking(int pPositionX, int pPositionY, boolean pVoiture) {
        parking[pPositionX][pPositionY] = pVoiture;
    }
    //r�cup�rer la position de la voiture
    public static boolean getParking(int pPositionX, int pPositionY){
        return parking[pPositionX][pPositionY];
    }
    //recuperer les places restantes
    public static int getPlaceRestante() {
        return placeRestante;
    }
    //modifier les places restantes
    public static void setPlaceRestante(int pPlaceRestante) {
        placeRestante = pPlaceRestante;
    }
    public static int combienVoiture(){
        int nombreVoiture = 0;
        for (int i=0; i<=21; i++){
            for (int j=0; j<=21; j++){
                if (getParking(i, j)){
                    nombreVoiture++;
                }
            }
        }
        return nombreVoiture;
    }
}