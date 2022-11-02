package tp3;
import java.util.Scanner;

public class Exe2 {

	// Q1 : Écrire une fonction impotMontant qui prend en entrée le salaire d'une personne et qui retourne le montant de son impôt.
	public static double impotMontant(double salaire) {
		double impot = 0;
		
		if (salaire > 10064){

			if (salaire > 25659){
				impot += (25659 - 10064) * 0.11;

				if (salaire > 73369){
					impot += (73369 - 25659) * 0.3;

					if (salaire > 157805){
						impot += (157805 - 73369) * 0.41 + (salaire - 157805) * 0.45;

					} else {
						impot += (salaire - 73369) * 0.41;
					}

				} else {
					impot += (salaire - 25659) * 0.3;
				}

			} else {
				impot += (salaire - 10064) * 0.11;
			}
		}

		return impot;
	}

	// Q2: Écrire une fonction pourcentageImposition, qui prend en entrée le salaire d'une personne et qui retourne son pourcentage d'imposition.
	public static double pourcentageImposition(double salaire) {
		double impot = impotMontant(salaire);
		double pourcentage = impot / salaire * 100;
		return pourcentage;
	}

	
	// Q3 : Écrire la fonction gainMariage pour calculer le gain d'impot des couples
	public static double gainMariage(double salaire1, double salaire2) {
		double sommeNormale = impotMontant(salaire1) + impotMontant(salaire2);
		double sommeMariage = 2.0 * impotMontant((salaire1 + salaire2) / 2.0);
		double gain = sommeNormale - sommeMariage;
		return gain;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir salaire 1");
		Double salaire1 = sc.nextDouble();
		System.out.println("saisir salaire 2");
		Double salaire2 = sc.nextDouble();
		sc.close();

		double impot = impotMontant(salaire1);
		System.out.println("Montant d'impot : " + impot);

		double pourcentage = pourcentageImposition(salaire1);
		System.out.println("Pourcentage d'imposition : " + pourcentage + "%");

		double gain = gainMariage(salaire1, salaire2);
		System.out.println("Gain avec un mariage : " + gain);
	}
}
