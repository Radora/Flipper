package flipper_elements;

import mediator.Mediator;
import visitor.Visitor;
import visitor.Visitable;

public class Bumper implements Visitable {

    private int pointsOnHit;
    Mediator mediator;

    Bumper(int points){
        pointsOnHit = points;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getItemPoints(){
        return pointsOnHit;
    }
}
