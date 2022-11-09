package tp5;

public class Exe2 {

	public static void afficheTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println("");
	}

	public static int[] fusionTrie(int[] tab1, int[] tab2) {
		int[] fusionTab = new int[tab1.length + tab2.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < tab1.length + tab2.length; i++) {

			if (j <= tab1.length - 1 && k <= tab2.length - 1) {

				if (tab1[j] < tab2[k]) {
					fusionTab[i] = tab1[j];
					j++;

				} else {
					fusionTab[i] = tab2[k];
					k++;
				}
				
			} else if (j > tab1.length - 1){
				fusionTab[i] = tab2[k];
				k++;
				
			} else {
				fusionTab[i] = tab1[j];
				j++;
			}
		}
		return fusionTab;
	}

	public static void main(String[] args) {
		int[] tab1 = { 2, 5, 6, 6 }; // t1 est trié
		int[] tab2 = { 1, 2, 3, 4, 5 }; // t2 est trié

		int[] fusionTab = fusionTrie(tab1, tab2);
		afficheTab(fusionTab);
	}
}
