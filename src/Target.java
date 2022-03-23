public class Target implements Visitable{

    private int pointsOnHit;

    public Target(int points){
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
