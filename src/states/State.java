package states;

import flipper.Flipper;

public interface State {

    void coinInserted(Flipper flipper);
    void startPressed(Flipper flipper);

}