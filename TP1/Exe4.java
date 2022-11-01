package tp1;

import java.util.Scanner;

public class Exe4 {
	// Parité d'une somme

	public static void main(String[] args) {

		// récupérer les 3 entiers
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le premier entier :");
		int a = sc.nextInt();
		System.out.println("Veuillez entrer le deuxième entier :");
		int b = sc.nextInt();
		System.out.println("Veuillez entrer le troisième entier :");
		int c = sc.nextInt();
		sc.close();

		// somme des 3 entiers
		int somme = a + b + c;

		// vérifier si la somme des entiers est pair ou impair
		if (somme % 2 == 0) {
			System.out.println("Le nombre est pair.");
		} else {
			System.out.println("Le nombre est impair.");
		}
	}
}
