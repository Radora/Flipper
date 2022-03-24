package factory;

public class Console {

    private DisplayFactory displayFactory;

    public Console(Console.GreetingType greetingType) {

//        switch (greetingType) {
//            case 1:
//                this.displayFactory = new BigFactory();
//                break;
//            case 2:
//                this.displayFactory = new DollFactory();
//                break;
//            default:
//                throw new IllegalStateException("No such type: " + greetingType);
//        }

    }

    public void start() {
        System.out.println(this.displayFactory.printWelcome());
    }

    public void stop() {
        System.out.println(this.displayFactory.printGameOver());
    }

    public void print(String s) {
        System.out.println("> " + s);
    }

    public static void main(String[] args) {
        Console c = new Console(GreetingType.BIG);
        c.start();
        c.print("blah");
        c.print("blah blah");
        c.print("blah blah blah");
        c.stop();
    }

    static enum GreetingType {
        DOLL,
        BIG;

        private GreetingType() {
        }
    }
}
