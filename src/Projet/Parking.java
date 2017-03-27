package Projet;

public class Parking {
    private static Object parking[][] = new Object[22][22];
    private static int placeRestante = 0;

    public static void setParking(int pPositionX, int pPositionY, Object Voiture) {
        parking[pPositionX][pPositionY] = Voiture;
    }
    public static int getPlaceRestante() {
        return placeRestante;
    }
    public static Object getParking(int pPositionX, int pPositionY){
        return parking[pPositionX][pPositionY];
    }
    public static void setPlaceRestante(int pPlaceRestante) {
        placeRestante = pPlaceRestante;
    }
}