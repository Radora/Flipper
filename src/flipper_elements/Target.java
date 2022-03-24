package flipper_elements;

import mediator.ConcreteMediator;
import mediator.Mediator;
import visitor.ElementsVisitor;
import visitor.Visitable;

public class Target implements Visitable {

    private int pointsOnHit;
    private String name;
    Mediator mediator;

    public Target(String elemName, int points){
        pointsOnHit = points;
        name = elemName;
        mediator = new ConcreteMediator();
    }

    @Override
    public double accept(ElementsVisitor visitor) {
        return visitor.visit(this);
    }

    public int getItemPoints(){
        return pointsOnHit;
    }
}
