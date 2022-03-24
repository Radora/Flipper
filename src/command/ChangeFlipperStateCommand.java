package command;

import flipper.Flipper;
import states.State;
import visitor.Visitor;


public class ChangeFlipperStateCommand implements Command {

    flipper.Flipper flipperToAdjust;
    State newFlipperState;

    public ChangeFlipperStateCommand(Flipper flipper, State state){
        flipperToAdjust = flipper;
        newFlipperState = state;
    }

    @Override
    public void execute() {
        // change flipper state to class
        System.out.println("Changing flipper state!");
    }
}
