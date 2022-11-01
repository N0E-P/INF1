package tp2;

public class Exe1 {
	// Précision et variables de type double

	public static void main(String[] args) {
		double x = Double.parseDouble("0");

		int i = 0;
		while (i != 10) {
			i = i + 1;
			x = x + 0.1;
			System.out.println(x);
		}
	}

}
