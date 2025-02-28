package com.nom.projet.combat;

public class Assassin extends Personnage{

    /*
     * ATTRIBUTS
     */
    private int bonusAttaque;

    /*
     * CONSTRUCTORS
     */
    public Assassin() {}

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    /*
     * GETTERS AND SETTERS
     */
    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    @Override
    public Personnage Attaque(Personnage cible){
        if(Math.random() >= 0.05){
            cible.setVie(cible.getVie()-(this.getAttaque()-cible.getDefense()));
        }else{
            cible.setVie(cible.getVie()-(this.getAttaque()+this.getBonusAttaque()-cible.getDefense()));
        }
        return cible;
    }
}
