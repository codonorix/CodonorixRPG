package Characters.Monsters;

public class MonsterConstructor {
    String name;
    String desc;
    int hp;
    String type;
    String skillOne;
    String skillTwo;
    String skillThree;
    String skillFour;

    public MonsterConstructor(String name, String desc, int hp, String type, String skillOne, String skillTwo, String skillThree, String skillFour) {
        this.name = name;
        this.desc = desc;
        this.hp = hp;
        this.type = type;
        this.skillOne = skillOne;
        this.skillTwo = skillTwo;
        this.skillThree = skillThree;
        this.skillFour = skillFour;
    }

    public MonsterConstructor(String name, String desc, int hp, String type, String skillOne, String skillTwo, String skillThree) {
        this.name = name;
        this.desc = desc;
        this.hp = hp;
        this.type = type;
        this.skillOne = skillOne;
        this.skillTwo = skillTwo;
        this.skillThree = skillThree;
    }

    public MonsterConstructor(String name, String desc, int hp, String type, String skillOne, String skillTwo) {
        this.name = name;
        this.desc = desc;
        this.hp = hp;
        this.type = type;
        this.skillOne = skillOne;
        this.skillTwo = skillTwo;
    }

    public MonsterConstructor(String name, String desc, int hp, String type, String skillOne) {
        this.name = name;
        this.desc = desc;
        this.hp = hp;
        this.type = type;
        this.skillOne = skillOne;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSkillOne() {
        return skillOne;
    }

    public void setSkillOne(String skillOne) {
        this.skillOne = skillOne;
    }

    public String getSkillTwo() {
        return skillTwo;
    }

    public void setSkillTwo(String skillTwo) {
        this.skillTwo = skillTwo;
    }

    public String getSkillThree() {
        return skillThree;
    }

    public void setSkillThree(String skillThree) {
        this.skillThree = skillThree;
    }

    public String getSkillFour() {
        return skillFour;
    }

    public void setSkillFour(String skillFour) {
        this.skillFour = skillFour;
    }
}
