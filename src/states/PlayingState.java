package states;


import flipper.Flipper;

public class PlayingState implements State {

    Flipper flipper;

    public PlayingState(Flipper newFlipper) {
        flipper = newFlipper;
    }

    public String toString() {
        return "PLAYING_STATE";
    }

    @Override
    public void coinInserted(Flipper flipper) {
        flipper.addCoin();
    }

    @Override
    public void startPressed(Flipper flipper) {
        System.out.println("Authors of this flipper: ");
    }
}
