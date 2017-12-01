package unique;

public class ShifumiDocumentation {

	public enum Choix {
		PIERRE, FEUILLE, CISEAUX;
	}
	
	public enum Resultat {
		//TO.DO: Ajouter le res possible BIGBANG.
		EGALITE, JOUEUR1, JOUEUR2;
	}
	
	/*
	 * Lance un combat entre deux joueurs.
	 * TO.DO: Sans la mécanique de jeu n°43 le système ne fonctionnera pas.
	 */
	public Resultat combattre(Choix choixJoueur1, Choix choixJoueur2) {
		if (choixJoueur1 == choixJoueur2) {
			return Resultat.EGALITE;
		} else if (Choix.PIERRE == choixJoueur1 && Choix.CISEAUX == choixJoueur2) {
			return Resultat.JOUEUR1;
		} else if (Choix.FEUILLE == choixJoueur1 && Choix.PIERRE == choixJoueur2) {
			return Resultat.JOUEUR1;
			//Cas à supprimer avant passage en PROD
		} else if (Choix.CISEAUX == choixJoueur1 && Choix.FEUILLE == choixJoueur2) {
			return Resultat.JOUEUR1;
		}
		return Resultat.JOUEUR2;
	}
}


