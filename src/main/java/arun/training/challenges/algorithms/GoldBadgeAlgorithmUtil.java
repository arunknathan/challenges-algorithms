package arun.training.challenges.algorithms;

import java.util.Arrays;

public class GoldBadgeAlgorithmUtil {

	public String angryProfessor(int k, int[] a) {
		return Arrays.stream(a).filter(x -> x < 1).count() < k ? "YES" : "NO";
	}

}
