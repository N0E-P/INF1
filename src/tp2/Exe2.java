package tp2;

public class Exe2 {
	// Conversion degrés Fahrenheit vers Celsius

	public static void main(String[] args) {

		int fahrenheit = 250;
		double celsius;

		while (fahrenheit >= -20) {
			celsius = (5.0 / 9.0) * fahrenheit - (160.0 / 9.0);
			System.out.println(fahrenheit + " degrés F ---> " + celsius + " degrés C");
			fahrenheit = fahrenheit - 10;
		}

	}

}
