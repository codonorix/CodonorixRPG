package Characters.Monsters.Air;

import Characters.Monsters.MonsterConstructor;
import Characters.PlayerObject;
import Colours.colourList;

import java.util.Random;

/*
 String icon = "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.RED + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.RED + "■" + colourList.RED + "⬛" + colourList.RED + "■" + colourList.BLACK + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.RED + "■" + colourList.RED + "⬛" + colourList.RED + "■" + colourList.BLACK + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.RED + "■" + colourList.RED + "⬛" + colourList.RED + "■" + colourList.BLACK + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "⬛" + colourList.RED + "■" + colourList.RED + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "⬛" + colourList.RED + "■" + colourList.RED + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLUE + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "⬛" + colourList.RED + "■" + colourList.RED + "■" + "\n";
        icon += colourList.YELLOW + "⬛" + colourList.YELLOW + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "■" + colourList.RED + "⬛" + colourList.RED + "■" + colourList.BLACK + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + "\n";
        icon += colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "■" + colourList.BLACK + "⬛" + colourList.BLACK + "■" + colourList.BLACK + "■" + "\n";
 */
public class airAbilities {
    public void flightAttack(MonsterConstructor monster, PlayerObject player) {
        Random rand = new Random();

        String monsterName = monster.getName();
        String playerName = player.getName();

        int monsterHP = monster.getHp();
        double playerHP = player.getHp();

        //The extra damage is calculated by getting the max player HP subtracting 70% of that damage
        double extraDamage = rand.nextInt((int)playerHP - (int)(playerHP / 100) * 70);
        double damage;

        String output = "\n├────────────────────────────────────────┤\n";
        output += "\n";
        output += "\t\t\t【FLIGHT ATTACK】\n";
        output += "\n";
        output += "\t【" + playerName + "】\t\tVS\t\t【" + monsterName + "】\n";
        output += "\n";
        output += "\t\t" + playerHP + "\t\t\t\t\t\t" + monsterHP + "\n";
        output += "├────────────────────────────────────────┤\n";

        System.out.println(output);

        damage = ((playerHP / 100)*20) + extraDamage;
        System.out.println(damage);

        player.setHp(playerHP - damage);
    }
    public void wingSlash(MonsterConstructor monster, PlayerObject player) {

    }
    public void diveBomb(MonsterConstructor monster, PlayerObject player) {

    }
    public void grabAndDrop(MonsterConstructor monster, PlayerObject player) {

    }
    public void magicWind(MonsterConstructor monster, PlayerObject player) {

    }
}
