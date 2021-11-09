package Items.Armour;

public class armorConstructor {
    private final String name;
    private final String desc;
    private final String type;
    private final int levelReq;
    private final int hpIncrease;
    private final int mpIncrease;
    private final String rarity;
    private final int sellPrice;

    public armorConstructor(String name, String desc, String type, int levelReq, int hpIncrease, int mpIncrease, String rarity, int sellPrice) {
        this.name = name;
        this.desc = desc;
        this.type = type;
        this.levelReq = levelReq;
        this.hpIncrease = hpIncrease;
        this.mpIncrease = mpIncrease;
        this.rarity = rarity;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public int getLevelReq() {
        return levelReq;
    }

    public int getHpIncrease() {
        return hpIncrease;
    }

    public int getMpIncrease() {
        return mpIncrease;
    }

    public String getRarity() {
        return rarity;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
