public class Owner extends Human {
    protected Food food;

    public Owner(String lastName, String firstName, String address, int age, String sex) {
        super(lastName, firstName, address, age, sex);
        this.food = new Food();
    }
}
