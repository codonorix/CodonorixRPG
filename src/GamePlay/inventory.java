package GamePlay;

import Characters.PlayerObject;
import Inputs.input;
import Menus.menus;

public class inventory {
    Menus.menus menusClass = new menus();
    Inputs.input inputClass = new input();
    int choice;

    public void invSelect(PlayerObject player) {

        while (true) {
            System.out.println(menusClass.invMenu());
            choice = inputClass.intInput();

            if (choice > 7 || choice < 0) {
                System.out.println("Please select a valid option.");
                continue;
            }

            switch (choice) {
                case 1:
                    helmets(player);
                    continue;
                case 2:
                    chestplates(player);
                    continue;
                case 3:
                    leggings(player);
                    continue;
                case 4:
                    boots(player);
                    continue;
                case 5:
                    swords(player);
                    continue;
                case 6:
                    potions(player);
                    continue;
                case 7:
                    arrows(player);
                    continue;
                case 0:
                    break;
                default:
                    System.out.println("ERROR YOU DID DONE BROKE SOMETHING");
            }
            break;
        }
    }

    //===========================================| HELMETS |===========================================\\
    public void helmets(PlayerObject player) {
        try {
            System.out.println("\n├────────────────────────────────────────┤\n");

            for (int i = 0; i < player.getHelmentSet().size(); i++) {
                //Getting the helmets name to easily display in a list of numbers
                String helmName = player.getHelmentSet().get(i).getName();

                System.out.println(i + ": " + helmName);
            }
            System.out.println("\n├────────────────────────────────────────┤\n");

            while (true) {
                try {
                    System.out.println("Please select a number or type -1 to return to menu...");
                    choice = inputClass.intInput();

                    if (choice == -1) {
                        break;
                    }
                    System.out.println(player.getHelmentSet().get(choice));
                } catch (Exception ex) {
                    System.out.println("Please enter a valid input.");
                }
            }
        } catch (Exception ex) {
            System.out.println("You do not have any of this item.");
        }
    }

    //===========================================| CHESTPLATES |===========================================\\
    public void chestplates(PlayerObject player) {
        try {
            System.out.println("\n├────────────────────────────────────────┤\n");

            for (int i = 0; i < player.getChestPlateSet().size(); i++) {
                //Getting the chestplates name to easily display in a list of numbers
                String chestPlateName = player.getChestPlateSet().get(i).getName();

                System.out.println(i + ": " + chestPlateName);
            }
            System.out.println("\n├────────────────────────────────────────┤\n");

            while (true) {
                try {
                    System.out.println("Please select a number or type -1 to return to menu...");
                    choice = inputClass.intInput();

                    if (choice == -1) {
                        break;
                    }
                    System.out.println(player.getChestPlateSet().get(choice));
                } catch (Exception ex) {
                    System.out.println("Please enter a valid input.");
                }
            }
        } catch (Exception ex) {
            System.out.println("You do not have any of this item.");
        }
    }

    //===========================================| LEGGINGS |===========================================\\
    public void leggings(PlayerObject player) {
        try {
            System.out.println("\n├────────────────────────────────────────┤\n");

            for (int i = 0; i < player.getLeggingSet().size(); i++) {
                //Getting the leggings name to easily display in a list of numbers
                String leggingsName = player.getLeggingSet().get(i).getName();

                System.out.println(i + ": " + leggingsName);
            }
            System.out.println("\n├────────────────────────────────────────┤\n");

            while (true) {
                try {
                    System.out.println("Please select a number or type -1 to return to menu...");
                    choice = inputClass.intInput();

                    if (choice == -1) {
                        break;
                    }
                    System.out.println(player.getLeggingSet().get(choice));
                } catch (Exception ex) {
                    System.out.println("Please enter a valid input.");
                }
            }
        } catch (Exception ex) {
            System.out.println("You do not have any of this item.");
        }
    }

    //===========================================| BOOTS |===========================================\\
    public void boots(PlayerObject player) {
        try {
            System.out.println("\n├────────────────────────────────────────┤\n");

            for (int i = 0; i < player.getBootSet().size(); i++) {
                //Getting the boot name to easily display in a list of numbers
                String bootName = player.getBootSet().get(i).getName();

                System.out.println(i + ": " + bootName);
            }
            System.out.println("\n├────────────────────────────────────────┤\n");

            while (true) {
                try {
                    System.out.println("Please select a number or type -1 to return to menu...");
                    choice = inputClass.intInput();

                    if (choice == -1) {
                        break;
                    }
                    System.out.println(player.getBootSet().get(choice));
                } catch (Exception ex) {
                    System.out.println("Please enter a valid input.");
                }
            }
        } catch (Exception ex) {
            System.out.println("You do not have any of this item.");
        }
    }

    //===========================================| SWORDS |===========================================\\
    public void swords(PlayerObject player) {

    }

    //===========================================| POTIONS |===========================================\\
    public void potions(PlayerObject player) {

    }

    //===========================================| ARROWS |===========================================\\
    public void arrows(PlayerObject player) {

    }
}
