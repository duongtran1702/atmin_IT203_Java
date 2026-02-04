package atmin;

public class Zoo {
    public static void main(String[] args) {

        // Khai báo và khởi tạo đối tượng BirdAnimal
        Animal bird = new Bird();
        bird.input();
        bird.display();

        System.out.println("--------------------");

        // Khai báo và khởi tạo đối tượng MammalAnimal
        Animal mammal = new MammalAnimal();
        mammal.input();
        mammal.display();
    }
}
