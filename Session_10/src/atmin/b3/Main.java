package atmin.b3;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck("Donald");
        Fish fish = new Fish("Nemo");

        duck.swim();
        duck.fly();

        System.out.println();

        fish.swim();
    }
}