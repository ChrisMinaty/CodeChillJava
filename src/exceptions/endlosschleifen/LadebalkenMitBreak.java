package exceptions.endlosschleifen;

public class LadebalkenMitBreak {

	public static void main(String[] args) throws InterruptedException {

		long start = System.currentTimeMillis();
		int progress = 0;

		while (System.currentTimeMillis() - start < 3000) { // 3 Sekunden
			System.out.println("[" + "#".repeat(progress) + "]");
			Thread.sleep(150);
			progress = (progress + 1) % 21;
		}

	}
}
