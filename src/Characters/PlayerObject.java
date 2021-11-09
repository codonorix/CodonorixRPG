package Characters;

import Items.Boots.bootsConstructor;
import Items.Chestplates.chestplateConstructor;
import Items.Helmets.helmetConstructor;
import Items.Leggings.leggingsConstructor;
import Colours.colourList;

import java.util.ArrayList;

public class PlayerObject {
    private String name;
    private int level;
    private int hp;
    private int mana;
    private int damage;
    private int money;
    private double xpTotal;
    private double xpLevelUpReq;
    private String helmet;
    private String chestPlate;
    private String leggings;
    private String boots;
    private String sword;
    private String bow;
    private ArrayList<helmetConstructor> helmentSet;
    private ArrayList<chestplateConstructor> chestPlateSet;
    private ArrayList<leggingsConstructor> leggingSet;
    private ArrayList<bootsConstructor> bootSet;
    private ArrayList<String> swordSet;
    private ArrayList<String> bowSet;
    private ArrayList<String> potions;
    private int arrows;
    /*
    Xp is calculated using the following formula

    (level * 10) + xpLevelUpReq

    Mod defeat XP drop
    40% of player level
     */
    public PlayerObject(String name, int level, int hp, int mana, int damage, int money, double xpTotal, double xpLevelUpReq,
                        String helmet, String chestPlate,
                        String leggings, String boots, String sword, String bow,
                        ArrayList<helmetConstructor> helmentSet,
                        ArrayList<chestplateConstructor> chestPlateSet,
                        ArrayList<leggingsConstructor> leggingSet,
                        ArrayList<bootsConstructor> bootSet,
                        ArrayList<String> swordSet,
                        ArrayList<String> bowSet,
                        ArrayList<String> potions,
                        int arrows) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
        this.damage = damage;
        this.money = money;
        this.xpTotal = xpTotal;
        this.xpLevelUpReq = xpLevelUpReq;
        this.helmet = helmet;
        this.chestPlate = chestPlate;
        this.leggings = leggings;
        this.boots = boots;
        this.sword = sword;
        this.bow = bow;
        this.helmentSet = helmentSet;
        this.chestPlateSet = chestPlateSet;
        this.leggingSet = leggingSet;
        this.bootSet = bootSet;
        this.swordSet = swordSet;
        this.bowSet = bowSet;
        this.potions = potions;
        this.arrows = arrows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getXpTotal() {
        return xpTotal;
    }

    public void setXpTotal(double xpTotal) {
        this.xpTotal = xpTotal;
    }

    public double getXpLevelUpReq() {
        return xpLevelUpReq;
    }

    public void setXpLevelUpReq(double xpLevelUpReq) {
        this.xpLevelUpReq = xpLevelUpReq;
    }

    public String getHelmet() {
        return helmet;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public String getChestPlate() {
        return chestPlate;
    }

    public void setChestPlate(String chestPlate) {
        this.chestPlate = chestPlate;
    }

    public String getLeggings() {
        return leggings;
    }

    public void setLeggings(String leggings) {
        this.leggings = leggings;
    }

    public String getBoots() {
        return boots;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getBow() {
        return bow;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }

    public ArrayList<helmetConstructor> getHelmentSet() {
        return helmentSet;
    }

    public void setHelmentSet(ArrayList<helmetConstructor> helmentSet) {
        this.helmentSet = helmentSet;
    }

    public ArrayList<chestplateConstructor> getChestPlateSet() {
        return chestPlateSet;
    }

    public void setChestPlateSet(ArrayList<chestplateConstructor> chestPlateSet) {
        this.chestPlateSet = chestPlateSet;
    }

    public ArrayList<leggingsConstructor> getLeggingSet() {
        return leggingSet;
    }

    public void setLeggingSet(ArrayList<leggingsConstructor> leggingSet) {
        this.leggingSet = leggingSet;
    }

    public ArrayList<bootsConstructor> getBootSet() {
        return bootSet;
    }

    public void setBootSet(ArrayList<bootsConstructor> bootSet) {
        this.bootSet = bootSet;
    }

    public ArrayList<String> getSwordSet() {
        return swordSet;
    }

    public void setSwordSet(ArrayList<String> swordSet) {
        this.swordSet = swordSet;
    }

    public ArrayList<String> getBowSet() {
        return bowSet;
    }

    public void setBowSet(ArrayList<String> bowSet) {
        this.bowSet = bowSet;
    }

    public ArrayList<String> getPotions() {
        return potions;
    }

    public void setPotions(ArrayList<String> potions) {
        this.potions = potions;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String toString() {
        String output = "├────────│ CHARACTER INFORMATION │────────┤\n";
        output += "〔" + colourList.PURPLE + "ツ" + colourList.RESET + "〕Name\t: " + getName() + "\n";
        output += "〔" + colourList.GREEN + "∞" + colourList.RESET + "〕Level\t: " + getLevel() + "\n";
        output += "〔" + colourList.RED + "♥" + colourList.RESET + "〕HP\t\t: " + getHp() + "\n";
        output += "〔" + colourList.CYAN + "✯" + colourList.RESET + "〕Mana\t: " + getMana() + "\n";
        output += "〔" + colourList.YELLOW + "⛃" + colourList.RESET + "〕Money\t: " + getMoney() + "\n";
        output += "├─────────│ ARMOUR INFORMATION │─────────┤\n";
        output += "〔" + colourList.BLUE + "⛑" + colourList.RESET + "〕Helmet\t\t: " + getHelmet() + "\n";
        output += "〔" + colourList.BLUE + "\uD83E\uDDBA" + colourList.RESET + "〕Chestplate : " + getChestPlate() + "\n";
        output += "〔" + colourList.BLUE + "\uD83D\uDC56" + colourList.RESET + "〕Leggings\t: " + getLeggings() + "\n";
        output += "〔" + colourList.BLUE + "\uD83E\uDD7E" + colourList.RESET + "〕Boots\t\t: " + getBoots() + "\n";
        output += "├─────────│ WEAPON INFORMATION │─────────┤\n";
        output += "〔" + colourList.RED + "\uD83D\uDDE1" + colourList.RESET + "〕Sword\t: " + getSword() + "\n";
        output += "〔" + colourList.RED + "\uD83C\uDFF9" + colourList.RESET + "〕Bow\t: " + getBow() + "\n";
        output += "├────────────────────────────────────────┤\n";

        return output;
    }
}
