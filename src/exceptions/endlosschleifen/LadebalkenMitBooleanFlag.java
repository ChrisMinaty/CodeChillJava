package exceptions.endlosschleifen;

public class LadebalkenMitBooleanFlag {

	public static void main(String[] args) throws InterruptedException {

		boolean loading = true;
		int progress = 0;

		while (loading) {
			System.out.println("[" + "#".repeat(progress) + "]");
			Thread.sleep(150);
			progress++;

			if (progress > 20) {
				loading = false; // Fix
			}
		}

	}
}
