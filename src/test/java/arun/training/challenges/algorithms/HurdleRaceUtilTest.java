package arun.training.challenges.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HurdleRaceUtilTest {

	private HurdleRaceUtil util = new HurdleRaceUtil();

	@Test
	public void test() {
		Assert.assertEquals(util.hurdleRace(4, new int[] { 1, 6, 3, 5, 2 }), 2);
	}
	
	@Test
	public void testNoBoostNeeded() {
		Assert.assertEquals(util.hurdleRace(4, new int[] { 1, 4, 3, 4, 2 }), 0);
	}

}
