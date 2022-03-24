package factory.ConsolePrints;

import factory.PrintConsole;

public class WelcomeBig extends PrintConsole {

    static String output = "\n" +
            "               _                          \n" +
            "              | |                         \n" +
            " __      _____| | ___ ___  _ __ ___   ___ \n" +
            " \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\\n" +
            "  \\ V  V /  __/ | (_| (_) | | | | | |  __/\n" +
            "   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|\n" +
            "                                          \n" +
            "                                          \n";


    public WelcomeBig() {
    }

    public String toString(){
        return output;
    }


}