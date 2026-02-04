package atmin;

import java.util.Scanner;

public class Bird extends Animal {
    private boolean isFly;
    private String birdSound;

    public Bird() {
        super();
    }

    public Bird(String name, int legs, String furColor, Integer life, boolean fly, String birdSound) {
        super(name, legs, furColor, life);
        this.isFly = fly;
        this.birdSound = birdSound;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    public boolean isFly() {
        return isFly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    @Override
    public void display() {
        System.out.println("Animal name: " + getAnimalName());
        System.out.println("Number of legs: " + getNumberOfLegs());
        System.out.println("Fur color: " + getFurColor());
        System.out.println("Average life expectancy: " + getEverageLifeExpectancy());
    }

    @Override
    public void input() {
        super.input(); // nhập các thuộc tính chung

        Scanner sc = new Scanner(System.in);
        System.out.print("Can bird fly (true/false): ");
        isFly = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Bird sound: ");
        birdSound = sc.nextLine();
    }


}
