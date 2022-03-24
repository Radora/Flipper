package factory;

public class DisplayBallThree implements FlipperDisplayFactory{

    String output = "\n" +
            "$$$$$$$\\   $$$$$$\\  $$\\       $$\\              $$$$$$\\  \n" +
            "$$  __$$\\ $$  __$$\\ $$ |      $$ |            $$ ___$$\\ \n" +
            "$$ |  $$ |$$ /  $$ |$$ |      $$ |            \\_/   $$ |\n" +
            "$$$$$$$\\ |$$$$$$$$ |$$ |      $$ |              $$$$$ / \n" +
            "$$  __$$\\ $$  __$$ |$$ |      $$ |              \\___$$\\ \n" +
            "$$ |  $$ |$$ |  $$ |$$ |      $$ |            $$\\   $$ |\n" +
            "$$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\       \\$$$$$$  |\n" +
            "\\_______/ \\__|  \\__|\\________|\\________|       \\______/ \n";

    public DisplayBallThree(){}

    public DisplayBallThree(String newOutput){
        this.output = newOutput;
    }

    @Override
    public void display() {
        System.out.println(output);
    }


}
