package printing.factory;

import printing.factory.ConsolePrints.*;

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
        return new BallOneDoll();
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
