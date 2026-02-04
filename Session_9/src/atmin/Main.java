package atmin;

public class Main {
    public static void main(String[] args) {
        AnimalVer2 animal = new Dog();

        // phương thức chung
        animal.sound();

        // phương thức riêng của Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.sound2();
        }
    }
}
