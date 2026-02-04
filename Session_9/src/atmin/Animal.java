package atmin;

import java.util.Scanner;

public abstract class Animal {
    private String animalName;
    private Integer numberOfLegs;
    private String furColor;
    private Integer averageLifeExpectancy;

    public Animal() {
    }

    public Animal(String animalName, Integer numberOfLegs, String furColor, Integer averageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.averageLifeExpectancy = averageLifeExpectancy;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setNumberOfLegs(Integer numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setEverageLifeExpectancy(Integer everageLifeExpectancy) {
        this.averageLifeExpectancy = everageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public Integer getEverageLifeExpectancy() {
        return averageLifeExpectancy;
    }

    public abstract void display();

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter animal name: ");
        this.animalName = input.nextLine();
        System.out.print("Enter number of legs: ");
        this.numberOfLegs = Integer.parseInt(input.nextLine());
        System.out.print("Enter fur color: ");
        this.furColor = input.nextLine();
        System.out.print("Enter average life expectancy: ");
        this.averageLifeExpectancy = Integer.parseInt(input.nextLine());
    }

}
