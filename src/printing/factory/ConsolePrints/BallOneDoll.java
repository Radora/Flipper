package printing.factory.ConsolePrints;

import printing.factory.PrintConsole;

public class BallOneDoll extends PrintConsole {

    String output = "\n" +
            "$$$$$$$\\   $$$$$$\\  $$\\       $$\\               $$\\   \n" +
            "$$  __$$\\ $$  __$$\\ $$ |      $$ |            $$$$ |  \n" +
            "$$ |  $$ |$$ /  $$ |$$ |      $$ |            \\_$$ |  \n" +
            "$$$$$$$\\ |$$$$$$$$ |$$ |      $$ |              $$ |  \n" +
            "$$  __$$\\ $$  __$$ |$$ |      $$ |              $$ |  \n" +
            "$$ |  $$ |$$ |  $$ |$$ |      $$ |              $$ |  \n" +
            "$$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\       $$$$$$\\ \n" +
            "\\_______/ \\__|  \\__|\\________|\\________|      \\______|\n";

    public BallOneDoll() {
    }

    public String toString(){
        return output;
    }


}
