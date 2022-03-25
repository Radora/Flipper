package states;

import flipper.Flipper;

public class ReadyState implements State {

    Flipper flipper;

    public ReadyState(Flipper newFlipper) {
        flipper = newFlipper;
    }

    public String toString() {
        return "READY_STATE";
    }

    @Override
    public void coinInserted(Flipper flipper) {
        flipper.addCoin();
    }

    @Override
    public void startPressed(Flipper flipper) {
        System.out.println("Game is starting...");
        flipper.setFlipperState(new PlayingState(this.flipper));
    }
}
