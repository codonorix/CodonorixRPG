package Items.Helmets;

import Items.Armour.armorConstructor;
import Items.raritySelector;

public class helmetConstructor extends armorConstructor {
    public helmetConstructor(String name, String desc, String type, int levelReq, int hpIncrease, int mpIncrease, String rarity, int sellPrice) {
        super(name, desc, type, levelReq, hpIncrease, mpIncrease, rarity, sellPrice);
    }

    public String toString() {
        Items.raritySelector itemRarity = new raritySelector();

        String output = "├────────────│ " + getName() + "〔" + getLevelReq() + "〕" + "│────────────┤\n";
        output += "\n";
        output += getDesc();
        output += "\n";
        output += "├────────────────────────────────────────┤\n";
        output += "〔♥〕HP Increase\t\t: " + getHpIncrease() + "\n";
        output += "〔✯〕MP Increase\t: " + getMpIncrease() + "\n";
        output += "〔\uD83E\uDE99〕Sell Price\t\t: " + getSellPrice() + "\n";
        output += "\n";
        output += itemRarity.rarityGetter(getRarity(), getType()) + "\n";
        output += "├────────────────────────────────────────┤\n";

        return output;
    }
}
