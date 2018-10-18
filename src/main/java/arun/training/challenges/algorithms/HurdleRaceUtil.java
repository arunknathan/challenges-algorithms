package arun.training.challenges.algorithms;

import java.util.Arrays;

public class HurdleRaceUtil {

	public int hurdleRace(int k, int[] height) {
		int boost = Arrays.stream(height).max().getAsInt() - k;
		return boost > 0 ? boost : 0;
	}

}
