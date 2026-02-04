package atmin;

public class Cat extends AnimalVer2 {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        AnimalVer2 a1 = new Dog();
        AnimalVer2 a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}

