package factory;

import factory.ConsolePrints.*;

public class BigFactory extends DisplayFactory {


    @Override
    public PrintConsole printWelcome() {
        return new WelcomeBig();
    }

    @Override
    public PrintConsole printGameOver() {
        return new GameOverBig();
    }

    @Override
    public PrintConsole printBallOne() {
        return new BallOneBig();
    }

    @Override
    public PrintConsole printBallTwo() {
        return new BallTwoBig();
    }

    @Override
    public PrintConsole printBallThree() {
        return new BallThreeBig();
    }
}
