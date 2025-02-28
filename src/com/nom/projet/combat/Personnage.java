package com.nom.projet.combat;

public class Personnage {
    /*
     * ATTRIBUTS
     */
    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    /*
     * CONSTRUCTOR
     */
    public Personnage() {}

    public Personnage(String nom, int vie, int attaque, int defense) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }

    /*
     * GETTERS AND SETTERS
     */

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Personnage Attaque(Personnage cible){
        cible.setVie(cible.getVie()-(this.getAttaque()-cible.getDefense()));

        return cible;
    }
}
