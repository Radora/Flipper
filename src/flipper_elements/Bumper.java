package flipper_elements;

import mediator.ConcreteMediator;
import mediator.Mediator;
import visitor.ElementsVisitor;
import visitor.Visitable;

public class Bumper implements Visitable, FlipperItem {

    private int pointsOnHit;
    private String name;
    Mediator mediator;

    public Bumper(String elemName, int points) {
        pointsOnHit = points;
        name = elemName;
        mediator = new ConcreteMediator();

    }

    @Override
    public double accept(ElementsVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public int hit() {
        mediator.notify(this);
        return pointsOnHit;
    }

    public int getItemPoints() {
        return pointsOnHit;
    }

    public String getName() {
        return name;
    }


}
