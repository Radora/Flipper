public class Flipper {

    int credits = 0;
    FlipperStatus status = FlipperStatus.NO_CREDIT;

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public FlipperStatus getStatus() {
        return status;
    }

    public void setStatus(FlipperStatus state) {
        this.status = state;
    }

    public void coinInserted(){
        this.credits++;
    }

    public void printFlipperState() {
        System.out.println("\nStatus: " + status);
        System.out.println("Credits: " + credits);
    }
}
