package flipper_elements;

import visitor.ElementsVisitor;
import visitor.Visitable;

public class Hole implements Visitable {

    private int pointsOnHit;

    Hole(int points){
        pointsOnHit = points;
    }

    @Override
    public double accept(ElementsVisitor visitor) {
        return visitor.visit(this);
    }

    public int getItemPoints(){
        return pointsOnHit;
    }
}
