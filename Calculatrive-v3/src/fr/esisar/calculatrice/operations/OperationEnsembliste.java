package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationEnsembliste implements Operation{
	public Double calculer(Double... operandes) throws CalculatriceException {
		if(operandes.length == 0) throw new CalculatriceException("Ensemble vide pour une operation ensembliste");
		return doCalculer(operandes);
	}
	
	protected abstract Double doCalculer(Double[] operande) throws CalculatriceException;
	


}
