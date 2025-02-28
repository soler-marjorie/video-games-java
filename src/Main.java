import com.nom.projet.combat.Assassin;
import com.nom.projet.combat.Guerrier;
import com.nom.projet.combat.Partie;

public class Main {
    public static void main(String[] args) {
        Assassin assassin = new Assassin("assassin", 20, 4, 2, 3);
        Guerrier guerrier = new Guerrier("Guerrier", 10, 3, 2, 3);
        Partie partie = new Partie(assassin,guerrier,15);

        partie.lancerPartie();
    }
}
