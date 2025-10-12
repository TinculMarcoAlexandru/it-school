package curstitschool15si16;

public class Animal {
    public void sound() {
        System.out.println("animal makes sounds");

    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bark");
    }
}


class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

class Wolf extends Animal {
    @Override
    public void sound() {
        System.out.println("how");
    }
}