package arun.training.challenges.algorithms;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class ClimbingLeaderBoardUtilTest {

	private ClimbingLeaderBoardUtil util = new ClimbingLeaderBoardUtil();

	@Test
	public void test() {
		int[] scores = new int[] { 100, 100, 50, 40, 40, 20, 10 };
		int[] player = new int[] { 5, 25, 50, 120 };
		Assert.assertEquals(util.climbingLeaderBoard(scores, player), new int[] { 6, 4, 2, 1 });
	}

	@Test
	public void testFromFileInput() throws IOException, URISyntaxException {
		Stream<String> scores = getStream("ClimbingLeaderBoard-scoreboard.txt");
		Stream<String> player = getStream("ClimbingLeaderBoard-player.txt");
		Stream<String> expected = getStream("ClimbingLeaderBoard-expected.txt");
		Assert.assertEquals(
				util.climbingLeaderBoard(scores.map(Integer::parseInt).mapToInt(Number::intValue).toArray(),
						player.map(Integer::parseInt).mapToInt(Number::intValue).toArray()),
				expected.map(Integer::parseInt).mapToInt(Number::intValue).toArray());

	}

	private Stream<String> getStream(String classpathFilename) throws IOException, URISyntaxException {
		return Files.lines(Paths.get(getClass().getClassLoader().getResource(classpathFilename).toURI()));
	}

}
