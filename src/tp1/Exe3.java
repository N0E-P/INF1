package tp1;
import java.util.Scanner;

public class Exe3 {
	//Année bissextile

	public static void main(String[] args) {
		
		//demande l'année a l'utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer une année :");
		int annee = sc.nextInt(); 
		sc.close();
		
		//vérifie si l'année est bissextile ou non
		if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
			System.out.println("année bissextile");
		} else {
			System.out.println("année non bissextile");
		}
	}
}