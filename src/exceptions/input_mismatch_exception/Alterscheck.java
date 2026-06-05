package exceptions.input_mismatch_exception;

import java.util.Scanner;

public class Alterscheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte gib dein Alter ein: ");

		// Prüfen, ob wirklich eine Zahl eingegeben wurde mit if

		// Prompt: Welche Alternativen zu if/else kennst du noch, um eine
		// InputMismatchException sicher zu verhindern?
		if (!scanner.hasNextInt()) {
			System.out.println("Fehler: Du musst eine ZAHL eingeben!");
			return;
		}

		int alter = scanner.nextInt();

		if (alter >= 18) {
			System.out.println("Du bist volljährig.");
		} else {
			System.out.println("Du bist noch nicht volljährig.");
		}

	}

}
