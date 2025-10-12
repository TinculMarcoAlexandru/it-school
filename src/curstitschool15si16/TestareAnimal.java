package curstitschool15si16;

public class TestareAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal wolf = new Wolf();

        System.out.println("Dog sound:");
        dog.sound();

        System.out.println("Cat sound:");
        cat.sound();

        System.out.println("Wolf sound:");
        wolf.sound();
    }
}


