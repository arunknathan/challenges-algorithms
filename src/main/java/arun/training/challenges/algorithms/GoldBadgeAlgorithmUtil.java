package arun.training.challenges.algorithms;

import java.util.Arrays;

public class GoldBadgeAlgorithmUtil {

	public String angryProfessor(int k, int[] a) {
		return Arrays.stream(a).parallel().filter(x -> x < 1).count() < k ? "YES" : "NO";
	}

	public int beautifulDays(int i, int j, int k) {
		return (int) java.util.stream.IntStream.range(i, j).parallel().filter(x -> isBeautifulDay(k, x)).count();
	}

	private boolean isBeautifulDay(int k, int x) {
		return Math.abs(x - Integer.parseInt(new StringBuilder("" + x).reverse().toString().replaceAll("^0+", "")))
				% k == 0;
	}

	public int viralAdvertising(int n) {
		int recipients = 5;
		int count = 0;

		for (int i = 1; i <= n; i++) {
			int liked = recipients / 2;
			count += liked;
			recipients = 3 * liked;
		}

		return count;
	}

}
