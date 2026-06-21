package exceptions.endlosschleifen;

public class LadenbalkenMitForSchleife {

	public static void main(String[] args) {

		// for‑Schleife statt while (Achtung: auch for-Schleifen können endlos laufen!)

		for (int progress = 0; progress <= 20; progress++) {
			System.out.println("[" + "#".repeat(progress) + "]");
		}

	}
}
