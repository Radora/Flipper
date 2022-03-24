package factory;

import factory.ConsolePrints.BallThreeDoll;
import factory.ConsolePrints.BallTwoDoll;
import factory.ConsolePrints.GameOverDoll;
import factory.ConsolePrints.WelcomeDoll;

public class DollFactory extends DisplayFactory {


    @Override
    public PrintConsole printWelcome() {
        return new WelcomeDoll();
    }

    @Override
    public PrintConsole printGameOver() {
        return new GameOverDoll();
    }

    @Override
    public PrintConsole printBallOne() {
        return new BallTwoDoll();
    }

    @Override
    public PrintConsole printBallTwo() {
        return new BallTwoDoll();
    }

    @Override
    public PrintConsole printBallThree() {
        return new BallThreeDoll();
    }
}
