package tp2;

import java.util.Scanner;

public class Exe3 {
	// Somme de 1 à n

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("saisir un entier ≥ 1");
		int n = sc.nextInt();
		sc.close();

		int total = 1;
		String affichage = "1";
		for (int i = 2; i <= n; i++) {
			total = total + i;
			affichage = affichage + " + " + i;
		}

		System.out.println(affichage + " = " + total);

	}

}
