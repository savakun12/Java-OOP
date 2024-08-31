// Kelas cat mewarisi dari kelas animal
public class Cat extends Animal {
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // overriding metthod makesound dari kelas induk 
    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }

    @Override
    public String toString() {
        return super.toString() + ", Color: " + color;
    }
}
