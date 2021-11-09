package Items;

import Colours.colourList;

public class raritySelector {
    public String rarityGetter(String rarity, String type) {
        if(rarity.equals("COMMON")) {
            return "\t\t\t\t" + colourList.COMMONBOLD + rarity + " " + type +  colourList.RESET;
        }else if(rarity.equals("RARE")) {
            return "\t\t\t\t" + colourList.RAREBOLD + rarity + " " + type + colourList.RESET;
        }else if(rarity.equals("EPIC")) {
            return "\t\t\t\t" + colourList.EPICBOLD + rarity + " " + type +  colourList.RESET;
        }else if(rarity.equals("LEGENDARY")) {
            return "\t\t\t\t" + colourList.LEGENDARYBOLD + rarity + " " + type +  colourList.RESET;
        }else if(rarity.equals("MYTHIC")) {
            return "\t\t\t\t" + colourList.MYTHICBOLD + rarity + " " + type +  colourList.RESET;
        }
        return null;
    }
}
