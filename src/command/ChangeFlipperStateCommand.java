package command;

import states.State;


public class ChangeFlipperStateCommand implements Command {

    flipper.Flipper flipperToAdjust;
    State newFlipperState;

    public ChangeFlipperStateCommand() {
    }


    @Override
    public void execute() {
        // change flipper state to class
        System.out.println("Changing flipper state!");
    }
}
