public class Dog extends Animal {

    public Dog(String name, int age, String color, String sex, Owner owner) {
        super(name, age, color, sex, owner);
    }

    @Override
    public String vote() {
        return super.getName() + " says Gav-gav!";
    }

    @Override
    public String eatFood() {
        int satiety = this.getSatiety();
        this.owner.food.decreaseFood(satiety);
        return String.format("Dog %s ate %d food.", super.getName(), satiety);
    }

    @Override
    public String move() {
        return String.format("Dog %s go for a walk.", super.getName());
    }

    @Override
    public String sleep() {
        return String.format("Dog %s going to sleep.", super.getName());
    }

    public String learnCommands() {
        return String.format("Dog %s teaches commands.", super.getName());
    }
}
