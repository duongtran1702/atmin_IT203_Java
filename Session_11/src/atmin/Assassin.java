package atmin;

import java.util.Random;

public class Assassin extends GameCharacter implements ISkill {

    private int critChance; // %

    public Assassin(String name, int hp, int attackPower, int critChance) {
        super(name, hp, attackPower);
        this.critChance = critChance;
    }

    @Override
    public void attack(GameCharacter target) {
        Random rd = new Random();
        int damage = getAttackPower();

        if (rd.nextInt(100) < critChance) {
            damage *= 2;
            System.out.println("[Sát thủ] " + getName() + " chí mạng!");
        }

        target.takeDamage(damage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        int damage = getAttackPower() * 3;
        System.out.println("[Sát thủ] " + getName() + " tung Tuyệt Ảnh Sát!");
        target.takeDamage(damage);
    }
}