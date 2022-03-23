public interface Visitor {

    public int visit(Rampe rampe);
    public int visit(Target target);
    public int visit(Bumper bumper);
    public int visit(SlingShot slingShot);
    public int visit(Hole hole);
    public int visit(Kicker kicker);

}
