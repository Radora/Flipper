package flipper;

import command.ChangeFlipperStateCommand;
import command.GivePointsCommand;
import flipper_elements.FlipperItem;
import states.*;

import java.util.ArrayList;

public class Flipper {

    private static Flipper instance = null;

    ArrayList<FlipperItem> flipperElements;
    State flipperState;

    GivePointsCommand givePointsCommand;

    int coins;
    int ballsCount;

    private Flipper() {
        flipperElements = new ArrayList<FlipperItem>();
        givePointsCommand = new GivePointsCommand();

        coins = 0;

        flipperState = new NoCreditState(this);

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
