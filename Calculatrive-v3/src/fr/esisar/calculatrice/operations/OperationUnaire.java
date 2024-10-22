package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.CalculatriceException;

public abstract class OperationUnaire implements Operation {
	public Double calculer(Double... operandes) throws CalculatriceException {
		if (operandes.length != 1) {
			throw new CalculatriceException("Nombre d'opérandes != 1 pour une opération unaire");
		}
		return doCalculer(operandes[0]);
	}

	protected abstract Double doCalculer(Double operande) throws CalculatriceException;

}
