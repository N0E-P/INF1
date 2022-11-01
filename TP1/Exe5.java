package tp1;

import java.util.Scanner;

public class Exe5 {
	// Affichage dans l'ordre croissant

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

		// a est plus grand que b :
		if (a > b) {
			// c est plus grand que a
			if (c > a) {
				System.out.println(b + " <= " + a + " <= " + c);

				// c est plus grand que b
			} else if (c > b) {
				System.out.println(b + " <= " + c + " <= " + a);

				// b est plus grand que c
			} else {
				System.out.println(c + " <= " + b + " <= " + a);
			}

			// b est plus grand que a :
		} else {
			// c est plus grand que b
			if (c > b) {
				System.out.println(a + " <= " + b + " <= " + c);

				// c est plus grand que a
			} else if (c > a) {
				System.out.println(a + " <= " + c + " <= " + b);

				// a est plus grand que c
			} else {
				System.out.println(c + " <= " + a + " <= " + b);
			}

		}

	}
}
