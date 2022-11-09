package td6;

public class ex2 {

	public static int sommeLigne(int[][] tab, int i) {
		int somme = 0;
		for (int j = 0; j < tab[i].length; j++) {
			somme = somme + tab[i][j];

		}
		return somme;
	}

	public static int sommeColonne(int[][] tab, int j) {
		int somme = 0;
		for (int i = 0; i < tab.length; i++) {
			somme = somme + tab[i][j];

		}
		return somme;
	}

	public static boolean estMagiqueLigne(int[][] tab) {
		for (int i = 1; i < tab.length; i++) {
			if (sommeLigne(tab, i) != sommeLigne(tab, i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean estMagiqueColonne(int[][] tab) {
		int nombreColonne = avoirNombreColonne(tab);

		for (int i = 1; i < nombreColonne; i++) {
			if (sommeLigne(tab, i) != sommeLigne(tab, i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static int avoirNombreColonne(int[][] tab) {
		int nombreColonne = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i].length > nombreColonne) {
				nombreColonne = tab[i].length;
			}
		}
		return nombreColonne;
	}

	public static boolean estCarre(int[][] tab) {
		int nombreLigne = tab.length;

		for (int i = 0; i < tab.length; i++) {
			if (nombreLigne != tab[i].length) {
				return false;
			}
		}
		return true;
	}

	public static int diagonale1(int[][] tab) {
		int somme1 = 0;
		for (int i = 0; i < tab.length; i++) {
			somme1 = somme1 + tab[i][i];
		}
		return somme1;
	}

	public static int diagonale2(int[][] tab) {
		int somme2 = 0;
		for (int j = tab.length - 1; j >= 0; j--) {
			somme2 = somme2 + tab[tab.length - j - 1][j];
		}
		return somme2;
	}

	public static boolean estMagiqueDiagonale(int[][] tab) {
		if (!estCarre(tab)) {
			return false;
		}
		return (diagonale1(tab) == diagonale2(tab));
	}

	public static boolean estMagique(int[][] tab) {
		boolean estCarre = estCarre(tab);
		boolean estMagiqueLigne = estMagiqueLigne(tab);
		boolean estMagiqueColonne = estMagiqueColonne(tab);
		boolean estMagiqueDiagonale = estMagiqueDiagonale(tab);
		return (estCarre && estMagiqueLigne && estMagiqueColonne && estMagiqueDiagonale);
	}

	public static void main(String[] args) {
		int[][] tab = { { 1, 5, 4 }, { 1, 5, 4 }, { 1, 5, 4 } };

		System.out.println(estMagique(tab));
	}
}