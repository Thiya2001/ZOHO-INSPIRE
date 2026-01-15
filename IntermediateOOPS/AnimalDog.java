class Animal {
    String name;
    int age;
    String species;
}

class Dog extends Animal {
    String breed;
    String color;
}

public class AnimalDog {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.name = "Bruno";
        d.age = 3;
        d.species = "Dog";

        d.breed = "Labrador";
        d.color = "Black";

        System.out.println("Animal Name : " + d.name);
        System.out.println("Age : " + d.age);
        System.out.println("Species : " + d.species);
        System.out.println("Breed : " + d.breed);
        System.out.println("Color : " + d.color);
    }
}
