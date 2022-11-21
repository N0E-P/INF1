package tp4;

public class Exe4 {

	public static int[] parcoursTableau(int[] tabVals, int[] tabDepls, int posInit) {
		int[] tab = new int [tabDepls.length];
		int position = posInit;
		
		for (int i = 0; i < tabDepls.length; i++) {
			position = position + tabDepls[i];
			tab[i] = tabVals[position];
		}
		return tab;
	}

	
	public static void main(String[] args) {
		// Exemple de tableaux
		int[] tabVals = { 2, 5, 6, 1, 9, 8, 3, 4, 5, 7 };
		int[] tabDepls = { -2, 3, -1, 4 };
		int posInit = 4;

		// Le résultat attendu
		int[] tabExpected = { 6, 8, 9, 5 };

		// Exécuter la fonction que vous avez définie
		int[] tab = parcoursTableau(tabVals, tabDepls, posInit);

		// Affichage du tableau attendu
		System.out.print("Expected result:");
		for (int i = 0; i < tabExpected.length; i++) {
			System.out.print(" " + tabExpected[i]);
		}
		System.out.println();

		// Affichage du résultat obtenu, et comparer
		System.out.print("My result:");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(" " + tab[i]);
		}
	}

}
