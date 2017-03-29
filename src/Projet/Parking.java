package Projet;

public class Parking {
    private static Object parking[][] = new char[22][22];
    private static int placeRestante = 0;

    public static void setParking(int pPositionX, int pPositionY, char Voiture) {
        parking[pPositionX][pPositionY] = Voiture;
    }
    public int getPlaceRestante() {
        return this.placeRestante;
    }
    public void setPlaceRestante(int placeRestante) {
        this.placeRestante = placeRestante;
    }
}