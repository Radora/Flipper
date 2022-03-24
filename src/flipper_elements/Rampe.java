package flipper_elements;

import mediator.ConcreteMediator;
import mediator.Mediator;
import visitor.ElementsVisitor;
import visitor.Visitable;

public class Rampe implements Visitable, FlipperItem {

    private int pointsOnHit;
    private String name;
    Mediator mediator;
    private boolean rampeIsOpen = false;


    // Set open to true?
    public Rampe(String name, int points) {
        this.name = name;
        pointsOnHit = points;
        mediator = new ConcreteMediator();
    }

    @Override
    public double accept(ElementsVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public int hit() {

        return pointsOnHit;
    }

    public int getItemPoints() {
        return pointsOnHit;
    }

    public String getName() {
        return name;
    }

    private void open() {
        if (!rampeIsOpen) {
            this.rampeIsOpen = true;
        }
    }


}
