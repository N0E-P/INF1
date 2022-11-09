package tp4;

public class Exe2 {
	// Exercice 2 : Occurrences

	public static void afficheTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println("");
	}

	public static int premiereOccurrence(int[] tab, int a) {
		int indice = -1;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == a) {
				indice = i;
				break;
			}
		}
		return indice;
	}

	public static int nombreOccurrence(int[] tab, int a) {
		int nombre = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == a) {
				nombre = nombre + 1;
			}
		}
		return nombre;
	}

	public static int[] remplace(int[] tab, int a, int b) {

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == a) {
				tab[i] = b;
			}
		}
		return tab;
	}

	public static void main(String[] args) {
		int[] tab = { 1, 0, 6, 8, 6, 9, 2, 2, 6 };
		int a = 6;
		int b = 2;

		System.out.println(premiereOccurrence(tab, a));

		System.out.println(nombreOccurrence(tab, a));

		afficheTab(remplace(tab, a, b));

	}
}
