package Projet;

public class Voiture extends Parking {
    String name;
    int temps;
    int tarif;

    public void Voirue(String name, int temps) {
        this.name = name;
        this.temps = temps;
    }
    public void entrerParking(){
        //Ajouter une voiture, vérifier si le parking est plain (on appelera la fonction parking plein)
        this.placeOccupe++;
        this.placeVide--;
    }
    public int payer(){
      //Faire payer le client selon le temps où il est resté
        return this.temps * this.tarif;
    }
}
