package Menus;

public class menus {
    public String startMenu() {
        String menu = "\n├────────────────────────────────────────┤\n";
        menu += "〔1〕New Game\n";
        menu += "〔2〕Load Game (COMING SOON)\n";
        menu += "〔3〕Achievements (COMING SOON)\n";
        menu += "├────────────────────────────────────────┤\n";

        return menu;
    }

    public String gameMenu() {
        //As menu grows be sure to update conditional checks within the "gamePlay" class.
        String menu = "\n├────────────────────────────────────────┤\n";
        menu += "〔1〕Explore\n";
        menu += "〔2〕View Stats\n";
        menu += "〔3〕View Inventory\n";
        menu += "〔4〕Go to town square\n";
        menu += "〔5〕Encyclopedia\n";
        menu += "〔0〕Quit\n";
        menu += "├────────────────────────────────────────┤\n";

        return menu;
    }

    public String invMenu() {
        String menu = "\n├────────────────────────────────────────┤\n";
        menu += "〔1〕Helmets\n";
        menu += "〔2〕Chestplates\n";
        menu += "〔3〕Leggings\n";
        menu += "〔4〕Boots\n";
        menu += "〔5〕Swords\n";
        menu += "〔6〕Potions\n";
        menu += "〔7〕Arrows \n";
        menu += "〔0〕Return to menu \n";
        menu += "├────────────────────────────────────────┤\n";

        return menu;
    }
}
