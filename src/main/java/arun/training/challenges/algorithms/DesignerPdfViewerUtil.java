package arun.training.challenges.algorithms;

public class DesignerPdfViewerUtil {

	public int designerPdfViewer(final int[] h, String word) {
		return word.length() * word.chars().map(x -> h[x - 'a']).max().getAsInt();
	}

}
