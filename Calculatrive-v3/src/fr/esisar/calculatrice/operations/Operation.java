package fr.esisar.calculatrice.operations;

import fr.esisar.calculatrice.*;

public interface Operation {
	public String getNom();
	public Double calculer(Double...operandes) throws CalculatriceException;

}
