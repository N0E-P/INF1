package tp4;

public class Exe3 {

	public static void afficheTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println("");
	}

	public static int[] miroirCopie(int[] tab) {
		int [] copie = new int [tab.length];
		for (int i = 0; i< tab.length; i++) {
			copie[i] = tab[tab.length - i - 1];
		}
		return copie;
	}
	
	public static int[] echange(int[] tab, int i, int j) {

		// récupérer et stocker i et j
		int valueInI = tab[i];
		int valueInJ = tab[j];

		// écrire les nouvelles valeurs d'i et j
		tab[i] = valueInJ;
		tab[j] = valueInI;

		return tab;
	}
	
	public static int[] miroirEnPlace(int[] tab) {
		for(int i =0; i < tab.length /2; i ++) {
			echange(tab, i, tab.length - i - 1);
		}
		return tab;
	}


	public static void main(String[] args) {
		// Un exemple de tableau
		int[] tab = { 10, 20, 30, 40, 50 };

		afficheTab(miroirEnPlace(tab));
	}

}
