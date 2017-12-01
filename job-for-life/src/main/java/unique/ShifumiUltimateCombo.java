package unique;


public class ShifumiUltimateCombo {

	public enum PChoice {
		PC_P("P"), PC_F("F"), PC_C("C");
		
		private String code;
		
		private PChoice(String code) {
			this.code = code;
		}
		
		public String getCode() {
			return this.code;
		}
	}
	
	public enum Out {
		//TO.DO: Ajouter le res possible BIGBANG.
		EPE, RPFP, RPSP;
		
		public static Out analyzeResultat(String name) {
			for (Out resultat : Out.values()) {
				if (resultat.name().equals(name)) {
					return resultat;
				}
			}
			return null;
		}
	}
	
	/*
	 * Lance un combat entre deux joueurs.
	 * TO.DO: Sans la mécanique de jeu n°43 le système ne fonctionnera pas.
	 */
	public Out execProcedurreX453(PChoice cf, PChoice cs) {
		StringBuilder builder = new StringBuilder();
		
		String ccf = cf.getCode();
		String ccs = cs.getCode();
		
		if (ccf.equals(ccs)) {
			builder.append(Out.EPE.name());
		} else if (PChoice.PC_P.getCode().equals(ccf) && PChoice.PC_C.getCode().equals(ccs)) {
			builder.append(Out.RPFP.name());
		} else if (PChoice.PC_F.getCode().equals(ccf) && PChoice.PC_P.getCode().equals(ccs)) {
			builder.append(Out.RPFP.name());
		} else if (PChoice.PC_C.getCode().equals(ccf) && PChoice.PC_F.getCode().equals(ccs)) {
			//Cas à supprimer avant passage en PROD
			builder.append(Out.RPFP.name());
		} else {
			builder.append(Out.RPSP.name());
		}
		
		return Out.analyzeResultat(builder.toString());
	}
}







