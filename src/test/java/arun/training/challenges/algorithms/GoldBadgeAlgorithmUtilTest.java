package arun.training.challenges.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class GoldBadgeAlgorithmUtilTest {
	private GoldBadgeAlgorithmUtil util = new GoldBadgeAlgorithmUtil();

	@Test
	public void testAngryProfessor() {
		Assert.assertEquals(util.angryProfessor(3, new int[] { -1, -3, 4, 2 }), "YES");
		Assert.assertEquals(util.angryProfessor(2, new int[] { 0, -1, 2, 1 }), "NO");
	}

	@Test
	public void testBeautifulDays() {
		Assert.assertEquals(util.beautifulDays(20, 23, 6), 2);
		Assert.assertEquals(util.beautifulDays(13, 45, 3), 32);
	}

	@Test
	public void testViralAdvertising() {
		Assert.assertEquals(util.viralAdvertising(3), 9);
	}
}
