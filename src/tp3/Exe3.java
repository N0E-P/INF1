// i = lignNumber

package tp3;

public class Exe3 {

	// Q1 : Déterminer les dimensions de la cible en fonction de n
	public static int getDimensions(int n) {
		int dimensions = n + n - 1;
		return dimensions;
	}

	// Q2 : Écrire une fonction pour afficher la i-ème ligne de la cible
	public static void getlign(int n, int lignNumber) {		
		
		int valueToPrint = 1;
		int dimensions = getDimensions(n);

		for(int caseNumber = 1; caseNumber <= dimensions; caseNumber++){
			
			if (caseNumber == dimensions){
				System.out.println(valueToPrint + "  ");
			} else {
				System.out.print(valueToPrint + "  ");
			}

			if (valueToPrint < lignNumber && caseNumber < n){
				valueToPrint++;
			}

			if (caseNumber >= n && valueToPrint == dimensions - caseNumber + 1){
				valueToPrint--;
			}
		}
	}

	// Q3 : Écrire une fonction pour afficher la cible complète
	public static void cible(int n) {
		int lignNumber = 1;
		boolean getToN = false;

		for (int i = 1; i <= getDimensions(n); i++){
			getlign(n, lignNumber);
			if (lignNumber < n && getToN == false){
				lignNumber++;
				
			} else {
				lignNumber--;
				getToN = true;
			}
		}
		return;
	}

	public static void main(String[] args) {
		for (int n = 1; n < 10; n++){
			cible(n);
			System.out.println(" ");
		}
	}
}
