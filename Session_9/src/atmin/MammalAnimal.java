package atmin;

import java.util.Scanner;

public class MammalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mammalSound;

    public MammalAnimal() {
    }

    public MammalAnimal(String name, int legs, String furColor, Integer life,
                        String foodType, boolean isLiveWithHuman, String mammalSound) {
        super(name, legs, furColor, life);
        this.isLiveWithHuman = isLiveWithHuman;
        this.mammalSound = mammalSound;
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMammalSound() {
        return mammalSound;
    }

    public void setMammalSound(String mammalSound) {
        this.mammalSound = mammalSound;
    }

    @Override
    public void display() {
        System.out.println("Animal name: " + getAnimalName());
        System.out.println("Number of legs: " + getNumberOfLegs());
        System.out.println("Fur color: " + getFurColor());
        System.out.println("Average life expectancy: " + getEverageLifeExpectancy());

        System.out.println("Food type: " + foodType);
        System.out.println("Live with human: " + (isLiveWithHuman ? "Yes" : "No"));
        System.out.println("Mammal sound: " + mammalSound);
    }

    @Override
    public void input() {
        super.input(); // nhập các thuộc tính chung của Animal

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food type: ");
        foodType = sc.nextLine();

        System.out.print("Does it live with humans? (true/false): ");
        isLiveWithHuman = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Enter mammal sound: ");
        mammalSound = sc.nextLine();
    }


}
