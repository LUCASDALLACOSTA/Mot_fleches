package fr.limayrac.b3rpi.model;


public class Grille {
    private int hauteur;
    private int largeur;
    private Case[][] CaseGrille;
    private Object grille;

    //initialise la Grille
    public Grille(int h, int l) {
        this.hauteur = h;
        this.largeur = l;
        initGrille();
    }

    //place les cases dans la grille
    private void initGrille() {
        for (int x = 0; x < hauteur; x++) {
            for (int y = 0; y < largeur; y++) {
                CaseGrille[x][y] = new Case(new Coordonnee(x, y));
            }
        }
    }

    //recupere la hauteur de la grille
    public int getHauteur() {
        return this.hauteur;
    }

    //recupere la largeur de la grille
    public int getLargeur() {
        return this.largeur;
    }

    public Object getGrille() {
        return this.grille;
    }
}
