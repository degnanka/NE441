package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Maximum extends OperationEnsembliste{

	public String getNom() {
		return "max";
	}

	protected Double doCalculer(Double[] operande) throws CalculatriceException {
		Double max = operande[0];
		for(int i=1;i<operande.length;i++) {
			if(operande[i]>max) {
				max= operande[i];
			}
		}
		return max;
	}
}
