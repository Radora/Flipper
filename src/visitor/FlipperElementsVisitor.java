package visitor;

import flipper_elements.*;

import java.util.ArrayList;

public class FlipperElementsVisitor implements ElementsVisitor {

    public FlipperElementsVisitor() {
    }

    @Override
    public int visit(Rampe rampe) {
        return rampe.getItemPoints();
    }

    @Override
    public int visit(Target target) {
        return target.getItemPoints();
    }

    @Override
    public int visit(Bumper bumper) {
        return bumper.getItemPoints();
    }

    @Override
    public int visit(SlingShot slingShot) {
        return slingShot.getItemPoints();
    }

    @Override
    public int visit(Kicker kicker) {
        return kicker.getItemPoints();
    }

    @Override
    public void visit(ArrayList<FlipperItem> flipperItemsToVisit) {
        flipperItemsToVisit.forEach((elem) -> System.out.println("Points earned for hitting" + elem.toString()));
    }

    @Override
    public int visit(Hole hole) {
        // ToDo: check balls and game over?
        return -1;
    }

}
