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

}
