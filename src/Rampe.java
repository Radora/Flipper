public class Rampe implements Visitable,FlipperItem{

    private int pointsOnHit;

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
