package flipper;

import command.ChangeFlipperStateCommand;
import command.GivePointsCommand;
import flipper_elements.FlipperItem;
import states.PlayingState;
import states.ReadyState;
import states.State;

import java.util.ArrayList;

public class Flipper {

    State flipperState;
    ArrayList<FlipperItem> flipperElements;
    ChangeFlipperStateCommand flipperStateCommand;
    GivePointsCommand givePointsCommand;

    int coins;
    int ballsCount;

    public Flipper() {
        flipperState = new ReadyState();
        flipperElements = new ArrayList<FlipperItem>();
        coins = 0;
    }

    private void addCoin() {
        coins++;
    }

    private void setFlipperState(State newState) {
        this.flipperState = newState;
    }

    private void createFlipperElements(ArrayList<FlipperItem> elements) {
        this.flipperElements = elements;
    }


    private void addFlipperElement(FlipperItem elementToAdd) {
        this.flipperElements.add(elementToAdd);
    }


    // If in playing state, display Authors
    private void startPressed() {


        //this.flipperState = flipperStateCommand.
    }

    private void elementHitted(FlipperItem item) {
        givePointsCommand = new GivePointsCommand(item);
        givePointsCommand.execute();
    }

}
