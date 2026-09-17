abstract class Bird {

    abstract void fly();
    abstract void eat();
}

class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow is eating");
    }
}

public class ABSTRACTBird {

    public static void main(String[] args) {

        Bird b = new Sparrow();

        b.eat();
        b.fly();
    }
}



