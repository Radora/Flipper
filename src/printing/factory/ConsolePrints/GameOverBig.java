package printing.factory.ConsolePrints;

import printing.factory.PrintConsole;

public class GameOverBig extends PrintConsole {
    String output = "\n" +
            "  / _` |/ _` | '_ ` _ \\ / _ \\  / _ \\ \\ / / _ \\ '__|\n" +
            " | (_| | (_| | | | | | |  __/ | (_) \\ V /  __/ |   \n" +
            "  \\__, |\\__,_|_| |_| |_|\\___|  \\___/ \\_/ \\___|_|   \n" +
            "   __/ |                                           \n" +
            "  |___/    ";

    public GameOverBig() {
    }


    public String toString(){
        return output;
    }
}
