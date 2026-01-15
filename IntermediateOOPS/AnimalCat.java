class Animal {
    String name;
    int age;
    String species;

    Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
}

class Cat extends Animal {
    String color;
    int numLives;
    
    Cat(String name, int age, String species, String color, int numLives) {
        super(name, age, species);
        this.color = color;
        this.numLives = numLives;
    }
    void catDetails() {
        System.out.println("Cat Details : ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Species : " + species);
        System.out.println("Color : " + color);
        System.out.println("Num Lives : " + numLives);
    }
}

public class AnimalCat {
    public static void main(String[] args) {

        Cat c = new Cat("Whiskers", 3, "Feline", "Gray", 9);

        c.catDetails();
    }
}
