package Projet;

import com.sun.javaws.ui.CacheViewDialog;

public class Parking {
    String Name;
    int maxPlaces;
    int placeVide;
    int placeOccupe;
    int placeHandicape;

    public void Parking(String Name, int maxPlaces, int placeVide, int placeOccupe, int placeHandicape){
        this.Name = Name;
        this.maxPlaces = maxPlaces;
        this.placeVide = placeVide;
        this.placeOccupe = placeOccupe;
        this.placeHandicape = placeHandicape;
    }

    public void afficherinfo(){
        //Afficher les place restantes et les places vides
    }
    public int parkingplain(){
        //Si le parking est plein, enlever la voiture qui vient de se mettre et mettre un message d'erreur.
    }
    public void voitureRestante(){
        //Afficher le nombre de voiture restante
    }
    public void placeOccupe(){
        //Afficher le nombre de place occupé
    }
}