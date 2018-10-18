package arun.training.challenges.algorithms;

import java.util.Arrays;

public class ClimbingLeaderBoardUtil {

	public int[] climbingLeaderBoard(int[] scoresInDescOrder, int[] playerScoresInAscOrder) {
		scoresInDescOrder = Arrays.stream(scoresInDescOrder).distinct().toArray();

		int[] playerRanks = new int[playerScoresInAscOrder.length];

		int j = 0;
		int rank = 1;
		for (int i = playerScoresInAscOrder.length - 1; i > -1; i--) {
			while (j < scoresInDescOrder.length) {
				if (playerScoresInAscOrder[i] >= scoresInDescOrder[j]) {
					break;
				} else {
					++rank;
					++j;
				}
			}
			playerRanks[i] = rank;
		}

		return playerRanks;
	}

}
