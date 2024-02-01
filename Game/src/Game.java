import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    Player player;
    Location location;

    public void start(){
        System.out.println("Welcome To Adventure Game !");
        System.out.print("Please enter a player name : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " welcome to game !");
        System.out.println("This game includes darkness, fear and mystery.");
        player.selectChar();
        Location location = null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("**************************Locations**************************");
            System.out.println("----------------------------------------------");
            System.out.println("0- Go Out !");
            System.out.println("1- Safe House");
            System.out.println("2- Tool Store");
            System.out.println("3- Cave");
            System.out.println("4- Forest");
            System.out.println("5- River");
            System.out.println("----------------------------------------------");
            System.out.print("Please enter place of your want to go : ");

            int selectLoc = input.nextInt();
            System.out.println();
            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Invalid region, please enter a valid region !");
            }
            if (location == null){
                System.out.println("You leave the Game !");
                break;
            }
           if(!location.onLocation()){
               System.out.println("GAME OVER !!");
               break;
           }
        }

    }

}
