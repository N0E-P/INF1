package tp3;
import java.util.Scanner;

public class Exe1 {
	public static void enumereCroissante (double vMin, double vMax) {
		for (int i = 0; i <= (vMax - vMin); i++){
			System.out.println(vMin + i);
		}
	}
	
	public static void enumereDecroissante (double vMin, double vMax) {
		for (int i = 0; i <= (vMax - vMin); i++){
			System.out.println(vMax - i);
		}
	}
	
	public static void enumere (double deb, double fin) {
		if (deb < fin) {
			for (int i = 0; i <= (fin - deb); i++){
				System.out.println(deb + i);
			}

		} else {
			for (int i = 0; i <= (deb - fin); i++){
				System.out.println(deb - i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("saisir vMin");
		Double vMin = sc.nextDouble();
		System.out.println("saisir vMax");
		Double vMax = sc.nextDouble();

		System.out.println("saisir deb");
		Double deb = sc.nextDouble();
		System.out.println("saisir fin");
		Double fin = sc.nextDouble();

		sc.close();

		if (vMin > vMax) return;
		
		enumereCroissante(vMin, vMax);
		enumereDecroissante(vMin, vMax);
		enumere(deb, fin);
	}
}
