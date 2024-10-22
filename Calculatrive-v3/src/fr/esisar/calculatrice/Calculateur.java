package fr.esisar.calculatrice;

import java.util.HashSet;
import java.util.Set;
import fr.esisar.calculatrice.operations.Operation;
import fr.esisar.calculatrice.operations.binaires.*;
import fr.esisar.calculatrice.operations.unaires.*;
import fr.esisar.calculatrice.operations.ensemblistes.*;

public class Calculateur {

	public static void main(String[] args) {

		Set<Operation> operations = new HashSet<Operation>();
		System.out.println("....................Création de la calculatrice....................");
		Calculatrice calc = new Calculatrice(operations);

		Double a = 10.0;
		Double b = 20.0;
		Double c = 30.0;
		Double d = 0.0;
		
		System.out.println("....................Operation binaire....................");
		calc.ajouterOperation(new Ajouter());
		calc.ajouterOperation(new Soustraire());
		calc.ajouterOperation(new Multiplier());
		calc.ajouterOperation(new Diviser());

		System.out.println("....................Operation Unaire....................");
		calc.ajouterOperation(new Cosinus());
		calc.ajouterOperation(new Sinus());
		calc.ajouterOperation(new Tangente());
		calc.ajouterOperation(new ValeurAbsolue());

		System.out.println("....................Operation Ensembliste....................");
		calc.ajouterOperation(new Maximum());
		calc.ajouterOperation(new Minimum());

		System.out.println("....................Fin de la création de la calculatrice....................");

		System.out.println("....................Recherche opérations....................");
		try {
			Operation op =calc.chercherOperation("+");
			calc.chercherOperation("cos");
			calc.chercherOperation("sin");
			calc.chercherOperation("/");
			calc.chercherOperation("max");
		} catch (CalculatriceException e) {
			e.printStackTrace();
		}
		
		System.out.println("....................Test des opérations....................");
		try {
			System.out.println("La somme de "+a+" et "+b+" donne "+calc.calculer("+",a,b));
			System.out.println("La différence entre "+a+" et "+b+" donne "+calc.calculer("-",a,b));
			System.out.println("Le produit de "+a+" et "+b+" donne "+calc.calculer("*",a,b));
			System.out.println("La quotient de "+a+" et "+b+" donne "+calc.calculer("/",a,b));
			System.out.println("Le cosinus de "+a+" donne "+calc.calculer("cos",a));
			System.out.println("Le sinus de "+a+" donne "+calc.calculer("sin",a));
			System.out.println("La tangente de "+a+" donne "+calc.calculer("sin",a));
			System.out.println("Le maximum de l'ensemble est "+calc.calculer("max",a,b,c,d));
			System.out.println("Le minimum de l'ensemble est "+calc.calculer("min",a,b,c,d));
		} catch (CalculatriceException e) {
			e.printStackTrace();
		}
		
		System.out.println("....................Division par 0....................");
		try {
			System.out.println("Le quotient de "+a+" et "+d+" donne "+calc.calculer("/",a,d));
		} catch (CalculatriceException e) {
			System.out.println("Division par zero impossible");
		}


	}
}
