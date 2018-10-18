package arun.training.challenges.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class UtopianTreeUtilTest {
	
	private UtopianTreeUtil util = new UtopianTreeUtil();
	
	@Test
	public void test() {
		Assert.assertEquals(util.utopianTree(0), 1);
		Assert.assertEquals(util.utopianTree(1), 2);
		Assert.assertEquals(util.utopianTree(4), 7);
	}
}
