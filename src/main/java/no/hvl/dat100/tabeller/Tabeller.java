package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		StringBuilder tablestring = new StringBuilder("(");
		for (int j : tabell) {
			tablestring.append(tabell[j]).append(",");
		}

		System.out.println(tablestring + ")");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		StringBuilder tablestring = new StringBuilder("[");
		for (int j : tabell) {
			tablestring.append(tabell[j]).append(",");
		}
		tablestring.append("]");
		return tablestring.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int resultat = 0;
		for (int j : tabell) {
			resultat += tabell[j];
		}
		return resultat;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int j : tabell) {
			if (tabell[j] == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int j : tabell) {
			if (tabell[j] == tall) {
				return j;
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

			if (ForrigeTall != null && ForrigeTall > tabell[j]) {
				return false;
			}
			ForrigeTall = tabell[j];
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// kan gjerne være mer spesifik på hvordan den ska være satt sammen feks blandet anenhver eller etterhverandre :)
		int Lengde1 = tabell1.length;
		int Lengde2 = tabell2.length;
		int SattSammen[] = new int[Lengde1 + Lengde2];

		for (int j : tabell1) {
			SattSammen[j] = tabell1[j];
		}

		for (int j : tabell2){
			SattSammen[j + tabell1.length] = tabell2[j];
		}

		return SattSammen;
	}
}
