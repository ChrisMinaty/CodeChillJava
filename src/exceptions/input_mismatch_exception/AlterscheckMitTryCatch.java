package exceptions.input_mismatch_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlterscheckMitTryCatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte gib dein Alter ein: ");

		// Prüfen, ob wirklich eine Zahl eingegeben wurde mit try/catch

		// Prompt: Welche Alternativen zu if/else kennst du noch, um eine
		// InputMismatchException sicher zu verhindern?
		try {
			int x = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Fehler: Keine Zahl!");
			scanner.next();
		}

		int alter = scanner.nextInt();

		if (alter >= 18) {
			System.out.println("Du bist volljährig.");
		} else {
			System.out.println("Du bist noch nicht volljährig.");
		}

	}

}
