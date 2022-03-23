public class GivePointsCommand implements Command {

    FlipperItem itemToHit;

    public GivePointsCommand(FlipperItem item) {
        itemToHit = item;
    }

    @Override
    public void execute() {
        itemToHit.hit();
    }


}
