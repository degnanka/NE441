package fr.esisar.calculatrice.operations.unaires;

import fr.esisar.calculatrice.CalculatriceException;
import fr.esisar.calculatrice.operations.OperationUnaire;
import java.lang.*;

public class Sinus extends OperationUnaire{

	@Override
	public String getNom() {
		return "sin";
	}

	@Override
	protected Double doCalculer(Double operande) throws CalculatriceException {
		return Math.sin(operande);
	}

}
