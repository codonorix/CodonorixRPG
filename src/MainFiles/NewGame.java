package MainFiles;

import Characters.PlayerObject;
import Items.Helmets.helmetConstructor;

import java.util.ArrayList;
import java.util.Scanner;

public class NewGame {
    public PlayerObject newGame() {
        ArrayList<helmetConstructor> helmets = new ArrayList<>();
        helmetConstructor helm1 = new helmetConstructor("bob", "da", "helmet", 1, 5,
                5, "COMMON", 5);

        helmetConstructor helm2 = new helmetConstructor("Jeff", "da", "helmet", 1, 5,
                5, "RARE", 5);

        helmetConstructor helm3 = new helmetConstructor("Sam", "da", "helmet", 1, 5,
                5, "EPIC", 5);

        helmetConstructor helm4 = new helmetConstructor("Carpenter", "da", "helmet", 1, 5,
                5, "LEGENDARY", 5);

        helmetConstructor helm5 = new helmetConstructor("Sally", "da", "helmet", 1, 5,
                5, "MYTHIC", 5);

        helmets.add(helm1);
        helmets.add(helm2);
        helmets.add(helm3);
        helmets.add(helm4);
        helmets.add(helm5);

        Scanner input = new Scanner(System.in);
        String menu = "\n├────────────────────────────────────────┤\n";
        menu += "\t\t\tWelcome to CodoRPG\n\n";
        menu += "\t\t  Please enter your name\n";
        menu += "├────────────────────────────────────────┤\n";

        System.out.println(menu);
        String name = input.nextLine();

        return new PlayerObject(name, 1, 5000, 0, 1, 50, 0, 0, "", "", "",
                "", "fists", "", helmets, null, null, null,
                null, null, null, 0);
    }
}
