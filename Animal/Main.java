public class Main {
    public static void main(String[] args) {
        // Membuat objek dog
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        System.out.println(dog);
        dog.makeSound();

        // membuat objek cat
        Cat cat = new Cat("Whiskas", 2, "Black");
        System.out.println(cat);
        cat.makeSound();

        // Menggunakan polimorfisme
        Animal myAnimal = new Dog("Max", 5, "Bulldog");
        myAnimal.makeSound();
    }
}
