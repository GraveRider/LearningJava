import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Birdwatcher birdwatcher = new Birdwatcher();
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.print("?");
            String command = reader.nextLine();

            if(command.equals("Quit")) {
                break;
            }
            else if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("\n" + "Latin Name: ");
                String latinName = reader.nextLine();
                birdwatcher.add(new Bird(name, latinName));
            }
            else if(command.equals("Observation")) {
                System.out.print("What was observed? ");
                String name = reader.nextLine();
                if(birdwatcher.isInDatabase(name)) {
                    birdwatcher.getBird(name).observation();
                }
                else {
                    System.out.println(" \n Is not a bird!");
                }
            }

            else if(command.equals("Show")) {
                System.out.print("What?");
                String name = reader.nextLine();
                if(birdwatcher.isInDatabase(name)) {
                    birdwatcher.show(name);
                }
                else {
                    System.out.println("Bird not found");
                }
            }
            else if(command.equals("Statistics")) {
                birdwatcher.statistics();
            }

            else {
                System.out.println("Command is Invalid! Try again: ");
            }
        }



            
    }

}
