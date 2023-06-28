import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class Human {
    private String lastName;
    private String firstName;
    private String address;
    private int age;
    private String sex;
    private List<String> sexList = Arrays.asList("Male", "Female");

    public Human(
            String lastName, String firstName, String address, int age, String sex) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        if (!sexList.contains(sex)) {
            throw new NoSuchElementException("Specify gender: Male or Female.");
        }
        this.lastName = prettyPrint(lastName);
        this.firstName = prettyPrint(firstName);
        this.address = address;
        this.age = age;
        this.sex = sex;
    }

    public String getFullName() {
        return this.lastName + " " + this.firstName;
    }

    public String getAddress() {
        return this.address;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }

    private String prettyPrint(String string) {
        return (string.substring(0, 1).toUpperCase() + 
                string.substring(1).toLowerCase());
    }
}
