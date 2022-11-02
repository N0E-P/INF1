package tp4;

public class Exe2 {
	// Exercice 2 : Occurrences

	private static boolean check(int[] tab, int a) {
		boolean test = false;
		for (int element : tab) {
			if (element == a) {
				test = true;
				break;
			}
		}
		return test;
	}

	public static int premiereOccurrence(int[] tab, int a) {
		boolean test = check(tab, a);
		int indice;

		if (test == true) {
			// indice = tab[a];
		} else {
			indice = -1;
		}

		return indice;
	}

	public static void main(String[] args) {
		int[] tab = { 1, 0, 6, 8, 6, 9, 2, 2, 6 };
		int a = 6;

		System.out.println(premiereOccurrence(tab, a));
	}
}