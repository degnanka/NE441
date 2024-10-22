package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;

public class Tangente extends OperationUnaire{

	@Override
	public String getNom() {
		return "tan";
	}


	protected Double doCalculer(Double operande) throws CalculatriceException {
		return Math.abs(operande);
	}

}
