package tp6;

public class Exe2 {

	public static void afficheTab(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + ", ");
		}
		System.out.println("");
	}

	public static int[] calculHistogramme(int[] tab) {
		int[] histoTab = new int[21];
		for (int i = 0; i < tab.length; i++) {
			histoTab[tab[i]]++;
		}
		return histoTab;

	}

	public static void afficheHistoHorizontal(int[] notes) {
		int[] tab = calculHistogramme(notes);
		for (int i = 0; i < tab.length; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < tab[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void afficheHistoVertical(int[] notes) {
		int[] tab = calculHistogramme(notes);

		int noteMax = 0;
		for (int i = 0; i < 20; i++) {
			if (tab[i] > noteMax) {
				noteMax = tab[i];
			}
		}

		for (int i = 0; i < noteMax; i++) {
			for (int j = 0; j < 21; j++) {
				if (tab[j] >= noteMax - i) {
					System.out.print("*  ");

				} else {
					System.out.print("   ");
				}
				if(j>=10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20");
	}

	public static void main(String[] args) {
		int[] notes = { 6, 11, 13, 16, 12, 8, 9, 7, 12, 9, 8, 10, 14, 11, 9, 1, 6, 4, 19, 17, 12, 13, 4, 0, 5, 9, 10,
				11 };
		afficheHistoVertical(notes);
	}
}