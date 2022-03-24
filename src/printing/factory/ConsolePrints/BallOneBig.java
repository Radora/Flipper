package printing.factory.ConsolePrints;

import printing.factory.PrintConsole;

public class BallOneBig extends PrintConsole {

    String output = "\n" +
            " | |         | | | /_ |\n" +
            " | |__   __ _| | |  | |\n" +
            " | '_ \\ / _`| | |  | |\n" +
            " | |_) | (_| | | |  | |\n" +
            " |_.__/\\__,_|_|_|  |_|";

    public BallOneBig() {
    }


    public String toString(){
        return output;
    }
}
