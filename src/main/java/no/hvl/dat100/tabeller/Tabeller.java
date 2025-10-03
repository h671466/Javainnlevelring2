package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		StringBuilder tablestring = new StringBuilder("(");
		for (int j : tabell) {
			tablestring.append(j).append(",");
		}

		System.out.println(tablestring + ")");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder tablestring = new StringBuilder("[");
		int i = 0;
		for (int j : tabell) {
			i++;
			tablestring.append(j);
			if (i < tabell.length) {
				tablestring.append(",");
		}

		}
		tablestring.append("]");
		return tablestring.toString();

	}

	// c)
	public static int summer(int[] tabell) {
		int resultat = 0;
		for (int j : tabell) {
			resultat += j;
		}
		return resultat;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int j : tabell) {
			if (j == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;  // ✅ Return the index, not the value
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] ReversertTabell = new int[tabell.length];
		int i = 0;
		for (int length = tabell.length - 1; length >= 0; length--) {
			ReversertTabell[i] = tabell[length];
			i++;
		}
		return ReversertTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		Integer ForrigeTall = null;
		for (int j : tabell) {

			if (ForrigeTall != null && ForrigeTall > j) {
				return false;
			}
			ForrigeTall = j;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		int[] sattSammen = new int[lengde1 + lengde2];


		for (int i = 0; i < lengde1; i++) {
			sattSammen[i] = tabell1[i];
		}


		for (int i = 0; i < lengde2; i++) {
			sattSammen[i + lengde1] = tabell2[i];
		}

		return sattSammen;
	}
}
