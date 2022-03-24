package visitor;

import flipper_elements.*;

import java.util.ArrayList;

public interface ElementsVisitor {

    int visit(Rampe rampe);

    int visit(Target target);

    int visit(Bumper bumper);

    int visit(SlingShot slingShot);

    int visit(Hole hole);

    int visit(Kicker kicker);

    void visit(ArrayList<FlipperItem> flipperItemsToVisit);

}
