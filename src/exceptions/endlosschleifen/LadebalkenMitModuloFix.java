package exceptions.endlosschleifen;

public class LadebalkenMitModuloFix {

	public static void main(String[] args) {

		int progress = 0;

		while (true) { // funktioniert so nicht!
			System.out.println("[" + "#".repeat(progress) + "]");

			progress = (progress + 1) % 21;
		}
	}
}
