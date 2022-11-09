package tp5;

public class Exe3 {

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

	public static boolean estPermutation(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			int result = premiereOccurrence(tab, i);
			if (result == -1) {
				return false;
			}
		}
		return true;
	}

	public static int[] compose(int[] tab1, int[] tab2) {
		int[] tab = new int[tab1.length];
		for (int j = 0; j < tab1.length; j++) {
			tab[j] = tab2[tab1[j]];
		}
		return tab;
	}

	public static int itere(int[] tab, int i, int k) {
		int resultat = 0;
		for (int j = 1; j <= k; j++) {

			if (j == 1) {
				resultat = tab[i];

			} else {
				resultat = tab[resultat];
			}
		}
		return resultat;
	}
	
	public static int[] inverse(int[]tab) {
		int[] tab2 = new int[tab.length];
		for(int i = 0; i < tab.length;i++) {
			tab2[tab[i]] = i;
		}
		return tab2;
	}

	public static void main(String[] args) {
		int[] tab1 = { 1, 3, 4, 2, 0 }; // t1 est une permutation
		int[] tab2 = { 5, 1, 4 }; // t2 n'est pas une permutation
		int[] tab3 = { 1, 0, 2, 4, 3 }; // t3 est une permutation

		System.out.println(estPermutation(tab2));

		afficheTab(compose(tab1, tab3));

		int i = 0;
		int k = 2;
		System.out.println(itere(tab1, i, k));

		afficheTab(inverse(tab1));
	}
}
