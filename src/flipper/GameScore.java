package flipper;

public class GameScore {

    int currentGameScore;

    public GameScore() {
        currentGameScore = 0;
    }

    private int addToScore(int points) {
        currentGameScore += points;
        return currentGameScore;
    }

    private int substractFromScore(int pointsToSubstract) {
        // ToDo: Check for negative score
        currentGameScore -= pointsToSubstract;
        return currentGameScore;
    }


}
