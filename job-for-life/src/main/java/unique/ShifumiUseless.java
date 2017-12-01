package unique;


public class ShifumiUseless {

	public enum Choix {
		PIERRE("P"), FEUILLE("F"), CISEAUX("C");
		
		private String code;
		
		private Choix(String code) {
			this.code = code;
		}
		
		public String getCode() {
			return this.code;
		}
	}
	
	public enum Resultat {
		EGALITE, JOUEUR1, JOUEUR2;
		
		public static Resultat getResultatByName(String name) {
			for (Resultat resultat : Resultat.values()) {
				if (resultat.name().equals(name)) {
					return resultat;
				}
			}
			return EGALITE;
		}
	}
	
	public Resultat combattre(Choix choixJoueur1, Choix choixJoueur2) {
		StringBuilder builder = new StringBuilder();
		
		String codeChoixJoueur1 = choixJoueur1.getCode();
		String codeChoixJoueur2 = choixJoueur2.getCode();
		
		if (codeChoixJoueur1.equals(codeChoixJoueur2)) {
			builder.append(Resultat.EGALITE.name());
		} else if (Choix.PIERRE.getCode().equals(codeChoixJoueur1) && Choix.CISEAUX.getCode().equals(codeChoixJoueur2)) {
			builder.append(Resultat.JOUEUR1.name());
		} else if (Choix.FEUILLE.getCode().equals(codeChoixJoueur1) && Choix.PIERRE.getCode().equals(codeChoixJoueur2)) {
			builder.append(Resultat.JOUEUR1.name());
		} else if (Choix.CISEAUX.getCode().equals(codeChoixJoueur1) && Choix.FEUILLE.getCode().equals(codeChoixJoueur2)) {
			builder.append(Resultat.JOUEUR1.name());
		} else {
			builder.append(Resultat.JOUEUR2.name());
		}
		
		return Resultat.getResultatByName(builder.toString());
	}
}





