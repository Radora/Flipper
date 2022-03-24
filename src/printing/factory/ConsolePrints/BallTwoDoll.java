package printing.factory.ConsolePrints;

import printing.factory.PrintConsole;

public class BallTwoDoll extends PrintConsole {

    static String output = "\n" +
            "$$$$$$$\\   $$$$$$\\  $$\\       $$\\              $$$$$$\\  \n" +
            "$$  __$$\\ $$  __$$\\ $$ |      $$ |            $$  __$$\\ \n" +
            "$$ |  $$ |$$ /  $$ |$$ |      $$ |            \\__/  $$ |\n" +
            "$$$$$$$\\ |$$$$$$$$ |$$ |      $$ |             $$$$$$  |\n" +
            "$$  __$$\\ $$  __$$ |$$ |      $$ |            $$  ____/ \n" +
            "$$ |  $$ |$$ |  $$ |$$ |      $$ |            $$ |      \n" +
            "$$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\       $$$$$$$$\\ \n" +
            "\\_______/ \\__|  \\__|\\________|\\________|      \\________|\n";

    public BallTwoDoll() {
    }

    public String toString(){
        return output;
    }


}
