package unique;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import unique.Shifumi.Choix;
import unique.Shifumi.Resultat;

public class ShifumiTestUseless {

	private final Shifumi shifumi = new Shifumi();
	
	@Test
	public void testEgalite() {
		//Act
		Resultat cas1 = shifumi.combattre(Choix.FEUILLE, Choix.FEUILLE);
		Resultat cas2 = shifumi.combattre(Choix.CISEAUX, Choix.CISEAUX);
		Resultat cas3 = shifumi.combattre(Choix.PIERRE, Choix.PIERRE);
		
		//Assert
		Assert.assertThat(cas1, CoreMatchers.equalTo(cas2));
		Assert.assertThat(cas2, CoreMatchers.equalTo(cas3));
		Assert.assertThat(cas3, CoreMatchers.equalTo(cas1));
	}

	@Test
	public void testVictoireJoueur1() {
		//Act
		Resultat cas1 = shifumi.combattre(Choix.FEUILLE, Choix.PIERRE);
		Resultat cas2 = shifumi.combattre(Choix.CISEAUX, Choix.FEUILLE);
		Resultat cas3 = shifumi.combattre(Choix.PIERRE, Choix.CISEAUX);
		
		//Assert
		Assert.assertThat(cas1, CoreMatchers.equalTo(cas2));
		Assert.assertThat(cas2, CoreMatchers.equalTo(cas3));
		Assert.assertThat(cas3, CoreMatchers.equalTo(cas1));
	}
	
	@Test
	public void testVictoireJoueur2() {
		//Act
		Resultat cas1 = shifumi.combattre(Choix.PIERRE, Choix.FEUILLE);
		Resultat cas2 = shifumi.combattre(Choix.FEUILLE, Choix.CISEAUX);
		Resultat cas3 = shifumi.combattre(Choix.CISEAUX, Choix.PIERRE);
		
		//Assert
		Assert.assertThat(cas1, CoreMatchers.equalTo(cas2));
		Assert.assertThat(cas2, CoreMatchers.equalTo(cas3));
		Assert.assertThat(cas3, CoreMatchers.equalTo(cas1));
	}
	
}
