public class Bumper implements Visitable{

    private int pointsOnHit;

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
