package arun.training.challenges.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class DesignerPdfViewerUtilTest {

	private DesignerPdfViewerUtil util = new DesignerPdfViewerUtil();

	@Test
	public void test() {
		int[] h = new int[] { 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
		String word = "abc";
		int expected = 9;

		Assert.assertEquals(util.designerPdfViewer(h, word), expected);
	}
}
