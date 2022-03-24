package factory;

public class DisplayBallTwo implements FlipperDisplayFactory{

        String output = "\n" +
                "$$$$$$$\\   $$$$$$\\  $$\\       $$\\              $$$$$$\\  \n" +
                "$$  __$$\\ $$  __$$\\ $$ |      $$ |            $$  __$$\\ \n" +
                "$$ |  $$ |$$ /  $$ |$$ |      $$ |            \\__/  $$ |\n" +
                "$$$$$$$\\ |$$$$$$$$ |$$ |      $$ |             $$$$$$  |\n" +
                "$$  __$$\\ $$  __$$ |$$ |      $$ |            $$  ____/ \n" +
                "$$ |  $$ |$$ |  $$ |$$ |      $$ |            $$ |      \n" +
                "$$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$$$$$$$\\       $$$$$$$$\\ \n" +
                "\\_______/ \\__|  \\__|\\________|\\________|      \\________|\n";

        public DisplayBallTwo(){}

        public DisplayBallTwo(String newOutput){
            this.output = newOutput;
        }

        @Override
        public void display() {
            System.out.println(output);
        }



}
