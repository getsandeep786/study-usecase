package poly;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound(); // Output: The animal makes a sound
        animal2.makeSound(); // Output: The dog barks
        animal3.makeSound(); // Output: The cat meows
    }

}
