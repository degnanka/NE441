package fr.esisar.calculatrice.operations.binaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationBinaire;

public class Multiplier extends OperationBinaire{

	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	protected Double doCalculer(Double operande1, Double operande2) throws CalculatriceException {
		// TODO Auto-generated method stub
		return operande1*operande2;
	}


}
