package command;

import flipper_elements.FlipperItem;

public class GivePointsCommand implements Command {

    FlipperItem itemToHit;

    public GivePointsCommand() {
    }

    public GivePointsCommand(FlipperItem item) {
        itemToHit = item;
    }

    @Override
    public void execute() {
        itemToHit.hit();
    }


}
