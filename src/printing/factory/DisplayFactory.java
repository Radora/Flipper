package printing.factory;


public abstract class DisplayFactory {

    public DisplayFactory() {
    }

    public abstract PrintConsole printWelcome();

    public abstract PrintConsole printGameOver();

    public abstract PrintConsole printBallOne();

    public abstract PrintConsole printBallTwo();

    public abstract PrintConsole printBallThree();

}

