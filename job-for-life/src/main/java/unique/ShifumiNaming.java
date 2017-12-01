package unique;

public class ShifumiNaming {

	public enum PChoice {
		PC_P, PC_F, PC_C;
	}
	
	public enum Out {
		RPE, RPFP, RPSP;
	}
	
	public Out execProcedurreX453(PChoice cf, PChoice cs) {		
		if (cf == cs) {
			return Out.RPE;
		} else if (PChoice.PC_P == cf && PChoice.PC_C == cs) {
			return Out.RPFP;
		} else if (PChoice.PC_F == cf && PChoice.PC_P == cs) {
			return Out.RPFP;
		} else if (PChoice.PC_C == cf && PChoice.PC_F == cs) {
			return Out.RPFP;
		}
		return Out.RPSP;
	}
}




