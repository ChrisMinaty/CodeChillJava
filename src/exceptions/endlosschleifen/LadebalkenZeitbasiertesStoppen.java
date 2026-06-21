package exceptions.endlosschleifen;

public class LadebalkenZeitbasiertesStoppen {

	public static void main(String[] args) {

		int progress = 0;

		while (true) {
			System.out.println("[" + "#".repeat(progress) + "]");

			progress++;

			if (progress > 20)
				break; // Notbremse
		}

	}
}
