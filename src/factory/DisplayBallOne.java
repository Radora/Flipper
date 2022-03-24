package factory;

public class DisplayBallOne implements FlipperDisplayFactory{

    String output = "\n" +
            "$$$$$$$\\   $$$$$$\\  $$\\       $$\\               $$\\   \n" +
            "$$  __$$\\ $$  __$$\\ $$ |      $$ |            $$$$ |  \n" +
            "$$ |  $$ |$$ /  $$ |$$ |      $$ |            \\_$$ |  \n" +
            "$$$$$$$\\ |$$$$$$$$ |$$ |      $$ |              $$ |  \n" +
            "$$  __$$\\ $$  __$$ |$$ |      $$ |              $$ |  \n" +
            "$$ |  $$ |$$ |  $$ |$$ |      $$ |              $$ |  \n" +
            "$$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\       $$$$$$\\ \n" +
            "\\_______/ \\__|  \\__|\\________|\\________|      \\______|\n";

    public DisplayBallOne(){}

    public DisplayBallOne(String newOutput){
        this.output = newOutput;
    }

    @Override
    public void displayOutput() {
        System.out.println(output);
    }

}
