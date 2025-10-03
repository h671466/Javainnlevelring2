package no.hvl.dat100.matriser;

import java.text.BreakIterator;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int row = 0; row < matrise.length; row++ ){
			for (int col = 0; col < matrise[row].length; col++){
				System.out.print(matrise[row][col]);
			}
			System.out.print("\n");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder MatrixString = new StringBuilder();
		for (int row = 0; row < matrise.length; row++ ){
			for (int col = 0; col < matrise[row].length; col++){
				MatrixString.append(matrise[row][col]);
			}
			MatrixString.append("\n");
		}
		return MatrixString.toString();
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int [][] NyMatrise = new int[matrise.length][];

		for (int row = 0; row < matrise.length; row++ ){
			NyMatrise[row] = new int[matrise[row].length];
			for (int col = 0; col < matrise[row].length; col++){
				NyMatrise[row][col] = tall * matrise[row][col];
			}
		}
		return NyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length){
			return false;
		}
		for (int row = 0; row < a.length; row++ ){
			if (a[row].length != b[row].length){
				return false;
			}
			for (int col = 0; col < a[row].length; col++){
				if (a[row][col] != b[row][col]){
					return false;
				}
			}
		}
		return true;
	}
	
	// e)
	// litt usikker på om hele skule speiles eller bare hver kolonne
	public static int[][] speile(int[][] matrise) {

		int [][] NyMatrise = new int[matrise.length][];

		for (int row = 0; row < matrise.length; row++ ){
			NyMatrise[row] = new int[matrise[row].length];
			int i = 0;
			for (int col = matrise[row].length - 1; 0 <= col; col--){
				NyMatrise[row][i] = matrise[row][col];
				i++;
			}
		}
		return NyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		Integer ForrigeTall = null;
		Boolean AtoB = true;
		Boolean BtoA = true;

		for (int row = 0; row < a.length; row++) {
			if (ForrigeTall != null && a[row].length != ForrigeTall){
				AtoB = false;
				break;
			}
			ForrigeTall = a[row].length;
		}

		ForrigeTall = null;

		for (int row = 0; row < b.length; row++) {
			if (ForrigeTall != null && b[row].length != ForrigeTall){
				BtoA = false;
				break;
			}
			ForrigeTall = b[row].length;
		}

		if (AtoB && a[0].length == b.length){
			int [][] NyMatrise = new int[a.length][b[0].length];
			for (int row = 0; row < a.length; row++ ){
				for (int col = 0; col < b[0].length; col++){
					for(int i = 0; i < a[row].length; i++){
						NyMatrise[row][col] += a[row][i] * b[i][col];
					}
				}
			}
			return NyMatrise;
		}


		if (BtoA && b[0].length == a.length){
			int [][] NyMatrise = new int[b.length][a[0].length];
			for (int row = 0; row < b.length; row++ ){
				for (int col = 0; col < a[0].length; col++){
					for(int i = 0; i < b[row].length; i++){
						NyMatrise[row][col] += b[row][i] * a[i][col];
					}
				}
			}
			return NyMatrise;
		}

		throw new IllegalArgumentException("Antall kolonner en matrise må være lik antall rader i den andre.");
	}
}
