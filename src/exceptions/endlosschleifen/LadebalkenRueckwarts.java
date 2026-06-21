package exceptions.endlosschleifen;

public class LadebalkenRueckwarts {

	public static void main(String[] args) throws InterruptedException {

		int progress = 20;

		while (progress >= 0) { // Fix: wird irgendwann false
			System.out.println("[" + "#".repeat(progress) + "]");
			Thread.sleep(150);
			progress--; // Fix: rückwärts
		}

	}
}
