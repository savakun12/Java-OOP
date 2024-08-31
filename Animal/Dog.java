// Kelas dog mewarisi dari kelas animal
public class Dog extends Animal{
    private String breed;

    // constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Getter dan Setter untuk breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Overriding methid makeSound dari kelas induk
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
    
}
