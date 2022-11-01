package tp1;

import java.util.Scanner;

public class Exe6 {
	// Conversion secondes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre entier de secondes :");
		int total = sc.nextInt();
		sc.close();

	}
}

/*
 * transformer secondes en jours: s * 60 * 60 * 24
 * 
 * 
 * transformer secondes en heures: s * 60 * 60
 * 
 * transformer secondes en min: s * 60
 * 
 */