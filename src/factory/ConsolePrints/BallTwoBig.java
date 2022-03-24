package factory.ConsolePrints;

import factory.PrintConsole;

public class BallTwoBig extends PrintConsole {

    String output = "\n" +
            "  _           _ _   ___  \n" +
            " | |         | | | |__ \\ \n" +
            " | |__   __ _| | |    ) |\n" +
            " | '_ \\/ _` | | |   / / \n" +
            " | |_) | (_| | | |  / /_ \n" +
            " |_.__/\\__,_|_|_| |____|";

    public BallTwoBig() {
    }

    public String toString(){
        return output;
    }
}
