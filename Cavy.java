public class Cavy extends Animal{

    public Cavy(String name, int age, String color, String sex, Owner owner) {
        super(name, age, color, sex, owner);
    }

    @Override
    public String vote() {
        return super.getName() + " says Pi-pi-pi!";
    }

    @Override
    public String eatFood() {
        int satiety = this.getSatiety();
        this.owner.food.decreaseFood(satiety);
        return String.format("Cavy %s ate %d food.", super.getName(), satiety);
    }

    @Override
    public String move() {
        return super.getName() + " go for a walk.";
    }

    @Override
    public String sleep() {
        return super.getName() + " go to sleep.";
    }
}

