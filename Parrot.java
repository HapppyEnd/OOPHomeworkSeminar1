public class Parrot extends Animal {
    public Parrot(String name, int age, String color, String sex, Owner owner) {
        super(name, age, color, sex, owner);
    }

    @Override
    public String vote() {
        return super.getName() + " says Hello!";
    }

    @Override
    public String eatFood() {
        int satiety = this.getSatiety();
        this.owner.food.decreaseFood(satiety);
        return String.format("Parrot %s ate %d food.", super.getName(), satiety);
    }

    @Override
    public String move() {
        return String.format("Parrot %s going to fly.",  super.getName());
    }

    @Override
    public String sleep() {
        return String.format("Parrot %s going to sleep.",  super.getName());
    }

    public String study(){
        return String.format("Parrot %s learning to speak.",  super.getName());
    }
}
