package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;
import java.lang.*;

public class Cosinus extends OperationUnaire{

	@Override
	public String getNom() {
		return "cos";
	}

	@Override
	protected Double doCalculer(Double operande) throws CalculatriceException {
		return Math.cos(operande) ;
	}

}
