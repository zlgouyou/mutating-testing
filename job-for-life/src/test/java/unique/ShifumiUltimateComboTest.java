package unique;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import unique.ShifumiUltimateCombo.Out;
import unique.ShifumiUltimateCombo.PChoice;

public class ShifumiUltimateComboTest {

	ShifumiUltimateCombo shifumi = new ShifumiUltimateCombo();
	
	@Test
	public void egaliteSiLesDeuxChoixSontCiseaux() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_C, PChoice.PC_C);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.EPE));
	}
	
	@Test
	public void egaliteSiLesDeuxChoixSontPierre() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_P, PChoice.PC_P);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.EPE));
	}
	
	@Test
	public void egaliteSiLesDeuxChoixSontFeuille() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_F, PChoice.PC_F);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.EPE));
	}

	
	@Test
	public void joueur1GagneSiIlJoueCiseauxContreFeuille() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_C, PChoice.PC_F);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.RPFP));
	}
	
	@Test
	public void joueur1GagneSiIlJoueFeuilleContrePierre() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_F, PChoice.PC_P);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.RPFP));
	}
	
	@Test
	public void joueur1GagneSiIlJouePierreContreCiseaux() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_P, PChoice.PC_C);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.RPFP));
	}
	
	@Test
	public void joueur2GagneSiIlJoueCiseauxContreFeuille() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_F, PChoice.PC_C);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.RPSP));
	}
	
	@Test
	public void joueur2GagneSiIlJoueFeuilleContrePierre() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_P, PChoice.PC_F);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.RPSP));
	}
	
	@Test
	public void joueur2GagneSiIlJouePierreContreCiseaux() {
		Out resultat = shifumi.execProcedurreX453(PChoice.PC_C, PChoice.PC_P);
		
		Assert.assertThat(resultat, CoreMatchers.equalTo(Out.RPSP));
	}
}
