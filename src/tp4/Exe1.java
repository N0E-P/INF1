package tp4;

public class Exe1 {
	// Exercice 1 : Échanger deux cases d'un tableau

	public static int[] echange(int[] tab, int i, int j) {

		// récupérer et stocker i et j
		int valueInI = tab[i];
		int valueInJ = tab[j];

		// écrire les nouvelles valeurs d'i et j
		tab[i] = valueInJ;
		tab[j] = valueInI;

		return tab;
	}

	public static void afficheTab(int[] tab) {
		for (int i = 0; i < tab.length; ++i) {
			System.out.print(tab[i] + " ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		int[] tab = { 1, 0, 6, 8, 6, 9, 2, 2, 6 };
		int i = 3;
		int j = 5;
		afficheTab(tab);

		tab = echange(tab, i, j);
		afficheTab(tab);
	}
}
