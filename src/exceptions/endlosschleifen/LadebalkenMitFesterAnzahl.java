package exceptions.endlosschleifen;

public class LadebalkenMitFesterAnzahl {

	public static void main(String[] args) {

		int progress = 0;

		while (progress <= 20) { // FIX: klare Obergrenze
			System.out.println("Lade... [" + "#".repeat(progress) + "]");
			progress++;
		}

		System.out.println("Fertig geladen.");
	}

}
