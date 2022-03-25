package flipper;

import command.ChangeFlipperStateCommand;
import command.GivePointsCommand;
import flipper_elements.FlipperItem;
import states.*;

import java.util.ArrayList;

public class Flipper {

    private static Flipper instance = null;

    ArrayList<FlipperItem> flipperElements;
    State noCreditState;
    State readyState;
    State playingState;

    State flipperState;

    GivePointsCommand givePointsCommand;

    int coins;
    int ballsCount;

    private Flipper() {
        flipperElements = new ArrayList<FlipperItem>();
        givePointsCommand = new GivePointsCommand();

        noCreditState = new NoCreditState(this);
        readyState = new ReadyState(this);
        playingState = new PlayingState(this);
        coins = 0;

        flipperState = noCreditState;

    }

    public static Flipper Instance() {
        if (instance == null) {
            instance = new Flipper();
        }

        return instance;

    }

    public void setFlipperState(State newState) {
        flipperState = newState;
    }

    public void addCoin() {
        coins++;
    }
    public State getNoCreditState() {
        return noCreditState;
    }


    public void setNoCreditState(State noCreditState) {
        this.noCreditState = noCreditState;
    }

    public State getReadyState() {
        return readyState;
    }

    public void setReadyState(State readyState) {
        this.readyState = readyState;
    }

    public State getPlayingState() {
        return playingState;
    }

    public void setPlayingState(State playingState) {
        this.playingState = playingState;
    }


    public void createFlipperElements(ArrayList<FlipperItem> elements) {
        this.flipperElements = elements;
    }


    public void addFlipperElement(FlipperItem elementToAdd) {
        this.flipperElements.add(elementToAdd);
    }


    private void elementHitted(FlipperItem item) {
        givePointsCommand = new GivePointsCommand(item);
        givePointsCommand.execute();
    }

    public int getCoins() {
        return coins;
    }

    public int getBallsCount() {
        return ballsCount;
    }

    public void setBallsCount(int ballsCount) {
        this.ballsCount = ballsCount;
    }

}
