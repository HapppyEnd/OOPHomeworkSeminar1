import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        try {
            Owner ivanov = new Owner("ivanoV", "IVAN", "null", 30, "Male");
            Owner petrova = new Owner("petrova", "anna", "null", 21, "Female");

            Animal cat1 = new Cat("Anfisa", 8, "Grey", "Female", petrova);
            Animal cat2 = new Cat("Jack", 5, "White", "Male", petrova);
            Animal dog1 = new Dog("Roxi", 2, "Brown", "Female", petrova);
            Animal dog2 = new Dog("Ales", 3, "Black", "Male", ivanov);
            Animal cavy = new Cavy("Mashka", 1, "Black", "Female", ivanov);
            Animal parrot = new Parrot("Kesha", 15, "Blue", "Male", ivanov);

            System.out.println();
            animals.add(cat1);
            animals.add(cat2);
            animals.add(dog1);
            animals.add(dog2);
            animals.add(cavy);
            animals.add(parrot);
            for (Animal animal : animals) {
                System.out.println(String.format(
                        "The owner %s has a new pet named %s", animal.owner.getFullName(), animal.getName()));
                System.out.println(animal.eatFood());
                System.out.println(String.format(
                        "Owner: %s. Food: %d", animal.owner.getFullName(), animal.owner.food.getFood()));
                System.out.println(animal.vote());
                System.out.println("------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}