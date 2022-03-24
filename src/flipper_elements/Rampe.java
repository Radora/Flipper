package flipper_elements;

import mediator.Mediator;
import visitor.Visitor;
import visitor.Visitable;

public class Rampe implements Visitable, FlipperItem {

    private int pointsOnHit;
    private boolean rampeIsOpen = false;


    // Set open to true?
    public Rampe(int points){
        pointsOnHit = points;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getItemPoints(){
        return pointsOnHit;
    }

    @Override
    public int hit() {
        return pointsOnHit;
    }
}
