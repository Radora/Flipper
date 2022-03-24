package flipper;

import java.util.Scanner;

public class GameBoard {

    Menu menu = new Menu();
    Flipper flipper = new Flipper();

    public void start() {

        Scanner userInput = new Scanner(System.in);
        menu.printWelcome();
        System.out.println("Insert coins to play!");


        while (true) {
            String input = userInput.nextLine();
            System.out.print("\nWhat would you like to do? : ");
            if (input.equals("insert coin")) {
                System.out.println("Coin inserted!");
                //flipper.setStatus(FlipperStatus.READY);
                //flipper.coinInserted();
                //flipper.printFlipperState();

            }

        }


    }

}
