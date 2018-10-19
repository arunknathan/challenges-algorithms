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

	@Test
	public void testSaveThePrisoner() {
		Assert.assertEquals(util.saveThePrisoner(7, 19, 2), 6);
		Assert.assertEquals(util.saveThePrisoner(3, 7, 3), 3);
		Assert.assertEquals(util.saveThePrisoner(7, 7, 1), 7);
	}

	@Test
	public void testCircularArrayRotation() {
		Assert.assertEquals(util.circularArrayRotation(new int[] { 1, 2, 3 }, 2, new int[] { 0, 1, 2 }),
				new int[] { 2, 3, 1 });
	}

	@Test
	public void testPermutationEquation() {
		Assert.assertEquals(util.permutationEquation(new int[] { 4, 3, 5, 1, 2 }), new int[] { 1, 3, 5, 4, 2 });
	}
}
