// Kelas dasar yang mewakili hewan
public class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter dan Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method umum
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }

    @Override
    public String toString() {
        return "Name: " + name + ",Age: " + age;
    }
}
