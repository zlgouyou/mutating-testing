package unique;

public class Shifumi {

	public enum Choix {
		PIERRE, FEUILLE, CISEAUX;
	}
	
	public enum Resultat {
		EGALITE, JOUEUR1, JOUEUR2;
	}
	
	public Resultat combattre(Choix choixJoueur1, Choix choixJoueur2) {
		if (choixJoueur1 == choixJoueur2) {
			return Resultat.EGALITE;
		} else if (Choix.PIERRE == choixJoueur1 && Choix.CISEAUX == choixJoueur2) {
			return Resultat.JOUEUR1;
		} else if (Choix.FEUILLE == choixJoueur1 && Choix.PIERRE == choixJoueur2) {
			return Resultat.JOUEUR1;
		} else if (Choix.CISEAUX == choixJoueur1 && Choix.FEUILLE == choixJoueur2) {
			return Resultat.JOUEUR1;
		}
		return Resultat.JOUEUR2;
	}
}


