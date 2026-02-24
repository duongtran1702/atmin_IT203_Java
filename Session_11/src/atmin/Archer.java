package atmin;

import java.util.Random;

public class Archer extends GameCharacter implements ISkill {

    private double critChance;      // % chí mạng (vd: 0.3 = 30%)
    private double critMultiplier;  // hệ số chí mạng (vd: 2.0 = gấp đôi)
    private Random random = new Random();

    public Archer(String name, int hp, int attackPower,
                  double critChance, double critMultiplier) {
        super(name, hp, attackPower);
        this.critChance = critChance;
        this.critMultiplier = critMultiplier;
    }

    @Override
    public void attack(GameCharacter target) {

        double roll = random.nextDouble();
        int damage = getAttackPower();

        if (roll < critChance) {
            damage = (int)(damage * critMultiplier);
            System.out.println("[Xạ thủ] " + getName() +
                    " bắn CHÍ MẠNG vào " + target.getName() +
                    "! Gây " + damage + " sát thương!");
        } else {
            System.out.println("[Xạ thủ] " + getName() +
                    " bắn vào " + target.getName() +
                    ". Gây " + damage + " sát thương.");
        }

        target.takeDamage(damage);
    }

    @Override
    public void useUltimate(GameCharacter target) {

        System.out.println("[Xạ thủ] " + getName() +
                " dùng chiêu cuối: Mưa tên!");

        for (int i = 1; i <= 3; i++) {
            System.out.println("   -> Phát bắn thứ " + i);
            target.takeDamage(getAttackPower());
        }
    }
}