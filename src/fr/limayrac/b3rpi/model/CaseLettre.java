package fr.limayrac.b3rpi.model;

public class CaseLettre {
    private char libelle;

    public CaseLettre(char lib, int nb_mot) {
        this.libelle = lib;
    }

    //recupere la lettre sur la case
    public char getLibelle() {
        return this.libelle;
    }

}
