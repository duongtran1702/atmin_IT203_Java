package atmin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===\n");

        List<GameCharacter> characters = new ArrayList<>();

        Warrior warrior = new Warrior("Garen", 500, 50, 20);
        Mage mage = new Mage("Lux", 300, 40, 200);
        Archer archer = new Archer("Ashe", 280, 35, 0.3, 2.0);
        Assassin assassin = new Assassin("Zed", 250, 60, 40);
        Tank tank = new Tank("Malphite", 700, 30);

        characters.add(warrior);
        characters.add(mage);
        characters.add(archer);
        characters.add(assassin);
        characters.add(tank);

        System.out.println("Đã khởi tạo "
                + GameCharacter.count
                + " nhân vật tham gia đấu trường.\n");

        // ===== Combat lượt 1 =====

        warrior.attack(assassin);
        System.out.println();

        mage.attack(tank);
        System.out.println();

        archer.attack(warrior);
        System.out.println();

        assassin.attack(mage);
        System.out.println();

        tank.attack(archer);
        System.out.println();

        // ===== Dùng chiêu cuối =====

        System.out.println("=== KÍCH HOẠT CHIÊU CUỐI ===\n");

        warrior.useUltimate(tank);
        System.out.println();

        mage.useUltimate(warrior);
        System.out.println();

        archer.useUltimate(assassin);
        System.out.println();

        assassin.useUltimate(mage);
        System.out.println();

        tank.useUltimate(null); // tank không cần target
        System.out.println();

        // ===== Thông số cuối =====

        System.out.println("=== THÔNG SỐ SAU TRẬN ĐẤU ===");

        for (GameCharacter c : characters) {
            c.displayInfo();
        }

        System.out.println("\nTổng số nhân vật đã tạo: "
                + GameCharacter.count);
    }
}