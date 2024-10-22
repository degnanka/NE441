package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;

import fr.esisar.calculatrice.operations.Operation;

/**
 * c'est ma calculatrice
 * @author Degnan Ange
 * @version 3.0
 */

public class Calculatrice {

	private Set<Operation> operations = new HashSet<Operation>();

	public Calculatrice(Set<Operation> operations) {
		this.operations = operations;
	}

	public void ajouterOperation(Operation operation) {
		operations.add(operation);
	}

	public void retirerOperation(Operation operation) {
		operations.remove(operation);
	}

	public Operation chercherOperation(String nom) throws CalculatriceException {
		for (Operation op : operations) {
			if (op.getNom().equals(nom)) {
				return op;
			}
		}
		return null;

	}

	public Double calculer(String nom, Double... operande) throws CalculatriceException {
		Operation op = chercherOperation(nom);
		if (op == null) {
			throw new CalculatriceException("L'opération n'existe pass");
		}
		return op.calculer(operande);

	}
}
