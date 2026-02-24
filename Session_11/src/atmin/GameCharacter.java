package atmin;

public abstract class GameCharacter {
    static int count = 0;
    protected String name;
    protected int hp;
    protected int attackPower;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục!");
        } else {
            System.out.println(name + " mất " + amount + " máu, còn lại " + hp + " HP.");
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name + " - Hp: " + hp + " - attack power: " + attackPower);
    }
}

