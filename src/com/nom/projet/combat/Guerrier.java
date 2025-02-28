package com.nom.projet.combat;

public class Guerrier extends Personnage{
    /*
     * ATTRIBUTS
     */
    private int bonusDefense;

    /*
     * CONSTRUCTORS
     */
    public Guerrier(int bonusDefense) {}

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    /*
     * GETTERS AND SETTERS
     */
    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    @Override
    public Personnage Attaque(Personnage cible){
        if(Math.random() >= 0.05){
            cible.setVie(cible.getVie()-(this.getAttaque()-cible.getDefense()));
        }else{
            cible.setVie(cible.getVie()-(this.getAttaque()-cible.getDefense()));
            this.setVie(this.getVie()+this.getBonusDefense());
        }
        return cible;
    }
}
