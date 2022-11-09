package td6;

public class ex1 {

	public static void afficheTab(int[][] tab) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j]);
			}
			System.out.println("");
		}
	}

	public static boolean compareTab(int[][] tab1, int[][] tab2) {
		if (tab1.length != tab2.length) {
			return false;
		}

		for (int i = 0; i < tab1.length; i++) {
			if (tab1[i].length != tab2[i].length) {
				return false;
			}

			for (int j = 0; j < tab1[i].length; j++) {
				if (tab1[i][j] != tab2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] copieTab(int[][] tab) {
		int[][] copie = new int[tab.length][];
		for (int i = 0; i < tab.length; i++) {
			copie[i] = new int[tab[i].length];
			for (int j = 0; j < tab[i].length; j++) {
				copie[i][j] = tab[i][j];
			}
		}
		return copie;
	}

	public static void main(String[] args) {
	}
}
