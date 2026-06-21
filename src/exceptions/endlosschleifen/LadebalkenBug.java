package exceptions.endlosschleifen;

public class LadebalkenBug {

	/*
	 * Der Ladebalken, der niemals fertig wird.
	 * 
	 * BUG: Die Bedingung ist falsch gesetzt. Der Balken wächst – aber hört nie auf.
	 */

	public static void main(String[] args) throws InterruptedException {

		int progress = 0;

		while (progress >= 0) { // BUG: bleibt IMMER true
			System.out.println("Lade... [" + "#".repeat(progress) + "]");
			Thread.sleep(200);
			progress++; // wächst unendlich
		}
	}
}
