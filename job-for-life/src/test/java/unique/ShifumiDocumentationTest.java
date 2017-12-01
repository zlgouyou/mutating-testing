package unique;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import unique.ShifumiDocumentation.Choix;
import unique.ShifumiDocumentation.Resultat;



public class ShifumiDocumentationTest {

	ShifumiDocumentation shifumi = new ShifumiDocumentation();
	
	@Test
	public void egaliteSiLesDeuxChoixSontCiseaux() {
		Resultat resultat = shifumi.combattre(Choix.CISEAUX, Choix.CISEAUX);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.EGALITE));
	}
	
	@Test
	public void egaliteSiLesDeuxChoixSontPierre() {
		Resultat resultat = shifumi.combattre(Choix.PIERRE, Choix.PIERRE);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.EGALITE));
	}
	
	@Test
	public void egaliteSiLesDeuxChoixSontFeuille() {
		Resultat resultat = shifumi.combattre(Choix.FEUILLE, Choix.FEUILLE);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.EGALITE));
	}

	
	@Test
	public void joueur1GagneSiIlJoueCiseauxContreFeuille() {
		Resultat resultat = shifumi.combattre(Choix.CISEAUX, Choix.FEUILLE);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.JOUEUR1));
	}
	
	@Test
	public void joueur1GagneSiIlJoueFeuilleContrePierre() {
		Resultat resultat = shifumi.combattre(Choix.FEUILLE, Choix.PIERRE);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.JOUEUR1));
	}
	
	@Test
	public void joueur1GagneSiIlJouePierreContreCiseaux() {
		Resultat resultat = shifumi.combattre(Choix.PIERRE, Choix.CISEAUX);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.JOUEUR1));
	}
	
	@Test
	public void joueur2GagneSiIlJoueCiseauxContreFeuille() {
		Resultat resultat = shifumi.combattre(Choix.FEUILLE, Choix.CISEAUX);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.JOUEUR2));
	}
	
	@Test
	public void joueur2GagneSiIlJoueFeuilleContrePierre() {
		Resultat resultat = shifumi.combattre(Choix.PIERRE, Choix.FEUILLE);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.JOUEUR2));
	}
	
	@Test
	public void joueur2GagneSiIlJouePierreContreCiseaux() {
		Resultat resultat = shifumi.combattre(Choix.CISEAUX, Choix.PIERRE);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Resultat.JOUEUR2));
	}


}
