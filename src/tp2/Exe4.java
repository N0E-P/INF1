package tp2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Exe4 {

	// Deviner le nombre

	/**
	 * Retourne un entier aléatoire entre a (inclus) et b (inclus)
	 * 
	 * @param a un entier positif
	 * @param b un entier positif
	 * @return Un entier aléatoire entre a (inclus) et b (inclus)
	 */
	public static int entierAleatoire(int a, int b) {
		return ThreadLocalRandom.current().nextInt(a, b + 1);
	}

	public static void main(String[] args) {
		int r = entierAleatoire(1,100);

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int proposition = sc.nextInt();

		while(proposition != r){
			if (proposition < r){
				System.out.println("Trop petit !");

			} else {
				System.out.println("Trop grand !");
			}

			proposition = sc.nextInt();
		}
		
		sc.close();
		System.out.println("Gagné !");
	}
}
