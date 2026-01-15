class Animal {
    void speak() {
        System.out.println("The animal says roar");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("The dog says woof");
    }
}

class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat says meow");
    }
}

public class AnimalPolymorphism {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.speak();

        Animal d = new Dog();
        d.speak();

        Animal c = new Cat();
        c.speak();
    }
}
