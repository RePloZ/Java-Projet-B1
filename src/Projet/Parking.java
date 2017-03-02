package Projet;

public class Parking {
    private Object parking[][] = new Object[22][22];
    private int placeRestante = 0;

    public void setParking(int pPositionX, int pPositionY, Object Voiture) {
        this.parking[pPositionX][pPositionY] = Voiture;
    }
    public static int getPlaceRestante() {
        return placeRestante;
    }
    public void setPlaceRestante(int placeRestante) {
        this.placeRestante = placeRestante;
    }
}