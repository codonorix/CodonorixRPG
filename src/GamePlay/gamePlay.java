package GamePlay;

import Characters.PlayerObject;
import Menus.menus;

import java.util.Scanner;

public class gamePlay {

    public static void newGamePlay(PlayerObject player){
        Scanner input = new Scanner(System.in);

        int choice;


        while (true) {
            gamePlay menuCall = new gamePlay();
            choice = menuCall.mainOptions();
            inventory invClass = new inventory();

            //======================| EXPLORE |======================\\
            if (choice == 1) {
                System.out.println("WIP");

            //======================| STATS |======================\\
            }else if (choice == 2) {
                System.out.println(player);
                System.out.println("\n Press any enter to continue...");

                try {
                    //Waits for enter key push, error can be ignored.
                    System.in.read();
                }catch(Exception ex){
                    System.out.println("Please press enter");
                }

            //======================| INVENTORY |======================\\
            }else if (choice == 3) {
                invClass.invSelect(player);

            //======================| TOWN SQUARE |======================\\
            }else if (choice == 4) {
                System.out.println("WIP");

            //======================| ENCYCLOPEDIA |======================\\
            }else if (choice == 5) {
                System.out.println("WIP");

            //======================| ENCYCLOPEDIA |======================\\
            }else if (choice == 0) {
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }

    public int mainOptions() {
        Menus.menus startMenu = new menus();

        Scanner input;

        int choice;

        while (true) {
            try {
                System.out.println(startMenu.gameMenu());

                input = new Scanner(System.in);
                choice = input.nextInt();

                //Menu choice, when menu grows be sure to expand the "5"
                if (choice > 5 || choice < 0) {
                    System.out.println("Please enter a valid selection.");
                    continue;
                }
                break;
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return choice;
    }
}
