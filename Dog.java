public class Dog extends Animal {

    private String breed;

    // Constructor
    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    // Getter
    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString
    @Override
    public String toString() {
        return getAnimalName() + ", " + getOwnerName() + ", " + getAge()
                + ", This is a dog, breed: " + breed;
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) return false;

        Dog other = (Dog) obj;

        return breed.equals(other.breed);
    }
}
