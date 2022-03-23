public class ChangeFlipperStateCommand implements Command{

    Flipper flipperToAdjust;
    State newState;

    public ChangeFlipperStateCommand(Flipper flipper, State state){
        flipperToAdjust = flipper;
    }

    @Override
    public void execute() {
        // change flipper state to class
        System.out.println("Changing flipper state!");
    }
}
