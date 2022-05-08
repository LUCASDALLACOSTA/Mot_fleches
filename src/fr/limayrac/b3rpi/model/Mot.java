package fr.limayrac.b3rpi.model;

public class Mot {

    private String mot;
    private boolean isVertical;
    private Coordonnee coordonneeDepartMot;

    //permet de placer le mot dans la grille grace à la coordonnee de départ et la direction
    public Mot(String mot, Coordonnee coordonneeDepartMot, boolean isVertical) {
        this.mot = mot;
        this.coordonneeDepartMot = coordonneeDepartMot;
        this.isVertical = isVertical;
    }

    //recuepere la coordonne de depart du mot
    public Coordonnee getCoordonneeDepartMot() {
        return this.coordonneeDepartMot;
    }

}
