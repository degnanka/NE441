package fr.esisar.calculatrice.operations.ensemblistes;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationEnsembliste;

public class Minimum extends OperationEnsembliste {

	public String getNom() {
		return "min";
	}

	protected Double doCalculer(Double[] operande) throws CalculatriceException {
		Double min = operande[0];
		for(int i=1;i<operande.length;i++) {
			if(operande[i]<min) {
				min= operande[i];
			}
		}
		return min;
	}

}
