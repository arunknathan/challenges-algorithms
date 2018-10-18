package arun.training.challenges.algorithms;

public class UtopianTreeUtil {

	public int utopianTree(int n) {
		int h = 1;
		boolean toggle = true;
		for (int i = 1; i <= n; i++) {
			if (toggle) {
				h *= 2;
				toggle = false;
			} else {
				++h;
				toggle = true;
			}
		}
		return h;
	}

}
