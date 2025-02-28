package com.nom.projet.combat;

public class Partie {
    /*
     * ATTRIBUTS
     */
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    /*
     * CONSTRUCTORS
     */
    public Partie() {}

    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }

    /*
     * GETTERS AND SETTERS
     */
    public Personnage getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Personnage joueur1) {
        this.joueur1 = joueur1;
    }

    public Personnage getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Personnage joueur2) {
        this.joueur2 = joueur2;
    }

    public int getNbrTour() {
        return nbrTour;
    }

    public void setNbrTour(int nbrTour) {
        this.nbrTour = nbrTour;
    }

    /*
    traitement suivant :
répéter les actions suivantes à chaque tour (tant que nbrTour est plus grand que 0):
Lancer l’attaque du j1 -> j2,
Lancer l’attaque du j2 -> j1,
Décrémenter le nbrTour (-1 à chaque tour),
Tester si le joueur 1 a gagné (arrête la partie),
Tester si le joueur 2 a gagné (arrête la partie),
Condition de victoire :
A l’issu du nbr de tour si le joueur 1 à ces points de vie à 0 ou moins le joueur 2 gagne,
A l’issu du nbr de tour si le joueur 2 à ces points de vie à 0 ou moins le joueur 1 gagne,
Condition d’égalité :
Si à la fin du nombre de tour les 2 joueurs ont leurs points de vie respectifs supérieurs à 0, il y à égalité.
Affiche en sortie au format String :
Le gagnant avec son nom, ou égalité.

     */

    public void lancerPartie(){
        while(nbrTour > 0){
            this.joueur1.Attaque(joueur2);
            this.joueur2.Attaque(joueur1);
            nbrTour--;

            if(this.joueur1.getVie() == 0){
                System.out.println("Joueur 2 à gagné!");
                return;
            } else if (this.joueur2.getVie() == 0) {
                System.out.println("Joueur 1 à gagné !");
                return;
            }

        }
    }
}
