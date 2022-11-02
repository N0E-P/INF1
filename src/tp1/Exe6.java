package tp1;

import java.util.Scanner;

public class Exe6 {
	// Conversion secondes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre entier de secondes :");
		int total = sc.nextInt();
		sc.close();

		int jours = total / 60 / 60 / 24;
		int heures = (total / 60 / 60) - jours * 24;
		int minutes = (total / 60) - jours * 24 * 60 - heures * 60;
		int secondes = total - jours * 24 * 60 * 60 - heures * 60 * 60 - minutes * 60;

		System.out.println("Cela donne " + jours +" jours " + heures + " heures " + minutes + " minutes et " + secondes +" secondes");
	}
}