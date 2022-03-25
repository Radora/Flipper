import flipper.Flipper;
import flipper_elements.Bumper;
import flipper_elements.Rampe;
import printing.factory.Console;
import visitor.FlipperElementsVisitor;

public class Main {
    public static void main(String[] args) {

        FlipperElementsVisitor flipperComponentsVisitor = new FlipperElementsVisitor();
        Flipper flipper = Flipper.Instance();

        Rampe rampeA = new Rampe("RampeLinks", 5);
        Rampe rampeB = new Rampe("RampeRechts", 15);
        Bumper bumperA = new Bumper("BumberA", 50);

        Console console = new Console(Console.GreetingType.BIG);
        console.start();
        console.print("testing stuff");
        console.stop();
        console.printBallOne();


//        System.out.println(flipperComponentsVisitor.visit(bumperA));
//        System.out.println(flipperComponentsVisitor.visit(rampeB));
//        System.out.println(flipperComponentsVisitor.visit(rampeA));




    }
}
