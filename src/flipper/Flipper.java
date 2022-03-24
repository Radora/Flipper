package flipper;

import flipper_elements.FlipperItem;
import states.ReadyState;
import states.State;

import java.util.ArrayList;

public class Flipper {

    State flipperState;
    ArrayList<FlipperItem> flipperElements;

    public Flipper() {

        flipperState = new ReadyState();
        flipperElements = new ArrayList<FlipperItem>();

    }

    private void setFlipperState(State newState) {
        this.flipperState = newState;
    }

    private void createFlipperElements(ArrayList<FlipperItem> elements) {
        this.flipperElements = elements;
    }


    public void addFlipperElement(FlipperItem elementToAdd){
        this.flipperElements.add(elementToAdd);
    }


}
