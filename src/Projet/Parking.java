package Projet;

public class Parking {
    private Object parking[][] = new Object[22][22];
    private int placeRestante = 0;

    public void setParking(Object[][] parking) {
        this.parking = parking;
    }
    public int getPlaceRestante() {
        return placeRestante;
    }
    public void setPlaceRestante(int placeRestante) {
        this.placeRestante = placeRestante;
    }
}