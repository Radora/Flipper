package printing.factory;

public class Console {

    private DisplayFactory displayFactory;

    public Console(Console.GreetingType greetingType) {

        if (greetingType.equals(GreetingType.BIG)) {
            this.displayFactory = new BigFactory();

        } else if (greetingType.equals(GreetingType.DOLL)) {
            this.displayFactory = new DollFactory();
        } else {
            throw new IllegalStateException("No such type: " + greetingType);
        }

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


    public static enum GreetingType {
        DOLL,
        BIG;

        private GreetingType() {
        }
    }
}
