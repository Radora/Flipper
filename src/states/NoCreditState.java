package states;

import flipper.Flipper;

public class NoCreditState implements State {

    Flipper flipper;

    public NoCreditState(Flipper newFlipper) {
        flipper = newFlipper;
    }

    @Override
    public void coinInserted(Flipper flipper) {
        flipper.addCoin();
        flipper.setFlipperState(new ReadyState(this.flipper));
    }

    @Override
    public void startPressed(Flipper flipper) {
        System.out.println("Insert credits first!");
    }

    public String toString() {
        return "NO_CREDIT_STATE";
    }
}
