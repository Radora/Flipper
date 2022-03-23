public class Kicker implements Visitable{

    private int pointsOnHit;

    Kicker(int points){
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
