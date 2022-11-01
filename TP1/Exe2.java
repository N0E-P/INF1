package tp1;
import java.util.Scanner;

public class Exe2 {
	//Saisie et opérations de base

	public static void main(String[] args) {

		//entrée des valeurs a et b par l'utilisateur
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un entier a :");
		int a = sc.nextInt(); 
		System.out.println("Veuillez saisir un entier b :");
		int b = sc.nextInt(); 
		sc.close();
		
		//affichage de a et b
		System.out.println(a);
		System.out.println(b);
		
		//échange de a et de b en utilisant une autre ariable c
		int c = a;
		a = b;
		b = c;

		//affichage de a et b
		System.out.println(a);
		System.out.println(b);

		//afficher la valeur du double de a
		System.out.println(a * 2);
		
		//afficher la valeur de la moitié de b
		System.out.println(b / 2);
		
		//afficher le quotient et le reste de la division enti`ere de a par b
		System.out.println(a / b);
		
		//afficher la plus grande valeur entre a et b
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}
}
