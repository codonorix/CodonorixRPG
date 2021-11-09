package MainFiles;

import Characters.PlayerObject;
import Items.Boots.bootsConstructor;
import Menus.menus;

import java.util.Scanner;

public class codoMain {
    public static void main(String[] args) {
        Scanner input;

        menus mainMenu = new menus();

        int choice;

        while (true) {
            try {
                System.out.println(mainMenu.startMenu());
                input = new Scanner(System.in);
                choice = input.nextInt();

                if (choice > 3 || choice < 1) {
                    System.out.println("Please enter a valid selection.");
                    continue;
                }
                break;
            } catch (Exception ex) {
                System.out.println("Please enter a valid selection.");
            }
        }

        if (choice == 1) {
            NewGame createChar = new NewGame();
            PlayerObject newPlayer = createChar.newGame();

            GamePlay.gamePlay.newGamePlay(newPlayer);
        }

//        PlayerObject character = new PlayerObject("Logan", 0, 0, 0, 0, 0, "a",
//                "b", "c", "d", "e", "f");
//
//        System.out.println(character);
    }
}
