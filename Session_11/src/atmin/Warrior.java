package atmin;

public class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Chiến binh] " + this.getName() + " tấn công " + target.getName() + "!");
        target.takeDamage(this.getAttackPower());
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[Chiến binh] " + this.getName() + " dùng chiêu cuối lên " + target.getName() + "!");
        int damage = this.getAttackPower() * 2;
        target.takeDamage(damage);

        int selfDamage = (int) (this.getHp() * 0.1);
        this.setHp(this.getHp() - selfDamage);
        System.out.println(this.getName() + " tự mất " + selfDamage + " HP do gắng sức.");
    }

    @Override
    public void takeDamage(int amount) {
        int realDamage = Math.max(amount - armor, 0);
        super.takeDamage(realDamage);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}
