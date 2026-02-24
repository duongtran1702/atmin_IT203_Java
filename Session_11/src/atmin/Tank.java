package atmin;

public class Tank extends GameCharacter implements ISkill {

    private int shield;

    public Tank(String name, int hp, int attackPower) {
        super(name, hp, attackPower);
        this.shield = 0;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Tank] " + getName() + " đập mạnh!");
        target.takeDamage(getAttackPower());
    }

    @Override
    public void useUltimate(GameCharacter target) {
        shield += 50;
        System.out.println("[Tank] " + getName() + " kích hoạt Khiên Bất Diệt (+50 shield)!");
    }

    @Override
    public void takeDamage(int amount) {
        if (shield > 0) {
            int absorbed = Math.min(shield, amount);
            shield -= absorbed;
            amount -= absorbed;
        }
        super.takeDamage(amount);
    }
}