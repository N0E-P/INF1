package tp5;

public class Exe1 {

	public static void afficheTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println("");
	}

	public static int[] copieTableau(int[] tab) {
		int[] copie = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			copie[i] = tab[i];
		}
		return copie;
	}

	public static int[] sousTableau(int[] tab, int i, int j) {
		int[] sousTab = new int[j - i + 1];
		for (int k = i; k <= j; k++) {
			sousTab[k - i] = tab[k];
		}
		return sousTab;
	}

	public static int[] concatenation(int[] tab1, int[] tab2) {
		int[] concatenationTab = new int[tab1.length + tab2.length];

		for (int i = 0; i < tab1.length; i++) {
			concatenationTab[i] = tab1[i];
		}

		for (int i = 0; i < tab2.length; i++) {
			concatenationTab[i + tab1.length] = tab2[i];
		}

		return concatenationTab;
	}

	public static int[] fusion(int[] tab1, int[] tab2) {
		int[] fusionTab = new int[tab1.length + tab2.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < tab1.length + tab2.length; i++) {
			if (i % 2 == 0) {
				if (j <= tab1.length - 1) {
					fusionTab[i] = tab1[j];
					j++;

				} else {
					fusionTab[i] = tab2[k];
					k++;
				}

			} else {
				if (k <= tab2.length - 1) {
					fusionTab[i] = tab2[k];
					k++;
					
				} else {
					fusionTab[i] = tab1[j];
					j++;
				}
			}
		}
		return fusionTab;
	}

	public static void main(String[] args) {
		int[] tab = { 1, 0, 6, 8, 6, 9, 2, 2, 6 };
		afficheTab(tab);

		int[] copie = copieTableau(tab);
		afficheTab(copie);

		int i = 3;
		int j = 6;
		int[] sousTableau = sousTableau(tab, i, j);
		afficheTab(sousTableau);

		int[] tab1 = { 2, 5, 6 };
		int[] tab2 = { 1, 2, 3, 4, 5 };
		int[] concatenationTab = concatenation(tab1, tab2);
		afficheTab(concatenationTab);

		int[] fusionTab = fusion(tab1, tab2);
		afficheTab(fusionTab);
	}
}
