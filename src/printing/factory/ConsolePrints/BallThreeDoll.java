package printing.factory.ConsolePrints;

import printing.factory.PrintConsole;

public class BallThreeDoll extends PrintConsole {

    String output = "\n" +
            "$$$$$$$\\   $$$$$$\\  $$\\       $$\\              $$$$$$\\  \n" +
            "$$  __$$\\ $$  __$$\\ $$ |      $$ |            $$ ___$$\\ \n" +
            "$$ |  $$ |$$ /  $$ |$$ |      $$ |            \\_/   $$ |\n" +
            "$$$$$$$\\ |$$$$$$$$ |$$ |      $$ |              $$$$$ / \n" +
            "$$  __$$\\ $$  __$$ |$$ |      $$ |              \\___$$\\ \n" +
            "$$ |  $$ |$$ |  $$ |$$ |      $$ |            $$\\   $$ |\n" +
            "$$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\       \\$$$$$$  |\n" +
            "\\_______/ \\__|  \\__|\\________|\\________|       \\______/ \n";

    public BallThreeDoll(){}

    public String toString(){
        return output;
    }


}
