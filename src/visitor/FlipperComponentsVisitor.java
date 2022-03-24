package visitor;

import flipper_elements.*;

public class FlipperComponentsVisitor implements Visitor {

    public FlipperComponentsVisitor(){}

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
    public int visit(Hole hole) {
        // ToDo: check balls and game over?
        return -1;
    }

}
