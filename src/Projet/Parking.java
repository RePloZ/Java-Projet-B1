package Projet;

public class Parking {
    private Object parking[][] = new Object[22][22];
    private int placeRestante = 0;

    public static void setParking(int pPositionX, int pPositionY, object Voiture) {
        this.parking[pPositionX][pPositionY] = object;
    }
    public int getPlaceRestante() {
        return placeRestante;
    }
    public void setPlaceRestante(int placeRestante) {
        this.placeRestante = placeRestante;
    }
}