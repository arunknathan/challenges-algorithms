package arun.training.challenges.algorithms;

import java.util.Arrays;

public class GoldBadgeAlgorithmUtil {

	public String angryProfessor(int k, int[] a) {
		return Arrays.stream(a).parallel().filter(x -> x < 1).count() < k ? "YES" : "NO";
	}

	public int beautifulDays(int i, int j, int k) {
		return (int) java.util.stream.IntStream.range(i, j).parallel().filter(x -> isBeautiful(k, x)).count();
	}

	private boolean isBeautiful(int k, int x) {
		System.out.println("x=" + x + ";trimmedReverse="
				+ Integer.parseInt(new StringBuilder("" + x).reverse().toString().replaceAll("^0+", "")) + ";k=" + k
				+ ";result="
				+ (Math.abs(x - Integer.parseInt(new StringBuilder("" + x).reverse().toString().replaceAll("^0+", "")))
						% k));
		return Math.abs(x - Integer.parseInt(new StringBuilder("" + x).reverse().toString().replaceAll("^0+", "")))
				% k == 0;
	}

}
