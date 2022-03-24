package factory;

import java.net.DatagramSocketImpl;

public class DisplayStart implements FlipperDisplayFactory{

    // ToDo: Replace string
    String output = "\n" +
            "$$$$$$$\\   $$$$$$\\  $$\\       $$\\               $$\\   \n" +
            "$$  __$$\\ $$  __$$\\ $$ |      $$ |            $$$$ |  \n" +
            "$$ |  $$ |$$ /  $$ |$$ |      $$ |            \\_$$ |  \n" +
            "$$$$$$$\\ |$$$$$$$$ |$$ |      $$ |              $$ |  \n" +
            "$$  __$$\\ $$  __$$ |$$ |      $$ |              $$ |  \n" +
            "$$ |  $$ |$$ |  $$ |$$ |      $$ |              $$ |  \n" +
            "$$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\       $$$$$$\\ \n" +
            "\\_______/ \\__|  \\__|\\________|\\________|      \\______|\n";


    public DisplayStart(){};

    public DisplayStart(String newOutput){
        this.output = newOutput;
    }

    @Override
    public void display() {
        System.out.printf(output);
    }
}
