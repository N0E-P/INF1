package tp6;

public class Exe1 {
	
	public static float moyenne(int[] tab) {
		int total = 0;
		for (int i = 0; i < tab.length; i++) {
			total = total + tab[i];
		}
		float moyenne = total / tab.length;
		return moyenne;
	}

	public static float variance(int[] tab) {
		float total = 0;
		float moyenne = moyenne(tab);
		for (int i = 0; i < tab.length; i++) {
			total = (tab[i] - moyenne)*(tab[i] - moyenne);
		}
		float variance = total / tab.length;
		return variance;
		
	}
	
	

	public static void main(String[] args) {
		int[] tab = {3,7,6,18};
		
		System.out.println(moyenne(tab));
		System.out.println(variance(tab));
	}
}
