package exceptions.input_mismatch_exception;

import java.util.Scanner;

public class AlterscheckRegExp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bitte gib dein Alter ein: ");

		// Prüfen, ob wirklich eine Zahl eingegeben wurde mit RegExp

		// Prompt: Welche Alternativen zu if/else kennst du noch, um eine
		// InputMismatchException sicher zu verhindern?
		String input = scanner.nextLine();
		if (!input.matches("\\d+")) {
			System.out.println("Nur Ziffern erlaubt!");
			return;
		}
		int alter = Integer.parseInt(input);

		if (alter >= 18) {
			System.out.println("Du bist volljährig.");
		} else {
			System.out.println("Du bist noch nicht volljährig.");
		}

	}

}
