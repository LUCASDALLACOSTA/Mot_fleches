package fr.limayrac.b3rpi.model;

public class Case {

    public Coordonnee coordonnee;

    public Case(Coordonnee coordonnee) {}
    public int x;
    public int y;

    //initialise la case avec les coordonnes
    public void setCase(int x, int y) {
        this.coordonnee = new Coordonnee(x, y);
    }

    //recupere la position x de la case
    public int getx() {
        return this.x;
    }

    //recupere la position y de la case
    public int gety() {
        return this.y;
    }

}
